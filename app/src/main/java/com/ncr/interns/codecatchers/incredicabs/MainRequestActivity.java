package com.ncr.interns.codecatchers.incredicabs;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainRequestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_request);

        ViewPager viewPager = findViewById(R.id.viewPager);
        FragmentRequestAdapter fragmentRequestAdapter = new FragmentRequestAdapter(getSupportFragmentManager());
        viewPager.setAdapter(fragmentRequestAdapter);

        TabLayout tabLayout = findViewById(R.id.slider_view);
        tabLayout.setupWithViewPager(viewPager);
    }
}
