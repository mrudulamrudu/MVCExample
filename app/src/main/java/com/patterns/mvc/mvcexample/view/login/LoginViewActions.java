package com.patterns.mvc.mvcexample.view.login;

import com.patterns.mvc.mvcexample.view.MainView;

public interface LoginViewActions extends MainView {

    void goToWelcomeScreen();

    void displayErrorMessage(String error);

}
