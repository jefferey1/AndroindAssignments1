package com.example.androindassignments1;


import android.util.Log;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class activity_list_items extends AppCompatActivity {

    public EditText email;
    public Button login;

    protected static final String ACTIVITY_NAME = "activity_list_items";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_items);
        final String ACTIVITY_NAME = "activity_list_items";
        Log.i(ACTIVITY_NAME, "In onCreate()");

    }
    protected void onResume() {
        super.onResume();
        final String ACTIVITY_NAME = "activity_list_items";
        Log.i(ACTIVITY_NAME, "In onResume()");
        //Log.i(ACTIVITY_NAME, "In onResume()");
    }

    protected void onStart() {
        super.onStart();
        final String ACTIVITY_NAME = "activity_list_items";
        Log.i(ACTIVITY_NAME, "In onCreate()");
        //Log.i(ACTIVITY_NAME, "In onResume()");
    }

    protected void onPause() {
        super.onPause();
        final String ACTIVITY_NAME = "activity_list_items";
        Log.i(ACTIVITY_NAME, "In onPause()");
        //Log.i(ACTIVITY_NAME, "In onResume()");
    }

    protected void onStop() {
        super.onStop();
        final String ACTIVITY_NAME = "activity_list_items";
        Log.i(ACTIVITY_NAME, "In onStop()");
        //Log.i(ACTIVITY_NAME, "In onResume()");
    }

    protected void onDestroy() {
        super.onDestroy();
        final String ACTIVITY_NAME = "activity_list_items";
        Log.i(ACTIVITY_NAME, "In onDestroy()");
        //Log.i(ACTIVITY_NAME, "In onResume()");
    }
    }