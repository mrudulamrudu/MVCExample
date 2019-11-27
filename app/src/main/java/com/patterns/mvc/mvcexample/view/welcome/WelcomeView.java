package com.patterns.mvc.mvcexample.view.welcome;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

import com.patterns.mvc.mvcexample.R;
import com.patterns.mvc.mvcexample.view.MainView;

public class WelcomeView implements MainView {

    private View rootView;

    public WelcomeView(Context context) {
        rootView = LayoutInflater.from(context).inflate(R.layout.activity_welcome, null);
    }

    @Override
    public View getRootView() {
        return rootView;
    }

    @Override
    public void initializeViews() {

    }
}
