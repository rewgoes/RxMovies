package com.wolfbytelab.rxmovies.root;

import com.wolfbytelab.rxmovies.http.ApiModuleForInfo;
import com.wolfbytelab.rxmovies.http.ApiModuleForName;
import com.wolfbytelab.rxmovies.topmovies.TopMoviesActivity;
import com.wolfbytelab.rxmovies.topmovies.TopMoviesModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class, ApiModuleForInfo.class, ApiModuleForName.class, TopMoviesModule.class})
public interface ApplicationComponent {
    void inject(TopMoviesActivity target);
}
