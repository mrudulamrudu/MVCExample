package com.patterns.mvc.mvcexample.view.login;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.patterns.mvc.mvcexample.R;
import com.patterns.mvc.mvcexample.activities.WelcomeActivity;
import com.patterns.mvc.mvcexample.controller.login.LoginController;
import com.patterns.mvc.mvcexample.model.LoginModelImplementor;
import com.patterns.mvc.mvcexample.view.MainView;

public class LoginView implements View.OnClickListener, MainView, LoginViewActions {

    private LoginController loginController;

    private EditText editTextEmail, editTextPassword;
    private Button btnLogin;

    private View rootView;

    public LoginView(Context context) {
        rootView = LayoutInflater.from(context).inflate(R.layout.activity_login, null);
        LoginModelImplementor loginModelImplementor = new LoginModelImplementor();
        loginController = new LoginController(this, loginModelImplementor);
    }

    @Override
    public void onClick(View v) {
        loginController.onLoginBtnClicked(editTextEmail.getText().toString().trim(),
                editTextPassword.getText().toString().trim());
    }

    @Override
    public View getRootView() {
        return rootView;
    }

    @Override
    public void initializeViews() {
        editTextEmail = rootView.findViewById(R.id.editTextEmail);
        editTextPassword = rootView.findViewById(R.id.editTextPassword);
        btnLogin = rootView.findViewById(R.id.btnlogin);

        btnLogin.setOnClickListener(this);
    }

    private void clearInputs() {
        editTextEmail.setText("");
        editTextPassword.setText("");
    }

    @Override
    public void goToWelcomeScreen() {
        clearInputs();
        Intent intent = new Intent(rootView.getContext(), WelcomeActivity.class);
        rootView.getContext().startActivity(intent);
    }

    @Override
    public void displayErrorMessage(String error) {
        Toast.makeText(rootView.getContext(), error, Toast.LENGTH_SHORT).show();
    }
}
