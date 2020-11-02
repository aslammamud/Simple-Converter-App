package com.aslam.converter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Currency extends AppCompatActivity {

    double result0, result1, result2;
    private Button TToD, TToR, TToE, getResult;
    private TextView result;
    private double sett;
    private ImageView refresh;
    private EditText enterCurrency;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);

        TToD = findViewById(R.id.TToD);
        TToR = findViewById(R.id.TToR);
        TToE = findViewById(R.id.TToE);
        getResult = findViewById(R.id.getResult);
        refresh = findViewById(R.id.refresh);
        result = findViewById(R.id.result);
        enterCurrency = findViewById(R.id.enterCurrency);


        TToD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double temp = Double.parseDouble(enterCurrency.getText().toString());
                    result0 = (temp * 0.012);
                    sett = result0;
                    result.setText(String.valueOf(result0));
                } catch (Exception e) {
                    Toast.makeText(Currency.this, "input null", Toast.LENGTH_SHORT).show();
                }
            }
        });

        TToR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double temp = Double.parseDouble(enterCurrency.getText().toString());
                    result1 = (temp * 0.84);
                    sett = result1;
                    result.setText(String.valueOf(result1));
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        });

        TToE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double temp = Double.parseDouble(enterCurrency.getText().toString());
                    result2 = (temp * 0.011);
                    sett = result2;
                    result.setText(String.valueOf(result2));
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        });

        getResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enterCurrency.setText(String.valueOf(sett));
            }
        });

        refresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                finish();
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

}
