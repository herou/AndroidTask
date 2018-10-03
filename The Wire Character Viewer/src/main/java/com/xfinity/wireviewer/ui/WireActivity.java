package com.xfinity.wireviewer.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.kennyc.view.MultiStateView;
import com.xfinity.wireviewer.R;
import java.util.List;
import xfinity.com.model.network.model.RelatedTopic;
import xfinity.com.utils.Constants;
import xfinity.com.utils.Util;

public class WireActivity extends AppCompatActivity implements WireMvpView, MultiStateView.StateListener{

    RecyclerView mRecyclerView;
    WireAdapter wireAdapter;
    LinearLayoutManager linearLayoutManager;

    WirePresenter wirePresenter;

    MultiStateView mMultiStateView;

    List<RelatedTopic> relatedTopicList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        onErrorStateClick();


    }


    public void init(){
        mMultiStateView = findViewById(R.id.multiStateView);
        mRecyclerView = findViewById(R.id.recyclerView);

        wirePresenter = new WirePresenter(getApplicationContext(), this);
        wirePresenter.getWireCharacterViewer();
    }

    public void onErrorStateClick(){
        mMultiStateView.setStateListener(this);
        mMultiStateView.getView(MultiStateView.VIEW_STATE_ERROR).findViewById(R.id.retry)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        wirePresenter.getWireCharacterViewer();
                    }
                });
    }

    @Override
    public void onStateChanged(int i) {

    }

    @Override
    public void showWireViewer(List<RelatedTopic> relatedTopics) {
        relatedTopicList = relatedTopics;
        setLinearLayoutManager();
    }

    @Override
    public void viewStateLoading() {
        mMultiStateView.setViewState(MultiStateView.VIEW_STATE_LOADING);
    }

    @Override
    public void viewStateError() {
        mMultiStateView.setViewState(MultiStateView.VIEW_STATE_ERROR);
    }

    @Override
    public void viewState() {
        mMultiStateView.setViewState(MultiStateView.VIEW_STATE_CONTENT);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if(Util.checkIfMobilePhone(WireActivity.this) == true){
            getMenuInflater().inflate(R.menu.menu, menu);
        }
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.menu_list){
            Constants.LINEAR = true;
            setLinearLayoutManager();
        }else if(id == R.id.menu_grid){
            Constants.LINEAR = false;
            setGridLayoutManager();
        }
        return super.onOptionsItemSelected(item);
    }

    public void setLinearLayoutManager(){
        wireAdapter = new WireAdapter(getApplicationContext(), relatedTopicList,WireActivity.this);
        linearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setAdapter(wireAdapter);
    }

    public void setGridLayoutManager(){
        wireAdapter = new WireAdapter(getApplicationContext(), relatedTopicList,WireActivity.this);
        mRecyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setAdapter(wireAdapter);
        wireAdapter.notifyDataSetChanged();
    }

}
