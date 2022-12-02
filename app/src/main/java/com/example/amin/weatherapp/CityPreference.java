package com.example.amin.weatherapp;

/**
 * Created by Amin on 11/01/2018.
 */
import android.app.Activity;
import android.content.SharedPreferences;


public class CityPreference {
    SharedPreferences prefs;

    public CityPreference(Activity activity){
        prefs = activity.getPreferences(Activity.MODE_PRIVATE);
    }

    // If the user has not chosen a city yet, return
    // Sydney as the default city
    String getCity(){
        //return prefs.getString("city", "Sydney, AU");
        return prefs.getString("city", "Tehran, IR");
    }

    void setCity(String city){
        prefs.edit().putString("city", city).commit();
    }
}
