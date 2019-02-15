package com.example.color;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void goAction(View v) {
        Intent goIni = new Intent(this, ColorActivity.class);
        //EditText editText1 = findViewById(R.id.editText);
//String str = editText1.getText().toString();
//        goIni.putExtra("name", str);
        //   goIni.putExtra("name", "Sathwi");
        // goIni.putExtra("amount",12.5);

        startActivityForResult(goIni, 1);
    }
}
