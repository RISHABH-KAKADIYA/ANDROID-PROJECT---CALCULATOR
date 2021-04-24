package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class mortgage extends AppCompatActivity {
    Button back,btn1;
    EditText t1,t2,t3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mortgage);

        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        t3=findViewById(R.id.t3);
        btn1=findViewById(R.id.btn1);
        back=findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(mortgage.this, MainActivity2.class);
                startActivity(i);
                finish();
            }
        });


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Double total;
                Double p = Double.parseDouble(t1.getText().toString());
                Double I = Double.parseDouble(t2.getText().toString());
                Double N = Double.parseDouble(t3.getText().toString());


                //P=R[(1-(1+I)^-N)/I]   P=AMOUNT,N=MONTH,I=INTEREST OF ONE MONTH than R is mortgage value

                Double a = I/(12*100.0);
                Double n=12*N;
                Double i= (p*a)/(1-Math.pow(1+a,-n));



                total = i;
                Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();

            }
        });
    }
}