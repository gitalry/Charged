package com.example.jamesg.charged;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Jonhsnow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jonhsnow);
    }

    public void Jonhsnow(View view) {
        Intent intent = new Intent(getApplicationContext(), Youknow.class);
        startActivity(intent);
    }
}