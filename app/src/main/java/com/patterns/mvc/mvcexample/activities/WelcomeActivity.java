package com.patterns.mvc.mvcexample.activities;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.patterns.mvc.mvcexample.view.welcome.WelcomeView;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initialSetUp();
    }

    private void initialSetUp() {
        WelcomeView welcomeView = new WelcomeView(this);
        setContentView(welcomeView.getRootView());
        welcomeView.initializeViews();
    }
}
