package com.patterns.mvc.mvcexample.controller.login;

import com.patterns.mvc.mvcexample.model.LoginModelImplementor;
import com.patterns.mvc.mvcexample.view.login.LoginView;

public class LoginController implements LoginControllerJobs {

    private LoginView loginView;
    private LoginModelImplementor loginModelImplementor;

    public LoginController(LoginView loginView, LoginModelImplementor loginModelImplementor) {
        this.loginView = loginView;
        this.loginModelImplementor = loginModelImplementor;
    }

    @Override
    public void onLoginBtnClicked(String email, String password) {
        try {
            boolean isSuccess = loginModelImplementor.onLoginBtnClicked(email, password);
            if (isSuccess) {
                onLoginSuccess();
            }
        } catch (Exception e) {
            loginView.displayErrorMessage(e.getMessage());
        }
    }

    @Override
    public void onLoginSuccess() {
        loginView.goToWelcomeScreen();
    }

    @Override
    public void onLoginFailed(String error) {
        loginView.displayErrorMessage(error);
    }
}
