package com.makhabatusen.a3_qrcode_hw8.data.repository;

import com.makhabatusen.a3_qrcode_hw8.data.frameworks.retrofit.OnResultFilmListener;
import com.makhabatusen.a3_qrcode_hw8.data.source.RemoteSource;

public class FilmRepository {

    private final RemoteSource remoteSource;

    public FilmRepository(RemoteSource remoteSource) {
        this.remoteSource = remoteSource;
    }

    public void getFilmByID(String id, OnResultFilmListener listener) {
        remoteSource.getFilmById(id,listener);
    }

    public void  getFilms (OnResultFilmListener result) {
        remoteSource.getFilms(result);
    }

}
