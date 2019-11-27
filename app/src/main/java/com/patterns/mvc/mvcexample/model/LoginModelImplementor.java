package com.patterns.mvc.mvcexample.model;

import android.text.TextUtils;

public class LoginModelImplementor implements LoginModel {

    public LoginModelImplementor() {
    }

    @Override
    public boolean onLoginBtnClicked(String email, String password) throws Exception {
        if (TextUtils.isEmpty(email)) {
            throw new Exception("Email is empty");
        }
        if (TextUtils.isEmpty(password)) {
            throw new Exception("password is empty");
        }
        return true;
    }
}
