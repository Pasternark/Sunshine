package com.example.hellomysunshine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Main Activity", "Hello my sunshine!");
        Log.i("Main Activity Info", "Aquí debería estar este mensaje");
    }
}