package com.yichiuan.boilerplate.injection.component;

import android.content.Context;

import com.yichiuan.boilerplate.injection.module.AppModule;
import com.yichiuan.boilerplate.injection.module.DataModule;

import javax.inject.Singleton;

import dagger.Component;
import okhttp3.OkHttpClient;


@Singleton
@Component(modules = {AppModule.class, DataModule.class})
public interface AppComponent {

    Context context();
    OkHttpClient okHttpClient();
}
