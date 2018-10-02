package xfinity.com.utils;

import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import xfinity.com.model.R;

public class ImageLoader {

    public static void loadImage(String iconUrl, ImageView img_icon){
        if(iconUrl.length() > 0){
            Picasso.get().load(iconUrl).placeholder(R.drawable.ic_launcher_background).into(img_icon);
        }
    }
}
