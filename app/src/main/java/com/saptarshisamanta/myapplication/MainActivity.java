package com.saptarshisamanta.myapplication;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;
import com.saptarshisamanta.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    Toolbar toolbar;
    NavigationView navigationView;
    private WebView webView;

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

        drawerLayout=findViewById(R.id.drawer);
        navigationView=findViewById(R.id.navigationView);
        navigationView.setNavigationItemSelectedListener(this);


        actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.setDrawerIndicatorEnabled(true);
        actionBarDrawerToggle.syncState();




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

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.exit){
            System.exit(0);
        }
        else if(item.getItemId()==R.id.wiki){
            webView.loadUrl("https://www.wikipedia.org/");
        }
        else if(item.getItemId()==R.id.wikibook){
            webView.loadUrl("https://www.wikibooks.org/");
        }

        return true;
    }
}
