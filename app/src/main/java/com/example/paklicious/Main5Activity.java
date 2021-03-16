package com.example.paklicious;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class Main5Activity extends AppCompatActivity {
    ViewPager pager;
    int[] images = {R.drawable.beefboti, R.drawable.beefnihari, R.drawable.chikenwhitekarachi,R.drawable.chikenqorma};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        pager = findViewById(R.id.pager);
        ImagesAdapter adapter = new ImagesAdapter(this, images);
        pager.setAdapter(adapter);
    }
}
