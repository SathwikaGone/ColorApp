package com.example.color;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);
     //   Intent ini=getIntent();

    }
    public void changeColor(View v){
        EditText et1 = (EditText) findViewById(R.id.editText);
        EditText et2 = (EditText) findViewById(R.id.editText2);
        EditText et3 = (EditText) findViewById(R.id.editText3);
        int S1= Integer.valueOf(et1.getText().toString());
        int S2= Integer.valueOf(et2.getText().toString());
        int S3= Integer.valueOf(et3.getText().toString());
        Intent ini = new Intent(this, MainActivity.class);
        ini.putExtra("red",S1);
        ini.putExtra("green",S2);
        ini.putExtra("blue",S3);
        //startActivityForResult(ini,1);
        setResult(1,ini);
        finish();

    }
    public void buttonColor(View v){
        Button bt = (Button) findViewById(R.id.button7);
        EditText et1 = (EditText) findViewById(R.id.editText);
        EditText et2 = (EditText) findViewById(R.id.editText2);
        EditText et3 = (EditText) findViewById(R.id.editText3);
        int S1= Integer.valueOf(et1.getText().toString());
        int S2= Integer.valueOf(et2.getText().toString());
        int S3= Integer.valueOf(et3.getText().toString());
      //  Intent ini = new Intent(this, MainActivity.class);
        //ini.putExtra("red",S1);
        //ini.putExtra("green",S2);
        //ini.putExtra("blue",S3);
        bt.setBackgroundColor(Color.rgb(S1,S2,S3));
    }

    public void hexaDecimal(View v){
        EditText et3 = (EditText) findViewById(R.id.editText9);
        String str=et3.getText().toString();
       Intent in = new Intent(this,MainActivity.class);
       in.putExtra("value",str);
        setResult(5,in);
       finish();


    }
}
