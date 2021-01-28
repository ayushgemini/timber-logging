package com.example.timber_logging;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import timber.log.Timber;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Timber.d("debug message");
        Timber.e("error message");
        Timber.tag("Use any tag").d("add any debug message");
        Timber.tag("Use any tag").e("add any error message");
    }
}