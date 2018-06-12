package com.wolfbytelab.rxmovies.root;

import android.app.Application;

import com.wolfbytelab.rxmovies.http.ApiModuleForInfo;
import com.wolfbytelab.rxmovies.http.ApiModuleForName;
import com.wolfbytelab.rxmovies.topmovies.TopMoviesModule;

public class App extends Application {

    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .apiModuleForName(new ApiModuleForName())
                .apiModuleForInfo(new ApiModuleForInfo())
                .topMoviesModule(new TopMoviesModule())
                .build();
    }

    public ApplicationComponent getComponent() {
        return component;
    }
}
