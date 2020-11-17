package com.akshay.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void register(View view) {
        startActivity(new Intent(getApplicationContext(),Register.class));
        finish();
    }

    public void login(View view) {
        startActivity(new Intent(getApplicationContext(),Login.class));
        finish();
    }
}