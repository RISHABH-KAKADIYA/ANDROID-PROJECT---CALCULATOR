package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class currency extends AppCompatActivity {
    Spinner spi1,spi2;
    EditText t1;
    Button bt1,back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);

        spi1 = findViewById(R.id.spi1);
        spi2 = findViewById(R.id.spi2);
        t1 = findViewById(R.id.t1);
        bt1 = findViewById(R.id.bt1);
        back = findViewById(R.id.back);

        String[] from = {"indian rupee"};
        ArrayAdapter ad = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, from);
        spi1.setAdapter(ad);

        String[] to = {"US Dollar", "Euro", "British Pound", "Canadian Dollar", "Singapor Dollar", "Argentine Peso", "Japanese Yen", "Malaysian Ringgit"};
        ArrayAdapter ad1 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, to);
        spi2.setAdapter(ad1);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(currency.this, MainActivity2.class);
                startActivity(i);
                finish();
            }
        });

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Double total;
                Double amount = Double.parseDouble(t1.getText().toString());


                if (spi1.getSelectedItem().toString() == "indian rupee" && spi2.getSelectedItem().toString() == "US Dollar") {
                    total = amount / 73.5;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                } else if (spi1.getSelectedItem().toString() == "indian rupee" && spi2.getSelectedItem().toString() == "Euro") {
                    total = amount / 87.02;

                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                } else if (spi1.getSelectedItem().toString() == "indian rupee" && spi2.getSelectedItem().toString() == "British Pound") {
                    total = amount / 94.0048;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                } else if (spi1.getSelectedItem().toString() == "indian rupee" && spi2.getSelectedItem().toString() == "Canadian Dollar") {
                    total = amount / 0.017950;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                } else if (spi1.getSelectedItem().toString() == "indian rupee" && spi2.getSelectedItem().toString() == "Singapor Dollar") {
                    total = amount / 0.0186282;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                } else if (spi1.getSelectedItem().toString() == "indian rupee" && spi2.getSelectedItem().toString() == "Argentine Peso") {
                    total = amount / 1.0191;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                }
                if (spi1.getSelectedItem().toString() == "indian rupee" && spi2.getSelectedItem().toString() == "Japanese Yen") {
                    total = amount / 1.4450;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                } else if (spi1.getSelectedItem().toString() == "indian rupee" && spi2.getSelectedItem().toString() == "Malaysian Ringgit") {
                    total = amount / 0.056610;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}