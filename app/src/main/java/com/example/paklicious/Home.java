package com.example.paklicious;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


    }

    public void trd(View view) {


        Intent intent =new Intent(Home.this,Main2Activity.class);
        startActivity(intent);

    }

    public void bbq(View view) {


        Intent intent =new Intent(Home.this,Main5Activity.class);
        startActivity(intent);
    }

    public void sld(View view) {

        Intent intent =new Intent(Home.this,Main6Activity.class);
        startActivity(intent);
    }

    public void des(View view) {

        Intent intent =new Intent(Home.this,Main7Activity.class);
        startActivity(intent);
    }
}
