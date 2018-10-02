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
import com.xfinity.simpsonsviewer.utils.Util;

import java.util.List;

import xfinity.com.model.network.model.RelatedTopic;

public class SimpsActivity extends AppCompatActivity implements SimpsMvpView, MultiStateView.StateListener {

    RecyclerView mRecyclerView;
    SimpsAdapter simpsAdapter;
    LinearLayoutManager linearLayoutManager;

    SimpsPresenter simpsCharViewerPresenter;

    MultiStateView mMultiStateView;

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
        simpsAdapter = new SimpsAdapter(getApplicationContext(), relatedTopics);
        linearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setAdapter(simpsAdapter);
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
            mRecyclerView.setLayoutManager(linearLayoutManager);
            mRecyclerView.setHasFixedSize(true);
            mRecyclerView.setAdapter(simpsAdapter);
        }else if(id == R.id.menu_grid){
            mRecyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
            mRecyclerView.setHasFixedSize(true);
            mRecyclerView.setAdapter(simpsAdapter);
        }
        return super.onOptionsItemSelected(item);
    }

}
