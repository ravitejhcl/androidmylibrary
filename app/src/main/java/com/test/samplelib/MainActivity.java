package com.test.samplelib;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.test.androidmylibrary.HelloWordl;

public class MainActivity extends AppCompatActivity {

    //https://www.youtube.com/watch?v=Zsjct40iJjE&t=909s

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HelloWordl.printLog("From_SDK", "Hello from SDK");
        HelloWordl.printRaviTeja("test", "testRavi");
    }
}