package com.example.etd_pcosson.coursandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SecondeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        GetBiersServices.startActionBiers(this);

    }
}
