package com.xfinity.simpsonsviewer.ui.simpsons_detail;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import com.xfinity.simpsonsviewer.R;

import xfinity.com.utils.Constants;

import xfinity.com.utils.ImageLoader;

public class SimpsDetailActivity extends AppCompatActivity {

    TextView txt_title;
    TextView txt_desc;
    ImageView img_icon;

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simps_detail);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        init();
        showDetails();

    }

    public void init(){
        txt_title = findViewById(R.id.txt_title);
        txt_desc = findViewById(R.id.txt_desc);
        img_icon = findViewById(R.id.img_icon);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void showDetails(){
        Intent intent = getIntent();

        String title = intent.getStringExtra(Constants.TITLE);
        String desc = intent.getStringExtra(Constants.DESC);
        String iconUrl = intent.getStringExtra(Constants.ICON_URL);

        txt_title.setText(title);
        txt_desc.setText(desc);

        toolbar.setTitle(title);
        ImageLoader.loadImage(iconUrl,img_icon);
    }

}
