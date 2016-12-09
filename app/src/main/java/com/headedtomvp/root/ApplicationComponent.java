package com.headedtomvp.root;

import com.headedtomvp.login.LoginActivity;
import com.headedtomvp.login.LoginModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Hari Prasad on 12/9/16.
 */
@Singleton
@Component(modules = {ApplicationModule.class, LoginModule.class})
public interface ApplicationComponent {
    void inject(LoginActivity target);
}
