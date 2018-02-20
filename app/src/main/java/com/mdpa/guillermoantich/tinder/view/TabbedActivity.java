package com.mdpa.guillermoantich.tinder.view;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.mdpa.guillermoantich.tinder.R;

public class TabbedActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

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
                break;

            case R.id.action_messaging:
                fragment = MessagingFragment.newInstance();
                break;
            case R.id.action_settings:
                fragment = SettingsFragment.newInstance();
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
        PeopleDiscoveryFragment fragment = PeopleDiscoveryFragment.newInstance();
        fragmentManager.beginTransaction().replace(R.id.fragment_container, fragment).commit();
    }
}
