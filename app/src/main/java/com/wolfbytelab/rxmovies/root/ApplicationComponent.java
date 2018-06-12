package com.wolfbytelab.rxmovies.root;

import com.wolfbytelab.rxmovies.TopMoviesActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {
    void inject(TopMoviesActivity target);
}
