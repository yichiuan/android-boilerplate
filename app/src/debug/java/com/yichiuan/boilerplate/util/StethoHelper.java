package com.yichiuan.boilerplate.util;

import android.content.Context;

import com.facebook.stetho.Stetho;
import com.facebook.stetho.okhttp3.StethoInterceptor;

import okhttp3.OkHttpClient;


public class StethoHelper {

    public static void init(Context context) {
        Stetho.initializeWithDefaults(context);
    }

    public static void configureInterceptor(OkHttpClient.Builder httpClientBuilder) {
        httpClientBuilder.addNetworkInterceptor(new StethoInterceptor());
    }
}