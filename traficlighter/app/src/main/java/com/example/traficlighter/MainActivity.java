package com.example.traficlighter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {

    private LinearLayout mLila;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLila = findViewById(R.id.LinearLayout1);
    }
    public void onClick(View v){
        int id = v.getId();
        if(id == R.id.buttonred1){
            mLila.setBackgroundColor(ContextCompat.getColor(this, R.color.red));
        }
        else if(id == R.id.buttongreen3){
            mLila.setBackgroundColor(ContextCompat.getColor(this, R.color.green));
        }
        else if(id == R.id.buttonyellow2){
            mLila.setBackgroundColor(ContextCompat.getColor(this, R.color.yellow));
        }
    }

}