package com.example.temperature;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TempActivity extends AppCompatActivity implements View.OnClickListener{

    String userInput;
    Double temp;
    String result;
    double index;
    EditText tempInput;
    Button cBtn;
    Button fBtn;
    Button clr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.temperature_layout);

        tempInput = findViewById(R.id.tempEntry);

        cBtn = findViewById(R.id.cBtn);
        cBtn.setOnClickListener(this);

        fBtn = findViewById(R.id.fBtn);
        fBtn.setOnClickListener(this);

        clr = findViewById(R.id.clear);
        clr.setOnClickListener(this);

    }

    public void onClick(View v) {
        userInput = tempInput.getText().toString();
        temp = Double.parseDouble(userInput);
        if (v.getId() == R.id.cBtn) {
            index = 5*((temp-32)/9);
            result = String.format("%.1f", index);
            ((TextView) findViewById(R.id.answer)).setText(result);
        } else if (v.getId() == R.id.fBtn) {
            index = (32+(9*temp))/5;
            result = String.format("%.1f", index);
            ((TextView) findViewById(R.id.answer)).setText(result);
        } else {
            ((TextView) findViewById(R.id.answer)).setText("");
        }
    }



}
