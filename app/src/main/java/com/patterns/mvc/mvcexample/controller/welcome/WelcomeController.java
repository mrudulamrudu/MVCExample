package com.patterns.mvc.mvcexample.controller.welcome;

import com.patterns.mvc.mvcexample.view.welcome.WelcomeView;

public class WelcomeController {

    private WelcomeView welcomeView;

    public WelcomeController(WelcomeView welcomeView) {
        this.welcomeView = welcomeView;
    }
}
