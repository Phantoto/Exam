package com.example.exam;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

public class PageTransformer implements ViewPager2.PageTransformer {

    private static final float Min_scale = 0.85f ;
    private static final float Min_Alpha = 0.5f;

    @Override
    public void transformPage(@NonNull View view, float position) {

        int pagewidth = view.getWidth();
        int pageheight = view.getHeight();


        if(position <-1){
            view.setAlpha(0f);
        }else if(position <= 1){
            float scalefactor = Math.max(Min_scale, 1 - Math.abs(position));
            float vertmargin = pageheight * (1 - scalefactor)/2 ;
            float horzmargin = pagewidth * (1-scalefactor)/2;

            if (position < 0){
                view.setTranslationX(horzmargin-vertmargin/2);
            }else {
                view.setTranslationX(-horzmargin + vertmargin / 2);
            }

            view.setScaleX(scalefactor);
            view.setScaleY(scalefactor);

            view.setAlpha(Min_Alpha +scalefactor - Min_scale / (1 - Min_scale) * (1 - Min_Alpha));
        }else {
            view.setAlpha(0f);


        }

    }
}
