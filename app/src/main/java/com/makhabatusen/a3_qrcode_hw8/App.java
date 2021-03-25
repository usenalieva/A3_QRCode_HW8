package com.makhabatusen.a3_qrcode_hw8;

import android.app.Application;

import com.makhabatusen.a3_qrcode_hw8.data.frameworks.retrofit.RetrofitSource;
import com.makhabatusen.a3_qrcode_hw8.data.repository.FilmRepository;

public class App extends Application {

    private static FilmRepository filmRepository;

    public static FilmRepository getFilmRepository() {
        if (filmRepository == null)
            filmRepository = new FilmRepository(new RetrofitSource());
        return filmRepository;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
