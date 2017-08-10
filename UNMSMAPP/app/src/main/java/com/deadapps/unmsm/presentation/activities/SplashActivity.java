package com.deadapps.unmsm.presentation.activities;

import android.os.Bundle;
import android.os.Handler;

import com.deadapps.unmsm.R;
import com.deadapps.unmsm.core.BaseActivity;

public class SplashActivity extends BaseActivity {

    private final int SPLASH_DISPLAY_LENGTH = 2500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                nextActivity(SplashActivity.this, null, LoadActivity.class, true);
                SplashActivity.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}