package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
private TextView text;
private Button currency,mortgage,discount,age,gst,scientific,bmi,percentage,split,converter,back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        text= findViewById(R.id.text);

        currency= findViewById(R.id.currency);
        mortgage= findViewById(R.id.mortgage);
        discount= findViewById(R.id.discount);
        age= findViewById(R.id.age);
        gst= findViewById(R.id.gst);
        scientific= findViewById(R.id.scientific);
        bmi= findViewById(R.id.bmi);
        percentage= findViewById(R.id.percentage);
        split= findViewById(R.id.split);
        converter= findViewById(R.id.converter);
        back= findViewById(R.id.back);


        scientific.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity2.this, scientific.class);
                startActivity(i);
            }
        });

        currency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity2.this, currency.class);
                startActivity(i);
            }
        });

        mortgage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity2.this, mortgage.class);
                startActivity(i);
            }
        });

        age.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity2.this, age.class);
                startActivity(i);
            }
        });

        gst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity2.this, gst.class);
                startActivity(i);
            }
        });

        bmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity2.this, bmi.class);
                startActivity(i);
            }
        });

        discount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity2.this, discount.class);
                startActivity(i);
            }
        });

        percentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity2.this, percentage.class);
                startActivity(i);
            }
        });

        split.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity2.this, split.class);
                startActivity(i);

            }
        });

        converter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity2.this, converter.class);
                startActivity(i);

            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}