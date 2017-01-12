package com.yichiuan.boilerplate.util;

import android.content.Context;

import com.facebook.stetho.Stetho;


public class StethoHelper {

    public static void init(Context context) {
        Stetho.initializeWithDefaults(context);
    }
}