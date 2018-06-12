package com.wolfbytelab.rxmovies.root;

import com.wolfbytelab.rxmovies.TopMoviesActivity;
import com.wolfbytelab.rxmovies.http.ApiModuleForInfo;
import com.wolfbytelab.rxmovies.http.ApiModuleForName;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class, ApiModuleForInfo.class, ApiModuleForName.class})
public interface ApplicationComponent {
    void inject(TopMoviesActivity target);
}
