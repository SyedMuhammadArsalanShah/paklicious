package com.example.paklicious;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class Main6Activity extends AppCompatActivity {
    ViewPager pager;
    int[] images = {R.drawable.gulabjaman, R.drawable.shahikheer, R.drawable.fruitcastard,R.drawable.safaidbarfi};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        pager = findViewById(R.id.pager);
        ImagesAdapter adapter = new ImagesAdapter(this, images);
        pager.setAdapter(adapter);
    }
}
