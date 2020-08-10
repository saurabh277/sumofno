package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tvResult=findViewById(R.id.tvResult);
        Intent intentThatStartedThis=getIntent();
        int res=intentThatStartedThis.getIntExtra("Result",0);
        tvResult.setText(String.valueOf(res));
    }
}
