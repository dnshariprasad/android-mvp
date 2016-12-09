package com.headedtomvp.login;

/**
 * Created by Hari Prasad on 12/9/16.
 */

public class MemoryRepository implements LoginRepository {
    private User user;

    @Override
    public User getUser() {
        if (user == null) {
            User user = new User("Hari", "Prasad");
            user.setId(0);
            return user;
        } else {
            return user;
        }
    }

    @Override
    public void saveUser(User user) {
        if (user == null) {
            user = getUser();
        }
        this.user = user;
    }
}
