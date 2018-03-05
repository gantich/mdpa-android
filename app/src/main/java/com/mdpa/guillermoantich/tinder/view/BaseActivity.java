package com.mdpa.guillermoantich.tinder.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mdpa.guillermoantich.tinder.Tinder;

public class BaseActivity extends AppCompatActivity {

    public Tinder getMyApplication() {
        return ((Tinder)getApplication());
    }

    public void setViewPagerPosition(int position) {
        Tinder app = (Tinder) getApplication();
        app.viewPagerPosition = position;
    }

    public int getViewPagerPosition() {
        Tinder app = (Tinder) getApplication();
        return app.viewPagerPosition;
    }
}
