package com.oneago.arusapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void main_service(View v) {

        Intent main_service = new Intent(this, service_Management.class);
        startActivity(main_service);

        }
    public void main_inquiry(View v) {

        Intent main_inquiry = new Intent(this, activity_inquiry.class);
        startActivity(main_inquiry);

    }

    public void main_session(View v) {

        Intent main_session= new Intent(this, activity_sessions.class);
        startActivity(main_session);

    }
    }
