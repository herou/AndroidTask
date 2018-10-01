package com.xfinity.simpsonsviewer.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.xfinity.simpsonsviewer.R;

public class SimpsCharViewerActivity extends AppCompatActivity {

    SimpsCharViewerPresenter simpsCharViewerPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        simpsCharViewerPresenter = new SimpsCharViewerPresenter(getApplicationContext(), this);
        simpsCharViewerPresenter.getSimpsonsCharacterViewer();

    }
}
