package com.example.clinic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class slideAdapter extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;


    public slideAdapter(Context context)
    {
        this.context = context;
    }
    public int[] slide_images =
            {
         R.drawable.hos,
         R.drawable.doc,
         R.drawable.healthy
            };
    public String[] slide_head =
            {
                    "Welcome To Our Smart Clinic, You can request, view  and cancel your Appointment",
                    "",
                    "",

            };
    public String[] slide_string =
            {
              "",
              "The fastest & most affordable medical home visit services , nearest doctor arrives within few hours from your request ",
              "We endeavor to provide the best possible services to the patient",

            };
    public String[] slideBtn_string =
            {
                    "Skip",
                    "Skip",
                    "Start",

            };
    @Override
    public int getCount() {
        return slide_head.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view== (RelativeLayout) object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

       layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
       View view = layoutInflater.inflate(R.layout.slide_layout, container, false);

        ImageView SlideImageView = (ImageView) view.findViewById(R.id.slide_image);
        TextView SlideHead = (TextView) view.findViewById(R.id.slide_head);
        TextView SlideString = (TextView) view.findViewById(R.id.slide_string);

        SlideImageView.setImageResource(slide_images[position]);
        SlideHead.setText(slide_head[position]);
        SlideString.setText(slide_string[position]);


        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout)object);
    }
}
