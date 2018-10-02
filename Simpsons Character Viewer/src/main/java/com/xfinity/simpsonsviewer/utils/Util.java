package com.xfinity.simpsonsviewer.utils;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by Eljo on 9/5/2018.
 */

public class Util {

    public static String splitString(String string,int i) {
        String[] parts = string.split(" - ");
        return parts[i];
    }
}
