package com.makhabatusen.a3_qrcode_hw8.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.makhabatusen.a3_qrcode_hw8.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.makhabatusen.a3_qrcode_hw8.databinding.ActivityMainBinding ui = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(ui.getRoot());
    }
}