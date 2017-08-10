package com.deadapps.unmsm.presentation.activities;

import android.os.Bundle;

import com.deadapps.unmsm.core.BaseActivity;
import com.deadapps.unmsm.data.local.SessionManager;

public class LoadActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null)
            initialProcess();
    }

    private void initialProcess() {
        SessionManager mSessionManager = new SessionManager(getApplicationContext());
        if(mSessionManager.isLogin()){
            nextActivity(this,null, HomeActivity.class, true);
        }else{
            //nextActivity(this,null, InformationActivity.class, true);
        }
    }
}