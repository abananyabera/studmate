package com.saptarshisamanta.myapplication.data;

import android.content.Context;
import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;

public class Details {

    public String title;
    public int image;

    public Details(String title, int image) {
        this.title = title;
        this.image = image;
    }


    @BindingAdapter("imageUrl")
    public static void setImage(ImageView imageView, int url) {
        Context context = imageView.getContext();

        Glide.with(context)
                .load(url)
                .into(imageView);
    }
}
