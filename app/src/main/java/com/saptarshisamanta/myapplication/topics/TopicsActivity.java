package com.saptarshisamanta.myapplication.topics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.saptarshisamanta.myapplication.R;
import com.saptarshisamanta.myapplication.databinding.ActivityTopicsBinding;

public class TopicsActivity extends AppCompatActivity {

    ActivityTopicsBinding activityTopicsBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityTopicsBinding = DataBindingUtil.setContentView(this,R.layout.activity_topics);
    }
}
