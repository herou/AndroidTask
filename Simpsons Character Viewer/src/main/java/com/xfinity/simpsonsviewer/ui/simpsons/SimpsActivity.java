package com.xfinity.simpsonsviewer.ui.simpsons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.kennyc.view.MultiStateView;
import com.xfinity.simpsonsviewer.R;
import xfinity.com.utils.Constants;
import xfinity.com.utils.Util;
import java.util.List;
import xfinity.com.model.network.model.RelatedTopic;

public class SimpsActivity extends AppCompatActivity implements SimpsMvpView, MultiStateView.StateListener {

    RecyclerView mRecyclerView;
    SimpsAdapter simpsAdapter;
    LinearLayoutManager linearLayoutManager;

    SimpsPresenter simpsCharViewerPresenter;

    MultiStateView mMultiStateView;

    List<RelatedTopic> relatedTopicList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simps);

        init();
        onErrorStateClick();
    }

    public void init(){
        mMultiStateView = findViewById(R.id.multiStateView);
        mRecyclerView = findViewById(R.id.recyclerView);

        simpsCharViewerPresenter = new SimpsPresenter(getApplicationContext(), this);
        simpsCharViewerPresenter.getSimpsonsCharacterViewer();
    }

    public void onErrorStateClick(){
        mMultiStateView.setStateListener(this);
        mMultiStateView.getView(MultiStateView.VIEW_STATE_ERROR).findViewById(R.id.retry)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        simpsCharViewerPresenter.getSimpsonsCharacterViewer();
                    }
                });
    }

    @Override
    public void showSimpsCharViewer(List<RelatedTopic> relatedTopics) {
        relatedTopicList = relatedTopics;
        setLinearLayoutManager();
    }

    @Override
    public void onStateChanged(int i) {

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
        if(Util.checkIfMobilePhone(SimpsActivity.this) == true){
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
        simpsAdapter = new SimpsAdapter(getApplicationContext(), relatedTopicList,SimpsActivity.this);
        linearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setAdapter(simpsAdapter);
    }

    public void setGridLayoutManager(){
        simpsAdapter = new SimpsAdapter(getApplicationContext(), relatedTopicList,SimpsActivity.this);
        mRecyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setAdapter(simpsAdapter);
        simpsAdapter.notifyDataSetChanged();
    }

}
