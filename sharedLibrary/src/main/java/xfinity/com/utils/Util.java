package xfinity.com.utils;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
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

    public static boolean checkIfMobilePhone(Activity activity) {
        DisplayMetrics metrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(metrics);

        float yInches = metrics.heightPixels / metrics.ydpi;
        float xInches = metrics.widthPixels / metrics.xdpi;
        double diagonalInches = Math.sqrt(xInches * xInches + yInches * yInches);
        if (diagonalInches >= 6.5) {
            return false;
        } else {
            return true;
        }
    }
}
