package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread thread = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(2500);

                }
                catch (Exception e){
                    e.printStackTrace();
                }
                finally {
                    Intent i = new Intent(splash.this,MainActivity.class);
                    startActivity(i);
                    finish();
                }

            }
        };thread.start();

    }
}