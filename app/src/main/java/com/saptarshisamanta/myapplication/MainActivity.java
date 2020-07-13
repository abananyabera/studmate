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
    String IT ="it";
    String EE ="ee";
    String ECE ="ece";
    String ME = "me";
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
        activityMainBinding.ee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stream = EE;
            }
        });
        activityMainBinding.first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sem = 1;
            }
        });
        activityMainBinding.second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sem =2;
            }
        });
    }
    public void choose(View view){
        if (stream ==  CSE){
            if (sem == 1){
                //code for intent
            }
            if (sem == 2){
                //code for intent
            }
            if (sem == 3){
                //code for intent
            }
            if (sem == 4){
                //code for intent
            }
            if (sem == 5){
                //code for intent
            }
            if (sem == 6){
                //code for intent
            }
            if (sem == 7){
                //code for intent
            }
            if (sem == 8){
                //code for intent
            }
        }
        if (stream ==  IT){
            if (sem == 1){
                //code for intent
            }
            if (sem == 2){
                //code for intent
            }
            if (sem == 3){
                //code for intent
            }
            if (sem == 4){
                //code for intent
            }
            if (sem == 5){
                //code for intent
            }
            if (sem == 6){
                //code for intent
            }
            if (sem == 7){
                //code for intent
            }
            if (sem == 8){
                //code for intent
            }
        }
        if (stream ==  EE){
            if (sem == 1){
                //code for intent
            }
            if (sem == 2){
                //code for intent
            }
            if (sem == 3){
                //code for intent
            }
            if (sem == 4){
                //code for intent
            }
            if (sem == 5){
                //code for intent
            }
            if (sem == 6){
                //code for intent
            }
            if (sem == 7){
                //code for intent
            }
            if (sem == 8){
                //code for intent
            }
        }
        if (stream ==  ECE){
            if (sem == 1){
                //code for intent
            }
            if (sem == 2){
                //code for intent
            }
            if (sem == 3){
                //code for intent
            }
            if (sem == 4){
                //code for intent
            }
            if (sem == 5){
                //code for intent
            }
            if (sem == 6){
                //code for intent
            }
            if (sem == 7){
                //code for intent
            }
            if (sem == 8){
                //code for intent
            }
        }
        if (stream ==  ME){
            if (sem == 1){
                //code for intent
            }
            if (sem == 2){
                //code for intent
            }
            if (sem == 3){
                //code for intent
            }
            if (sem == 4){
                //code for intent
            }
            if (sem == 5){
                //code for intent
            }
            if (sem == 6){
                //code for intent
            }
            if (sem == 7){
                //code for intent
            }
            if (sem == 8){
                //code for intent
            }
        }


    }
}
