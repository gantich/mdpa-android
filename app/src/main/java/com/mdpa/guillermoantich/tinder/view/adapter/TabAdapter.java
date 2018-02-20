package com.mdpa.guillermoantich.tinder.view.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.mdpa.guillermoantich.tinder.view.MessagingFragment;
import com.mdpa.guillermoantich.tinder.view.PeopleDiscoveryFragment;
import com.mdpa.guillermoantich.tinder.view.SettingsFragment;

/**
 * Created by master on 12/2/18.
 */

public class TabAdapter extends FragmentPagerAdapter {

    public TabAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch(position) {
            case 0:
                return PeopleDiscoveryFragment.newInstance();
            case 1:
                return MessagingFragment.newInstance();
            case 2:
                return SettingsFragment.newInstance();
        }

        return null;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch(position) {
            case 0:
                return "Discovery";
            case 1:
                return "Messaging";
            case 2:
                return "Settings";
        }

        return null;
    }


    @Override
    public int getCount() {
        return 3;
    }
}