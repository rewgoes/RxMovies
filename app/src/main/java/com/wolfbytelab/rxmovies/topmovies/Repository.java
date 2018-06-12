package com.wolfbytelab.rxmovies.topmovies;

import com.wolfbytelab.rxmovies.http.apimodel.Result;

import io.reactivex.Observable;

public interface Repository {

    Observable<Result> getResultsFromMemory();

    Observable<Result> getResultsFromNetwork();

    Observable<String> getCountriesFromMemory();

    Observable<String> getCountriesFromNetwork();

    Observable<String> getCountryData();

    Observable<Result> getResultData();

}
