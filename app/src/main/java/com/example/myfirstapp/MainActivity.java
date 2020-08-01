package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView tvResult;
    EditText etVar1,etVar2;
    Button btnAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResult=findViewById(R.id.tvResult);
        etVar1=findViewById(R.id.etVar1);
        etVar2=findViewById(R.id.etVar2);
        btnAdd=findViewById(R.id.btnAdd) ;
        btnAdd.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
       int var1=Integer.valueOf(etVar1.getText().toString());
       int var2=Integer.valueOf(etVar2.getText().toString());
       int var3=var1 + var2;
       tvResult.setText(String.valueOf(var3));
    }
}
