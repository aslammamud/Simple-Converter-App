package com.aslam.converter;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button currency, weight, temerature, exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        currency = findViewById(R.id.currency);
        weight = findViewById(R.id.weight);
        temerature = findViewById(R.id.temperature);
        exit = findViewById(R.id.exit);

        currency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityCurrency();
            }
        });

        weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityWeight();
            }
        });

        temerature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityTemperature();
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                alert.setMessage("Are you sure?")
                        .setPositiveButton("Exit", new DialogInterface.OnClickListener() {

                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        }).setNegativeButton("Cancel", null);

                AlertDialog alert1 = alert.create();
                alert1.show();
            }
        });
    }

    public void openActivityCurrency() {
        Intent intent = new Intent(this, Currency.class);
        startActivity(intent);
    }

    public void openActivityWeight() {
        Intent intent = new Intent(this, Weight.class);
        startActivity(intent);
    }

    public void openActivityTemperature() {
        Intent intent = new Intent(this, Temperature.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {

        AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
        alert.setMessage("Are you sure?")
                .setPositiveButton("Exit", new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                }).setNegativeButton("Cancel", null);

        AlertDialog alert1 = alert.create();
        alert1.show();

    }

}
