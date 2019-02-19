package com.example.color;

import android.content.Intent;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int red;
int green;
int blue;
String c1;
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
   }
    public void pantone(View v) {
        Intent goIni = new Intent(this, Pantone.class);
        startActivityForResult(goIni, 4);
    }


    public void goAction(View v) {
        Intent goIni = new Intent(this, ColorActivity.class);
        startActivityForResult(goIni, 1);
    }
    public  void action(View v){
    Intent i = new Intent(this,ConstantColor.class);
    startActivityForResult(i,2);
    }
    public void cmyk(View v){
    Intent c = new Intent(this,Cmyk.class);
    startActivityForResult(c,3);
    }
    public void onActivityResult(int requestCode, int returnCode, Intent init) {
        if (requestCode == 1) {
            if (returnCode == 1) {
                // Intent init = getIntent();
                red = init.getIntExtra("red", 123);
                green = init.getIntExtra("green", 123);
                blue = init.getIntExtra("blue", 123);
                if (red < 0 || red > 255) {
                    red = 255;
                }
                if (green < 0 || green > 255) {
                    green = 255;
                }
                if (blue < 0 || blue > 255) {
                    blue = 255;
                }
                String display = "Red: " + red + " Green: " + green + " Blue: " + blue;
                TextView textView = findViewById(R.id.textView5);
                textView.setText(display);
                ImageView color = (ImageView) findViewById(R.id.imageView3);
                int y = 256 * 256 * red + 256 * green + blue;
                String p = Integer.toHexString(y);
                color.setBackgroundColor(0xff000000 + Integer.parseInt(p, 16));

            }
        }

        if (requestCode == 3) {
            if (returnCode == 3) {
                //Intent i=getIntent();
                int cyan1 = init.getIntExtra("c", 123);
                int magenta = init.getIntExtra("m", 123);
                int yellow = init.getIntExtra("y", 123);
                int blacky = init.getIntExtra("k", 123);
                TextView textView = findViewById(R.id.textView5);
                ImageView color = (ImageView) findViewById(R.id.imageView3);
                int r =256*(1-cyan1)*(1-blacky);
                int g =256*(1-magenta)*(1-blacky);
                int b =256*(1-yellow)*(1-blacky);
                int y = 256 * 256 * red + 256 * green + blue;
                String p = Integer.toHexString(y);
                color.setBackgroundColor(0xff000000 + Integer.parseInt(p, 16));
            }
        }
        if (requestCode == 2) {
            if (returnCode == 2) {
                //Intent i=getIntent();
                c1 = init.getStringExtra("color").toUpperCase();
                TextView textView = findViewById(R.id.textView5);
                if (c1.equals("RED") || c1.equals("GREEN") || c1.equals("BLACK") || c1.equals("BLUE") || c1.equals("CYAN") || c1.equals("TRANSPARENT") || c1.equals("WHITE") || c1.equals("Yellow") || c1.equals("DKGRAY") || c1.equals("GRAY") || c1.equals("LTGRAY") || c1.equals("MAGENTA") ) {
                    String display = "Color " + c1;
                    textView.setText(display);
                    ImageView c = (ImageView) findViewById(R.id.imageView3);
                    c.setBackgroundColor(Color.parseColor(c1));
                } else {
                    String display = "Color " + c1 + " is not a constant color.";
                    textView.setText(display);
                }
            }
        }
        if (requestCode == 1) {
            if (returnCode == 5) {
                //Intent i=getIntent();
              //  c1 = init.getStringExtra("value").toUpperCase();
                c1= init.getStringExtra("value");
                TextView textView = findViewById(R.id.textView9);
                String display = "Hexadecimal value is #" + c1;
                textView.setText(display);
                ImageView color = (ImageView) findViewById(R.id.imageView3);
                // int y = 256*256*red+256*green+blue;
                //String p=Integer.toHexString(y);
                color.setBackgroundColor(Color.GRAY);

            }

        }
        if (requestCode == 4) {
            if (returnCode == 4) {
                red = init.getIntExtra("r1", 0);
                green = init.getIntExtra("r2", 0);
                blue = init.getIntExtra("r3", 0);

                String display = "Red: " + red + " Green: " + green + " Blue: " + blue;
                TextView textView = findViewById(R.id.textView5);
                textView.setText(display);
                ImageView color = (ImageView) findViewById(R.id.imageView3);
                color.setBackgroundColor(Color.rgb(red,green,blue));
//                int y = 256 * 256 * red + 256 * green + blue;
//                String p = Integer.toHexString(y);
//                color.setBackgroundColor(0xff000000 + Integer.parseInt(p, 16));
            }

        }
    }

}
