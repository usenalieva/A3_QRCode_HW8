package com.makhabatusen.a3_qrcode_hw8.data.frameworks.retrofit;

import com.makhabatusen.a3_qrcode_hw8.BuildConfig;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitBuilder {

    private static GhibliAPI instance;

    public RetrofitBuilder() {
    }

    public static GhibliAPI getInstance() {
        if (instance == null)
            instance = buildRetrofit();
        return instance;
    }

    private static GhibliAPI buildRetrofit() {
        return new Retrofit.Builder()
                .baseUrl(BuildConfig.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(GhibliAPI.class);
    }
}
