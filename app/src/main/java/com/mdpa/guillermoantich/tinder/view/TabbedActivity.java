package com.mdpa.guillermoantich.tinder.view;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.view.MenuItem;

import com.mdpa.guillermoantich.tinder.R;

public class TabbedActivity extends BaseActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabbed);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);

        initFragmentManager();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;
        switch(item.getItemId())
        {
            case R.id.action_discovery:
                fragment = PeopleDiscoveryFragment.newInstance();
                setViewPagerPosition(0);
                break;

            case R.id.action_messaging:
                fragment = MatchFragment.newInstance();
                setViewPagerPosition(1);
                break;
            case R.id.action_settings:
                fragment = SettingsFragment.newInstance();
                setViewPagerPosition(2);
                break;
        }

        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.fragment_container, fragment).commit();

        item.setChecked(true);
        setTitle(item.getTitle());

        return true;
    }

    private void initFragmentManager() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragment = null;
        switch (getViewPagerPosition()){
            case 0:
                fragment = PeopleDiscoveryFragment.newInstance();
                break;
            case 1:
                fragment = MatchFragment.newInstance();
                break;
            case 2:
                fragment = SettingsFragment.newInstance();
                break;
        }
        fragmentManager.beginTransaction().replace(R.id.fragment_container, fragment).commit();
    }
}
