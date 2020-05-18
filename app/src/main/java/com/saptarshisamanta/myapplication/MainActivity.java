package com.saptarshisamanta.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.saptarshisamanta.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    int sem;
    String stream;
    String CSE = "cse";
    ActivityMainBinding activityMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        activityMainBinding.cse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stream = CSE;
            }
        });
        activityMainBinding.first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sem = 1;
            }
        });
    }
    public void choose(View view){
        if (stream ==  CSE){
            if (sem == 1){
                //code for intent
            }
        }
    }
}
