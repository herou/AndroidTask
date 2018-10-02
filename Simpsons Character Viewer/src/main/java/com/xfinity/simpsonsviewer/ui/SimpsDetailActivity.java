package com.xfinity.simpsonsviewer.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import com.xfinity.simpsonsviewer.R;

import xfinity.com.utils.ImageLoader;

public class SimpsDetailActivity extends AppCompatActivity {

    TextView txt_text;
    ImageView img_icon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simps_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        txt_text = findViewById(R.id.txt_text);
        img_icon = findViewById(R.id.img_icon);


        Intent intent = getIntent();

        String text = intent.getStringExtra("Text");
        String iconUrl = intent.getStringExtra("IconUrl");

        txt_text.setText(text);
        ImageLoader.loadImage(iconUrl,img_icon);

    }

}
