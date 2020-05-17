
package com.lister.autopacktest;

import android.app.Activity;
import android.util.DisplayMetrics;

public class SizeUtils {

    public static float getDensity(Activity activity) {
        DisplayMetrics dm = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(dm);
        return dm.density;
    }

    public static String getString() {
        return "HAHA";
    }

}
