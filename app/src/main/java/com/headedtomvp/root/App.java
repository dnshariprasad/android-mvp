package com.headedtomvp.root;

import android.app.Application;

import com.headedtomvp.login.LoginModule;

/**
 * Created by Hari Prasad on 12/9/16.
 */

public class App extends Application {
    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .loginModule(new LoginModule())
                .build();
    }

    public  ApplicationComponent getComponent() {
        return component;
    }
}
