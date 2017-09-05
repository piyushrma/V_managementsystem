package com.example.mytrack;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class SplashFile extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_file);

        Thread background = new Thread(new Runnable() {
            public void run() {
                try {
                  Thread.sleep(5000);
                    Intent in=new Intent(SplashFile.this,LoginActivity.class);
                    startActivity(in);
                    finish();
                } catch (Throwable t) {
                    // just end the background thread
                    Log.i("Animation", "Thread  exception " + t);
                }
            }
        });
        background.start();
    }
}
