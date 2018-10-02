package com.xfinity.simpsonsviewer.ui.simpsons;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.xfinity.simpsonsviewer.R;
import com.xfinity.simpsonsviewer.ui.simpsons_detail.SimpsDetailActivity;
import com.xfinity.simpsonsviewer.utils.Constants;
import com.xfinity.simpsonsviewer.utils.Util;

import java.util.List;

import xfinity.com.model.network.model.RelatedTopic;


public class SimpsAdapter extends RecyclerView.Adapter<SimpsAdapter.ViewHolder> {

    List<RelatedTopic> feedItemList;
    private Context context;

    public SimpsAdapter(Context context,  List<RelatedTopic> feedItemList) {
        this.context = context;
        this.feedItemList = feedItemList;
    }

    @Override
    public SimpsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.simps_adapter, parent, false);

        return new SimpsAdapter.ViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(final SimpsAdapter.ViewHolder holder, int position) {
        final RelatedTopic relatedTopic = feedItemList.get(position);

        holder.txt_title.setText(Util.splitString(relatedTopic.getText().toString(),0));
        holder.txt_desc.setText(Util.splitString(relatedTopic.getText().toString(),1));

        holder.card_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(context, SimpsDetailActivity.class);
                myIntent.putExtra(Constants.TITLE,Util.splitString(relatedTopic.getText().toString(),0));
                myIntent.putExtra(Constants.DESC, Util.splitString(relatedTopic.getText().toString(),1));
                myIntent.putExtra(Constants.ICON_URL, relatedTopic.getIcon().getURL().toString());
                context.startActivity(myIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return (null != feedItemList ? feedItemList.size() : 0);

    }


    public static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView txt_title;
        private TextView txt_desc;
        private CardView card_view;

        public ViewHolder(View itemView) {
            super(itemView);
            txt_title = itemView.findViewById(R.id.txt_title);
            txt_desc = itemView.findViewById(R.id.txt_desc);
            card_view = itemView.findViewById(R.id.card_view);
        }
    }
}

