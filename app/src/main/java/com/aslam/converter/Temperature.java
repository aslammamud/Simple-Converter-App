package com.aslam.converter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Temperature extends AppCompatActivity {

    double result0, result1, result2, result3, result4, result5;
    private Button CToF, CToK, FToC, FToK, KToC, KToF, getResult;
    private TextView result;
    private double sett;
    private ImageView refresh;
    private EditText enterTemperature;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);

        CToF = findViewById(R.id.CToF);
        CToK = findViewById(R.id.CToK);
        FToC = findViewById(R.id.FToC);
        FToK = findViewById(R.id.FToK);
        KToC = findViewById(R.id.KToC);
        KToF = findViewById(R.id.KToF);
        getResult = findViewById(R.id.getResult);
        refresh = findViewById(R.id.refresh);
        result = findViewById(R.id.result);
        enterTemperature = findViewById(R.id.enterTemperature);


        CToF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double temp = Double.parseDouble(enterTemperature.getText().toString());
                    result0 = (temp * 1.8) + 32;
                    sett = result0;
                    result.setText(String.valueOf(result0));
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        });

        CToK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double temp = Double.parseDouble(enterTemperature.getText().toString());
                    result1 = (temp + 273.15);
                    sett = result1;
                    result.setText(String.valueOf(result1));
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        });

        FToC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double temp = Double.parseDouble(enterTemperature.getText().toString());
                    result2 = (temp - 32) / 1.8;
                    sett = result2;
                    result.setText(String.valueOf(result2));
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        });

        FToK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double temp = Double.parseDouble(enterTemperature.getText().toString());
                    result3 = (((temp - 32) * 1.8) + 273.15);
                    sett = result3;
                    result.setText(String.valueOf(result3));
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        });

        KToC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double temp = Double.parseDouble(enterTemperature.getText().toString());
                    result4 = (temp - 273.15);
                    sett = result4;
                    result.setText(String.valueOf(result4));
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        });

        KToF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double temp = Double.parseDouble(enterTemperature.getText().toString());
                    result5 = (((temp - 273.15) * 1.8) + 32);
                    sett = result5;
                    result.setText(String.valueOf(result5));
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        });

        getResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enterTemperature.setText(String.valueOf(sett));
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
