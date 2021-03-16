package com.example.paklicious;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

public class ImagesAdapter extends PagerAdapter {

    Context context;
    int[] images;

    public ImagesAdapter(Context context, int[] images) {
        this.context = context;
        this.images = images;
    }

    @Override
    public int getCount() {
        Log.e("images adapter",String.valueOf(images.length));
        return images.length;


    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        SubsamplingScaleImageView imageView = new SubsamplingScaleImageView(context);
        imageView.setImage(ImageSource.resource(images[position]));
        Log.e("images position ",String.valueOf(images[position]));
        container.addView(imageView);

        return imageView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((SubsamplingScaleImageView) object);
    }
}
