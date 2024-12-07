package com.example.tablayout;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;


public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout=findViewById(R.id.tab);
        viewPager=findViewById(R.id.viewpager);
        MessengerPageviewAdpater messengerPageviewAdpater=new MessengerPageviewAdpater(getSupportFragmentManager());
        viewPager.setAdapter(messengerPageviewAdpater);
        tabLayout.setupWithViewPager(viewPager);


    }
}