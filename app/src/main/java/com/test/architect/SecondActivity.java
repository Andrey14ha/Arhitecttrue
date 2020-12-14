package com.test.architect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
            Button btnSecond = findViewById(R.id.btnStartThird);
            btnSecond.setOnClickListener(view -> {
            startActivity(new Intent(this,ThirdAcivity.class));
            finish();
        });
    }
}
