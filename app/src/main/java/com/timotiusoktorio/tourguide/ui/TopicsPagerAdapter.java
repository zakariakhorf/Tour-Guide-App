package com.timotiusoktorio.tourguide.ui;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.timotiusoktorio.tourguide.R;

class TopicsPagerAdapter extends FragmentPagerAdapter {

    private String[] mTopics;

    TopicsPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        mTopics = context.getResources().getStringArray(R.array.topics);
    }

    @Override
    public Fragment getItem(int position) {
        return PlacesFragment.newInstance(mTopics[position]);
    }

    @Override
    public int getCount() {
        return mTopics.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTopics[position];
    }
}