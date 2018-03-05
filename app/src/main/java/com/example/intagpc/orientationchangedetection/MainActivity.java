package com.example.intagpc.orientationchangedetection;

import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if(newConfig.orientation== Configuration.ORIENTATION_PORTRAIT){
            Toast.makeText(MainActivity.this,"Portrait",Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(MainActivity.this,"landscape",Toast.LENGTH_SHORT).show();
        }
    }
}
