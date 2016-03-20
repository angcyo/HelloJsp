package com.angcyo.utils;

import com.sun.istack.internal.Nullable;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by angcyo on 16-02-19-019.
 */
public class TextUtils {

    public static boolean isEmpty(@Nullable CharSequence str) {
        if (str == null || str.length() == 0 || str.toString().trim().length() == 0)
            return true;
        else
            return false;
    }

    public static String getDataTime() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = format.format(new Date());
        return time;
    }

}
