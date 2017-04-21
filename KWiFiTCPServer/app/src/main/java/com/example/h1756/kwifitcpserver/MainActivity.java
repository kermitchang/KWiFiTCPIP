package com.example.h1756.kwifitcpserver;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private final String TAG = "MainActivity";
    private final String TAG_KERMIT = " by kermit";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate" + TAG_KERMIT);
    }

    @Override
    public void onStart(){
        super.onStart();
        Log.i(TAG, "onStart" + TAG_KERMIT);
    }

    @Override
    public void onResume(){
        super.onResume();
        Log.i(TAG, "onResume" + TAG_KERMIT);
    }

    @Override
    public void onPause(){
        super.onPause();
        Log.i(TAG, "onPause" + TAG_KERMIT);
    }

    @Override
    public void onStop(){
        super.onStop();
        Log.i(TAG, "onStop" + TAG_KERMIT);
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.i(TAG, "onDestroy" + TAG_KERMIT);
    }


}
