package com.adt;

import android.app.Application;

/**
 * Shayan Rais (http://shanraisshan.com)
 * created on 1/4/2017
 */

public class App extends Application {
//http://stackoverflow.com/questions/21818905/get-application-context-from-non-activity-singleton-class

	public static String package_name;
    
    @Override
    public void onCreate() {
        super.onCreate();
        package_name = getPackageName();
    }
}
