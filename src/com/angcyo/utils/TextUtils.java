package com.angcyo.utils;

import com.sun.istack.internal.Nullable;

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

}
