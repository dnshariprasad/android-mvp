package com.headedtomvp.login;

import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by Hari Prasad on 12/9/16.
 */

public class LoginActivityPresenter implements LoginActivityMvp.Presenter {
    private static final String TAG = "LoginActivityPresenter";
    @Nullable
    private LoginActivityMvp.View view;
    private LoginActivityMvp.Model model;

    public LoginActivityPresenter(LoginActivityMvp.Model model) {
        this.model = model;
    }

    @Override
    public void setView(LoginActivityMvp.View view) {
        this.view = view;
    }

    @Override
    public void loginButtonClicked() {
        if (view != null) {
            if (view.getFirstName().toLowerCase().equals("") || view.getLastName().toLowerCase().equals("")) {
                view.showInputError();
            } else {
                model.createUser(view.getFirstName(), view.getLastName());
                view.showUserSaved();
            }
        }

    }

    @Override
    public void getCurrentUser() {

        User user = model.getUser();

        if (user != null) {
            if (view != null) {
                view.setFirstName(user.getFirstName());
                view.setLastName(user.getLastName());
            }
        }

    }
}
