package com.bilisimguru.bilisimguru;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


/**
 * Splash screen of app. Show sounded animated gif for 5 seconds and
 * starts MainActivity.
 */
public class SplashActivity extends AppCompatActivity {

    // Splash Screen Timer
    private static int SPLASH_TIME_OUT = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        MediaPlayer mp = MediaPlayer.create(SplashActivity.this, R.raw.splash_sound2);
        mp.start();

        new Handler().postDelayed (new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);

                finish ();
            }
        }, SPLASH_TIME_OUT);


    }
}
