package com.example.color;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pantone extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantone);
        Button bt= findViewById(R.id.button9);
        Button bt1= findViewById(R.id.button10);
        Button bt2= findViewById(R.id.button11);
        bt.setBackgroundColor(Color.rgb(42,82,190));
        bt1.setBackgroundColor(Color.rgb(198,68,122));
        bt2.setBackgroundColor(Color.rgb(239,192,80));
    }
    public void pantone(View v){
        Intent intt = new Intent();
        switch(v.getId()){
            case R.id.button9:

                intt.putExtra("r1",42);
                intt.putExtra("r2",82);
                intt.putExtra("r3",190);
                break;
            case R.id.button10:
                intt.putExtra("r1",198);
                intt.putExtra("r2",68);
                intt.putExtra("r3",122);
                break;

            case R.id.button11:
                intt.putExtra("r1",239);
                intt.putExtra("r2",192);
                intt.putExtra("r3",80);
                break;
        }
        setResult(4,intt);
        finish();

    }
}
