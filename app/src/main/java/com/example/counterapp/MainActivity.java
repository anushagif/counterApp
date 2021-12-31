package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnminus,btnplus;
    TextView number,btnreset;
    int countervalue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnminus= findViewById(R.id.btn_minus);
        btnplus=findViewById(R.id.btn_plus);
        number=findViewById(R.id.num);
        btnreset=findViewById(R.id.btn_reset);

        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (countervalue != 0) {
                    countervalue=countervalue-1;
                    number.setText(countervalue+"");

                }
            }
        });
        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countervalue=countervalue+1;
                number.setText(countervalue+"");

            }
        });
        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countervalue=0;
                number.setText(countervalue+"");

            }
        });
    }
}