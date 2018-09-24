package com.mdpa.guillermoantich.tinder.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.mdpa.guillermoantich.tinder.R;
import com.mdpa.guillermoantich.tinder.view.model.DiscoveryViewModel;
import com.mdpa.guillermoantich.tinder.view.model.UserLoginViewModel;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    //private DiscoveryViewModel loginViewModel;

    private UserLoginViewModel userLoginViewModel;

    @BindView(R.id.login_normal) Button emailLoginButton;
    @BindView(R.id.login_facebook) Button facebookLoginButton;
    @BindView(R.id.login_normal_email) EditText loginNormalEmail;
    @BindView(R.id.login_normal_password) EditText loginNormalPassword;
    @BindView(R.id.login) Button loginButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        final String loginEmail = loginNormalEmail.getText().toString();
        final String loginPassword = loginNormalPassword.getText().toString();

    }

    @OnClick(R.id.login_normal)
    public void onEmailLoginDropdownButtonClicked() {
        loginNormalEmail.setVisibility(View.VISIBLE);
        loginNormalPassword.setVisibility(View.VISIBLE);
        loginButton.setVisibility(View.VISIBLE);
        emailLoginButton.setVisibility(View.GONE);
    }
    @OnClick(R.id.login_facebook)
    public void onFacebookLoginButtonClicked() {
        Intent intent = new Intent(MainActivity.this, TabbedActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.login)
    public void onEmailLoginButtonClicked() {
        try {
            //userLoginViewModel.OnLoginUser(username.getText().toString(), password.getText().toString());
        }
        catch (IllegalArgumentException e) {
            //Toast.makeText(this, R.string.login_empty, Toast.LENGTH_SHORT).show();
        }
        Intent intent = new Intent(MainActivity.this, TabbedActivity.class);
        startActivity(intent);
    }




}
