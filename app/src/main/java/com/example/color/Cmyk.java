package com.example.color;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Cmyk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cmyk);
    }

    public void changeColor(View v){
        EditText et1 = (EditText) findViewById(R.id.editText5);
        EditText et2 = (EditText) findViewById(R.id.editText6);
        EditText et3 = (EditText) findViewById(R.id.editText7);
        EditText et4 = (EditText) findViewById(R.id.editText8);
        int S1= Integer.valueOf(et1.getText().toString());
        int S2= Integer.valueOf(et2.getText().toString());
        int S3= Integer.valueOf(et3.getText().toString());
        int s4= Integer.valueOf(et4.getText().toString());
        Intent in = new Intent(this, MainActivity.class);
        in.putExtra("c",S1);
        in.putExtra("m",S2);
        in.putExtra("y",S3);
        in.putExtra("k",S3);
        //startActivityForResult(ini,1);
        setResult(3,in);
        finish();

    }
}
