package com.example.darshanapriyasad.driverapp.contexthandler;

import android.app.Application;
import android.content.Context;

/**
 * Created by Darshana Priyasad on 1/18/2016.
 */
public class ContextConnection  extends Application {
    private static Context context;

    @Override
    public void onCreate(){
        super.onCreate();
        context=getApplicationContext();
    }

    public static Context getCustomAppContext(){
        return context;
    }
}
