package com.xfinity.wireviewer.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.xfinity.wireviewer.R;

public class WireCharViewerActivity extends AppCompatActivity {

    WireCharViewerPresenter wireCharViewerPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wireCharViewerPresenter = new WireCharViewerPresenter(getApplicationContext(), this);
        wireCharViewerPresenter.getWireCharacterViewer();
    }
}
