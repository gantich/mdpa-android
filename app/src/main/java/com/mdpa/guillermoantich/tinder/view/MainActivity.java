package com.mdpa.guillermoantich.tinder.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.mdpa.guillermoantich.tinder.R;
import com.mdpa.guillermoantich.tinder.view.model.DiscoveryViewModel;

public class MainActivity extends AppCompatActivity {

    private DiscoveryViewModel loginViewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Main visible buttons
        final Button emailLoginButton = (Button) findViewById(R.id.login_normal);
        Button facebookLoginButton = (Button) findViewById(R.id.login_facebook);

        //Email login EditTexts and Button (visibility gone)
        final EditText loginNormalEmail = (EditText) findViewById(R.id.login_normal_email);
        final EditText loginNormalPassword = (EditText) findViewById(R.id.login_normal_password);
        final Button loginButton = (Button) findViewById(R.id.login);

        final String loginEmail = loginNormalEmail.getText().toString();
        final String loginPassword = loginNormalPassword.getText().toString();

        //Onclick Listeners for buttons
        emailLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            loginNormalEmail.setVisibility(View.VISIBLE);
            loginNormalPassword.setVisibility(View.VISIBLE);
            loginButton.setVisibility(View.VISIBLE);
            emailLoginButton.setVisibility(View.GONE);
            }
        });
        facebookLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TabbedActivity.class);
                startActivity(intent);

            }
        });
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TabbedActivity.class);
                startActivity(intent);
            }
        });

    }




}
