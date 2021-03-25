package com.makhabatusen.a3_qrcode_hw8.data.source;

import com.makhabatusen.a3_qrcode_hw8.data.frameworks.retrofit.OnResultFilmListener;

public interface RemoteSource {

    void getFilmById(String id, OnResultFilmListener result);
    void getFilms (OnResultFilmListener result);
}
