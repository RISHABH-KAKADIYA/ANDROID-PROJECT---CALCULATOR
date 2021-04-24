package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class scientific extends AppCompatActivity {
private TextView scree;
private Button lo,l,un,sin,cos,tan,on,tw,thre,fou,fiv,si,seve,eigh,nin,zer,ad,a,su,bac,mu,di,poin,equa,back;
private String input,answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scientific);

        scree= findViewById(R.id.scree);

        lo=findViewById(R.id.lo);
        l= findViewById(R.id.l);
        un= findViewById(R.id.un);
        sin= findViewById(R.id.sin);
        cos=findViewById(R.id.cos);
        tan= findViewById(R.id.tan);
        on=findViewById(R.id.on);
        tw= findViewById(R.id.tw);
        thre=findViewById(R.id.thre);
        fou= findViewById(R.id.fou);
        fiv=findViewById(R.id.fiv);
        si= findViewById(R.id.si);
        seve=findViewById(R.id.seve);
        eigh=findViewById(R.id.eigh);
        nin= findViewById(R.id.nin);
        ad=findViewById(R.id.ad);
        a= findViewById(R.id.a);
        su=findViewById(R.id.su);
        bac=findViewById(R.id.bac);
        mu= findViewById(R.id.mu);
        di=findViewById(R.id.di);
        zer=findViewById(R.id.zero);
        poin= findViewById(R.id.poin);
        equa=findViewById(R.id.equa);
        back= findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(scientific.this,MainActivity2.class);
                startActivity(i);
                finish();
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
            case "=":
                solve();
                answer=input;
                break;
            case "C":
                String newText=input.substring(0,input.length()-1);
                input=newText;
                break;
            case "log":
                function1();
                answer=input;
                break;
            case "ln":
                function2();
                answer=input;
                break;
            case "√":
                function3();
                answer=input;
                break;

            case "sin":
                function4();
                answer=input;
                break;
            case "cos":
                function5();
                answer=input;
                break;
            case "tan":
                function6();
                answer=input;
                break;


            default:
                if(input==null){
                    input="";
                }
                if(data.equals("+") || data.equals("-") || data.equals("/")) {
                    solve();
                }
                input+=data;
        }
        scree.setText(input);
    }




    private void function1() {


        if(input.split("log").length==1){
            String number[]=input.split("log");
            try {
                double log = Math.log10(Double.parseDouble(number[0]));
                input = log+"";
            }
            catch(Exception e){
                //Toggle error
            }
        }
    }

    private void function2() {
        if (input.split("ln").length == 1) {
            String number[] = input.split("ln");
            try {
                double ln = Math.log(Double.parseDouble(number[0]));
                input = ln + "";
            } catch (Exception e) {
                //Toggle error
            }
        }
    }

    private void function3() {
        if (input.split("√").length == 1) {
            String number[] = input.split("v");
            try {
                double un = Math.sqrt(Double.parseDouble(number[0]));
                input = un + "";
            } catch (Exception e) {
                //Toggle error
            }
        }
    }


    private void function4() {
        if(input.split("sin").length==1){
            String number[]=input.split("sin");
            try {
                double sin = Math.sin(Double.parseDouble(number[0]));
                input = sin+"";
            }
            catch(Exception e){
                //Toggle error
            }
        }
    }

    private void function5() {
        if(input.split("cos").length==1){
            String number[]=input.split("cos");
            try {
                double cos = Math.cos(Double.parseDouble(number[0]));
                input = cos+"";
            }
            catch(Exception e){
                //Toggle error
            }
        }
    }

    private void function6() {
        if(input.split("tan").length==1){
            String number[]=input.split("tan");
            try {
                double tan = Math.tan(Double.parseDouble(number[0]));
                input = tan+"";
            }
            catch(Exception e){
                //Toggle error
            }
        }
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
        scree.setText(input);
    }


}
