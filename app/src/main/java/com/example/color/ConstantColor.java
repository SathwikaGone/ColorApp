package com.example.color;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class ConstantColor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constant_color);
    }

    public void changeColor(View v){
        EditText et1 = (EditText) findViewById(R.id.editText4);
        String S1= et1.getText().toString();
        Intent i = new Intent(this, MainActivity.class);
        i.putExtra("color",S1);
        setResult(2,i);
       finish();
    }
}
