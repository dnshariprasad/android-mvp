package com.headedtomvp.login;

/**
 * Created by Hari Prasad on 12/9/16.
 */

public class LoginModel implements LoginActivityMvp.Model {
    private LoginRepository repository;

    public LoginModel(LoginRepository repository) {
        this.repository = repository;
    }

    @Override
    public void createUser(String firstName, String lastName) {
        repository.saveUser(new User(firstName, lastName));
    }

    @Override
    public User getUser() {
        return repository.getUser();
    }
}
