package com.example.fisioapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println ("Hello again");

        View view = findViewById(R.id.view);

        Snackbar.make(view, "www.journaldev.com", Snackbar.LENGTH_LONG).show
    }
}