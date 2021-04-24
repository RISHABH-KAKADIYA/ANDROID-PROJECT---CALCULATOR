package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Calendar;

public class bmi extends AppCompatActivity {

    EditText t1, t2, t3;
    Button back, btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        t3 = findViewById(R.id.t3);
        btn1 = findViewById(R.id.btn1);
        back = findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(bmi.this, MainActivity2.class);
                startActivity(i);
                finish();
            }
        });
    }

    public void bmicalc(View view) {
        double weight = Integer.parseInt(t1.getText().toString());
        double height = Integer.parseInt(t2.getText().toString());
        double result = (weight/(height*height))*10000;
        String showresult = String.valueOf(result);
        t3.setText(showresult);

    }

}






