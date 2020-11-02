package com.aslam.converter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Weight extends AppCompatActivity {

    double result0, result1, result2;
    private Button KToG, KToP, KToO, getResult;
    private TextView result;
    private EditText enterWeight;
    private double sett;
    private ImageView refresh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);

        KToG = findViewById(R.id.KToG);
        KToP = findViewById(R.id.KToP);
        KToO = findViewById(R.id.KToO);
        getResult = findViewById(R.id.getResult);
        refresh = findViewById(R.id.refresh);
        result = findViewById(R.id.result);
        enterWeight = findViewById(R.id.enterWeight);


        KToG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double temp = Double.parseDouble(enterWeight.getText().toString());
                    result0 = (temp * 1000);
                    sett = result0;
                    result.setText(String.valueOf(result0));
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        });

        KToP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double temp = Double.parseDouble(enterWeight.getText().toString());
                    result1 = (temp * 2.2046);
                    sett = result1;
                    result.setText(String.valueOf(result1));
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }

        });

        KToO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double temp = Double.parseDouble(enterWeight.getText().toString());
                    result2 = (temp * 35.274);
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
                enterWeight.setText(String.valueOf(sett));
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
