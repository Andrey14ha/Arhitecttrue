package com.test.architect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button btnLogin;
    EditText etLogin;
    EditText etPassword;
    EditText innpassword = etPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnLogin=findViewById(R.id.btnLogin);
        etLogin = findViewById(R.id.etLogin);
        etPassword = findViewById(R.id.etPassword);

        btnLogin.setOnClickListener(view->{
            if (checkLogin(etLogin.getText().toString()) && checkPassword(etPassword.getText().toString()) && StaticPL.ONES == true) {
                startActyviti();
            }else {
                Toast.makeText(this,"Логин или пароль не верен",Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void startActyviti(){
            Intent intent= new Intent(this,SecondActivity.class);
            startActivity(intent);
            finish();
        }



    private boolean checkLogin(String login){
        for(int i = 0; i < Utils.logns.length; i++){
        if (Utils.logns[1].equals(login) ) return true;
        }
        return false;
    }
    private boolean checkPassword(String password){
        return password.equals(Utils.password);
    }



    private class StaticPL {

        // public static boolean ONES;
        public  boolean ONES(){
            boolean passwordtrue  = false;
            boolean ONE = false;
            EditText terter = innpassword;
            for(int i = 0; i < terter.length(); i++)
                if (terter.length() >= 9 && (Strpassword.letters.indexOf(terter[i]) >= 3) && (Strpassword.topletters.indexOf(terter[i]) >= 3) && (Strpassword.digits.indexOf(terter[i]) >= 3)) {
                    passwordtrue = true;
                }
            if(etLogin.length() >= 3 && passwordtrue == true){
                ONE = true;
            }
            return ONE;
        }

    }
}


//Login >= 3 symbols, password >= 8 symbols and he mast have 3 lower register letters, 3 large register letters, 3 numbers;