package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;


public class gst extends AppCompatActivity {

    EditText t1,t2;
    Button back,btn1;
    Spinner spi1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gst);

        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        btn1=findViewById(R.id.btn1);
        back=findViewById(R.id.back);
        spi1=findViewById(R.id.spi1);

        String[] gst = {"12%","15%","18%","20%","22%","25%","30%"};
        ArrayAdapter ad = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,gst);
        spi1.setAdapter(ad);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(gst.this, MainActivity2.class);
                startActivity(i);
                finish();
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Double total=0.0;
                Double amount = Double.parseDouble(t1.getText().toString());


                if (spi1.getSelectedItem().toString() == "12%") {
                    total = amount * 0.06;

                }
                else if (spi1.getSelectedItem().toString() == "15%") {
                    total = amount * 0.075;

                }
                else if (spi1.getSelectedItem().toString() == "18%") {
                    total = amount * 0.09;

                }
                else if (spi1.getSelectedItem().toString() == "20%") {
                    total = amount * 0.1;

                }
                else if (spi1.getSelectedItem().toString() == "22%") {
                    total = amount * 0.11;

                }
                else if (spi1.getSelectedItem().toString() == "25%") {
                    total = amount * 0.125;
                }
                else if (spi1.getSelectedItem().toString() == "30%") {
                    total = amount * 0.15;

                }
                t2.setText("SGST/CGST in INR:" +total);
            }

        });


    }

}