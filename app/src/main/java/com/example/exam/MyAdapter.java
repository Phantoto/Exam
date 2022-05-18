package com.example.exam;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.core.app.NavUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

public class MyAdapter extends FragmentStateAdapter {

    private static final int Num = 5;

    ArrayList<String> pages ;

    public MyAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);

        pages = new ArrayList<>();

        pages.add("page no one");
        pages.add("page no two");
        pages.add("page no three");
        pages.add("page no four");
        pages.add("page no five");

    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        OneFragment oneFragment = new OneFragment();

        Bundle bundle = new Bundle();
        bundle.putString("mykey", pages.get(position));
        oneFragment.setArguments(bundle);

        return oneFragment;
    }

    @Override
    public int getItemCount() {
        return Num;
    }
}
