package com.m2diy.androidtoolbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Toolbar的标题");
        toolbar.setNavigationIcon(R.drawable.perm_group_system_tools);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }
}
