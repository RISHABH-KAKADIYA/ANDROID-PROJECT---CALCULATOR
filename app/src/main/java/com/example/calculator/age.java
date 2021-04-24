package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class age extends AppCompatActivity {

    EditText y1;
    TextView age;
    Button back,btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age);

        y1=findViewById(R.id.y1);
        age=findViewById(R.id.age);
        btn1=findViewById(R.id.btn1);
        back=findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(age.this, MainActivity2.class);
                startActivity(i);
                finish();
            }
        });
    }
    public void calcAge(View view){
        int birthday=Integer.parseInt(y1.getText().toString());
        int currentyear= Calendar.getInstance().get(Calendar.YEAR);
        int result=currentyear-birthday;
        String showresult=String.valueOf(result);
        age.setText("your age is:" +showresult);
    }
}