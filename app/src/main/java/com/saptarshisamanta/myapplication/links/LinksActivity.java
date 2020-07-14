package com.saptarshisamanta.myapplication.links;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.saptarshisamanta.myapplication.R;
import com.saptarshisamanta.myapplication.data.Links;
import com.saptarshisamanta.myapplication.data.LinksAdapter;
import com.saptarshisamanta.myapplication.databinding.ActivityLinksBinding;

import java.util.ArrayList;
import java.util.List;

public class LinksActivity extends AppCompatActivity {
    ActivityLinksBinding activityLinksBinding;
    private LinksActivityViewModel linksActivityViewModel;
    public LinksAdapter linksAdapter;
    private ArrayList<Links> linksList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityLinksBinding = DataBindingUtil.setContentView(this,R.layout.activity_links);

        linksActivityViewModel = new ViewModelProvider(this).get(LinksActivityViewModel.class);
        linksAdapter = new LinksAdapter(linksList);
        activityLinksBinding.linkList.setLayoutManager(new LinearLayoutManager(this));
        activityLinksBinding.linkList.setAdapter(linksAdapter);
        linksAdapter.setOnItemClickedListener(new LinksAdapter.OnItemClickedListener() {
            @Override
            public void OnItemClicked(int position) {
                //open the link
            }
        });

    }
}
