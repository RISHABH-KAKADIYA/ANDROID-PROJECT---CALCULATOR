package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class discount extends AppCompatActivity {

    EditText t1, t2, t3,t4;
    Button back, btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discount);

        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        t3 = findViewById(R.id.t3);
        t4 = findViewById(R.id.t4);
        btn1 = findViewById(R.id.btn1);
        back = findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(discount.this, MainActivity2.class);
                startActivity(i);
                finish();
            }
        });


    }

    public void discountcalc(View view) {
        double amount = Integer.parseInt(t1.getText().toString());
        double discount = Integer.parseInt(t2.getText().toString());
        double result1 = (amount * discount) / 100;
        String showresult = String.valueOf(result1);
        t3.setText(showresult);
        double result2 = (amount-result1);
        String showamount = String.valueOf(result2);
        t4.setText(showamount);


    }
}