package com.example.paklicious;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class Main7Activity extends AppCompatActivity {
    ViewPager pager;
    int[] images = {R.drawable.shehadchikensalad, R.drawable.piyazsalad, R.drawable.muttontamatarsalad,R.drawable.fruitsalad};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        pager = findViewById(R.id.pager);
        ImagesAdapter adapter = new ImagesAdapter(this, images);
        pager.setAdapter(adapter);
    }
}
