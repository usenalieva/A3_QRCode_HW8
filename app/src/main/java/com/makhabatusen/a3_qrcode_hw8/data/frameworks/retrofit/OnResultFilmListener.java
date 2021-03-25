package com.makhabatusen.a3_qrcode_hw8.data.frameworks.retrofit;

import com.makhabatusen.a3_qrcode_hw8.data.model.Film;

import java.util.List;

public interface OnResultFilmListener {

    default void onSuccessFilm(Film film) { }

    default void onSuccessList(List<Film> films) { }

}
