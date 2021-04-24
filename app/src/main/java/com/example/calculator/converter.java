package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class converter extends AppCompatActivity {

    Button back,btn1;
    Spinner spi1;
    EditText t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);

        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        btn1=findViewById(R.id.btn1);
        back=findViewById(R.id.back);
        spi1=findViewById(R.id.spi1);

        String[] conve = {"cm","dm","km","Mm"};
        ArrayAdapter ad = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,conve);
        spi1.setAdapter(ad);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(converter.this, MainActivity2.class);
                startActivity(i);
                finish();
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Double total=0.0;
                Double amount = Double.parseDouble(t1.getText().toString());


                if (spi1.getSelectedItem().toString() == "cm") {
                    total = amount * 100;

                } else if (spi1.getSelectedItem().toString() == "dm") {
                    total = amount * 10;

                } else if (spi1.getSelectedItem().toString() == "km") {
                    total = amount/1000;

                } else if (spi1.getSelectedItem().toString() == "Mm") {
                    total = amount/1000000;
                    
                }
                String total1=String.valueOf(total);
                t2.setText("length is:" +total1);
            }

        });
    }
}