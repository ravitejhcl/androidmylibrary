package com.test.samplelib;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.test.androidmylibrary.HelloWordl;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HelloWordl.printLog("From_SDK", "Hello from SDK");
    }
}