package com.xfinity.simpsonsviewer.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.xfinity.simpsonsviewer.R;

import java.util.List;

import xfinity.com.model.network.model.RelatedTopic;

public class SimpsActivity extends AppCompatActivity implements SimpsMvpView {

    RecyclerView mRecyclerView;
    SimpsAdapter simpsAdapter;
    LinearLayoutManager linearLayoutManager;

    SimpsPresenter simpsCharViewerPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

    }

    public void init(){
        mRecyclerView = findViewById(R.id.recyclerView);

        simpsCharViewerPresenter = new SimpsPresenter(getApplicationContext(), this);
        simpsCharViewerPresenter.getSimpsonsCharacterViewer();
    }

    @Override
    public void showSimpsCharViewer(List<RelatedTopic> relatedTopics) {
        simpsAdapter = new SimpsAdapter(getApplicationContext(), relatedTopics);
        linearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setAdapter(simpsAdapter);
    }
}
