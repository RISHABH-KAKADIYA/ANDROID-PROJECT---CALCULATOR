package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private TextView Screen;
private Button AC,power,BACK,div,mul,plus,sub,one,two,three,four,five,six,seven,eight,nine,zero,converter,point,equal;
private String input,answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Screen= findViewById(R.id.screen);
        AC=findViewById(R.id.ac);
        power= findViewById(R.id.power);
        BACK=findViewById(R.id.back);
        div= findViewById(R.id.div);
        seven=findViewById(R.id.seven);
        eight= findViewById(R.id.eight);
        nine=findViewById(R.id.nine);
        mul= findViewById(R.id.mul);
        four=findViewById(R.id.four);
        five= findViewById(R.id.five);
        six=findViewById(R.id.six);
        sub= findViewById(R.id.sub);
        one=findViewById(R.id.one);
        two= findViewById(R.id.two);
        three=findViewById(R.id.three);
        plus=findViewById(R.id.add);
        zero= findViewById(R.id.zero);
        point=findViewById(R.id.point);
        converter= findViewById(R.id.converter);
        equal=findViewById(R.id.equal);

        converter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(i);
            }
        });
    }

    public void ButtonClick(View view){
        Button button=(Button) view;
        String data=button.getText().toString();

        switch (data){
                case "AC":
                    input="";
                    break;
                case "*":
                    input+="*";
                    break;
                case "^":
                    input+="^";
                    break;
                case "=":
                    solve();
                    answer=input;
                    break;
                case "C":
                    String newText=input.substring(0,input.length()-1);
                    input=newText;
                break;
            default:
                if(input==null){
                    input="";
                }
                if(data.equals("+") || data.equals("-") || data.equals("/")){
                    solve();
                }
                input+=data;
        }
        Screen.setText(input);
    }
    private void solve() {
        if(input.split("\\*").length==2) {
            String number[]=input.split("\\*");
            try {
                double mul = Double.parseDouble(number[0]) * Double.parseDouble(number[1]);
                input = mul+"";
            }
            catch(Exception e){
                //Toggle error
            }
        }
        else if(input.split("/").length==2){
            String number[]=input.split("/");
            try {
                double div = Double.parseDouble(number[0]) / Double.parseDouble(number[1]);
                input = div+"";
            }
            catch(Exception e){
                //Toggle error
            }
        }
        else if(input.split("\\^").length==2){
            String number[]=input.split("\\^");
            try {
                double pow = Math.pow(Double.parseDouble(number[0]),Double.parseDouble(number[1]));
                input = pow+"";
            }
            catch(Exception e){
                //Toggle error
            }
        }
        else if(input.split("\\+").length==2){
            String number[]=input.split("\\+");
            try {
                double sum = Double.parseDouble(number[0]) + Double.parseDouble(number[1]);
                input = sum+"";
            }
            catch(Exception e){
                //Toggle error
            }
        }
        else if(input.split("-").length>1){ //this is only for substraction that may have more than 2 split char in case of like -5-8
            String number[]=input.split("-");
            //to substract from negative number like -3,-8,-67
            if(number[0]=="" && number.length==2){
                number[0]=0+"";
            }
            try {
                double sub = Double.parseDouble(number[0]) - Double.parseDouble(number[1]);
                input = sub+"";
            }
            catch(Exception e){
                //Toggle error
            }
        }
        //to remove the last digit .0 from integer result like 9 instead of 9.0
        String n[]=input.split("\\.");
        if(n.length>1){
            if(n[1].equals("0")){
                input=n[0];
            }
        }
        Screen.setText(input);
    }
}