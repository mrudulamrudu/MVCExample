package com.patterns.mvc.mvcexample.controller.login;

public interface LoginControllerJobs {

    void onLoginBtnClicked(String email, String password);

    void onLoginSuccess();

    void onLoginFailed(String error);
}
