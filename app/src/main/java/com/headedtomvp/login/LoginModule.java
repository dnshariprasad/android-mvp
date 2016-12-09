package com.headedtomvp.login;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Hari Prasad on 12/9/16.
 */
@Module
public class LoginModule {
    @Provides
    LoginActivityMvp.Presenter providerLoginModulePresenter(LoginActivityMvp.Model model) {
        return new LoginActivityPresenter(model);
    }
    @Provides
    LoginActivityMvp.Model providerLoginModuleModel(LoginRepository repository) {
        return new LoginModel(repository);
    }

    @Provides
    LoginRepository providerLoginRepository() {
        return new MemoryRepository();
    }
}
