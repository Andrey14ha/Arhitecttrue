package com.test.architect;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

public class Splash extends AppCompatActivity {

    public static final int DELAY_IN_MILLS = 5000;

    @Override
    protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(() -> {
            startActivity(new Intent(Splash.this, MainActivity.class));
            finish();
                }, DELAY_IN_MILLS);
    }
}