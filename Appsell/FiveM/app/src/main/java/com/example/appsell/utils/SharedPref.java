package com.example.appsell.utils;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.appsell.R;

public class SharedPref {
    private static SharedPref sharedPref;
    private SharedPreferences sharedPreferences;

    public static SharedPref getInstance(Context context) {
        if (sharedPref == null) {
            sharedPref = new SharedPref(context);
        }
        return sharedPref;
    }

    private SharedPref(Context context) {
        sharedPreferences = context.getSharedPreferences(context.getResources().getString(R.string.app_name),Context.MODE_PRIVATE);
    }

    public void setUserName(String key,String value) {
        SharedPreferences.Editor prefsEditor = sharedPreferences.edit();
        prefsEditor .putString(key, value);
        prefsEditor.apply();
    }

    public String getUserName(String key) {
        if (sharedPreferences!= null) {
            return sharedPreferences.getString(key, "");
        }
        return "";
    }
}
