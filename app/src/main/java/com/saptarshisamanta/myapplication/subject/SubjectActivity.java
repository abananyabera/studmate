package com.saptarshisamanta.myapplication.subject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.saptarshisamanta.myapplication.R;
import com.saptarshisamanta.myapplication.databinding.ActivitySubjectBinding;

public class SubjectActivity extends AppCompatActivity {
    ActivitySubjectBinding activitySubjectBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activitySubjectBinding = DataBindingUtil.setContentView(this,R.layout.activity_subject);
    }
}
