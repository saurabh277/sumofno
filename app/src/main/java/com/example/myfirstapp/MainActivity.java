package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {
    public static final String TAG="MFA";
    TextView tvResult;
    EditText etVar1,etVar2,etweburl;
    Button btnAdd;
    ImageButton btnbrowse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResult = findViewById(R.id.tvResult);
        etVar1 = findViewById(R.id.etVar1);
        etVar2 = findViewById(R.id.etVar2);
        btnAdd = findViewById(R.id.btnAdd);
        etweburl= findViewById(R.id.etweburl);
        btnbrowse=findViewById(R.id.btnbrowse);

        btnAdd.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int var1 = Integer.valueOf(etVar1.getText().toString());
                int var2 = Integer.valueOf(etVar2.getText().toString());
                int var3 = var1 + var2;
                tvResult.setText(String.valueOf(var3));
                //GO TO SECOND ACTIVITY
               Intent i=new Intent(MainActivity.this,SecondActivity.class);
               i.putExtra("Result",var3);
               startActivity(i);

            }
        });
        btnbrowse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = etweburl.getText().toString();
                Uri uri = Uri.parse(url);
                Intent i = new Intent(Intent.ACTION_VIEW, uri);
                try {
                    startActivity(i);
                }
                catch(ActivityNotFoundException anfe){
                Log.d(TAG,"oouldn;t open activity with given url",anfe);
                    Toast.makeText(MainActivity.this,"couldn't find any app to open this link",Toast.LENGTH_SHORT).show();

                }
            }
        });
    }

}
