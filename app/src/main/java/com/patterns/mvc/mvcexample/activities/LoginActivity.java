package com.patterns.mvc.mvcexample.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.patterns.mvc.mvcexample.view.login.LoginView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initialSetUp();
    }

    private void initialSetUp() {
        LoginView loginView = new LoginView(this);
        setContentView(loginView.getRootView());
        loginView.initializeViews();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
