package com.saptarshisamanta.myapplication.links;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.saptarshisamanta.myapplication.R;
import com.saptarshisamanta.myapplication.databinding.ActivityLinksBinding;

public class LinksActivity extends AppCompatActivity {
    ActivityLinksBinding activityLinksBinding;
    private LinksActivityViewModel linksActivityViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityLinksBinding = DataBindingUtil.setContentView(this,R.layout.activity_links);

        linksActivityViewModel = new ViewModelProvider(this).get(LinksActivityViewModel.class);
    }
}
