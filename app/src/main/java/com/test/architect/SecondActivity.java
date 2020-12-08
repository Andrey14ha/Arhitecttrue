package com.test.architect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    Button btnStart2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnStart2=findViewById(R.id.btnStart);

        btnStart2.setOnClickListener(view->{
            Intent intent= new Intent(this,ThirdAcivity.class);
            startActivity(intent);
        });
    }
}
