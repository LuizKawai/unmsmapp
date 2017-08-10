package com.deadapps.unmsm;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by LuizKawai
 */
public class UNMSMAPP extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/proximanovaregular.otf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }
}
