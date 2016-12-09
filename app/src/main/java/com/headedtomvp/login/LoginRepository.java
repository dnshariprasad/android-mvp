package com.headedtomvp.login;

/**
 * Created by Hari Prasad on 12/9/16.
 */

public interface LoginRepository {
    User getUser();

    void saveUser(User user);
}
