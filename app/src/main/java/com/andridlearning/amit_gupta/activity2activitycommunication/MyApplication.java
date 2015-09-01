package com.andridlearning.amit_gupta.activity2activitycommunication;

import android.app.Application;
import android.content.res.Configuration;

import com.andridlearning.amit_gupta.activity2activitycommunication.model.Book;

/**
 * Created by Amit_Gupta on 9/1/15.
 */
public class MyApplication extends Application {

    public Book book;

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        //only will get called in simulated environmet not in production release
    }
}
