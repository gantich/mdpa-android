package com.mdpa.guillermoantich.tinder.view;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.mdpa.guillermoantich.tinder.R;
import com.mdpa.guillermoantich.tinder.view.adapter.TabAdapter;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button normalLoginButton = (Button) findViewById(R.id.login_normal);
        normalLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TabbedActivity.class);
                startActivity(intent);

            }
        });

        Button facebookLoginButton = (Button) findViewById(R.id.login_facebook);
        facebookLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TabbedActivity.class);
                startActivity(intent);

            }
        });

    }




}
