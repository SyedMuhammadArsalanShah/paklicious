package com.example.paklicious;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;


public class Main2Activity extends AppCompatActivity {

    ViewPager pager;
    int[] images = {R.drawable.chikennihari, R.drawable.acharichiken, R.drawable.malaitikkabiryani,R.drawable.chikenqorma,R.drawable.karachihaleem,R.drawable.daalchanafry,R.drawable.beefnihari,R.drawable.chikenwhitekarachi};

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
