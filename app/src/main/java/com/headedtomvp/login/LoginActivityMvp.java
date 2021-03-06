package com.headedtomvp.login;

public interface LoginActivityMvp {
    interface View {
        String getFirstName();

        String getLastName();

        void showUserNotAvailable();

        void showInputError();

        void showUserSaved();


        void setFirstName(String firstName);

        void setLastName(String lastName);
    }

    interface Presenter {
        void setView(LoginActivityMvp.View view);

        void loginButtonClicked();

        void getCurrentUser();
    }

    interface Model {
        void createUser(String firstName, String lastName);

        User getUser();
    }
}
