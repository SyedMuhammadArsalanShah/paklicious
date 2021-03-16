package com.example.paklicious;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class Main2Activity extends AppCompatActivity {

    ViewPager pager;
    int[] images = {R.drawable.beefboti, R.drawable.beefnihari, R.drawable.chikenwhitekarachi,R.drawable.chikenqorma};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        pager = findViewById(R.id.pager);
        ImagesAdapter adapter = new ImagesAdapter(this, images);
        Log.e("images",String.valueOf(images.length));
        Log.e("images",String.valueOf(pager));
        pager.setAdapter(adapter);




    }
}
