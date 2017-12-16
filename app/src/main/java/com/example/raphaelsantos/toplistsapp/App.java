package com.example.raphaelsantos.toplistsapp;

import android.app.Application;
import android.content.Context;

import com.example.raphaelsantos.toplistsapp.device.dagger.modules.AppModule;
import com.example.raphaelsantos.toplistsapp.ui.inject.DaggerTopListsComponent;
import com.example.raphaelsantos.toplistsapp.ui.inject.TopListsComponent;

public class App extends Application {
    private static App instance;
    private TopListsComponent mTopListsComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        injectDraggerDependecies();

        instance = this;
    }

    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }

    private void injectDraggerDependecies() {

        mTopListsComponent = DaggerTopListsComponent.builder()
                                        .appModule(new AppModule(this))
                                        .build();
    }

    public TopListsComponent getTopListsComponent() {
        return mTopListsComponent;
    }

    public static App getInstance() {
        return instance;
    }
}
