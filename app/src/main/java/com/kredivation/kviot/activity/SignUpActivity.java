package com.kredivation.kviot.activity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.graphics.Rect;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.annotation.NonNull;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.OptionalPendingResult;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.gson.Gson;
import com.kredivation.kviot.R;
import com.kredivation.kviot.framework.IAsyncWorkCompletedCallback;
import com.kredivation.kviot.framework.ServiceCaller;
import com.kredivation.kviot.utilities.ASTProgressBar;
import com.kredivation.kviot.utilities.CompatibilityUtility;
import com.kredivation.kviot.utilities.Contants;
import com.kredivation.kviot.utilities.Utility;

import org.json.JSONException;
import org.json.JSONObject;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {

    private TextInputLayout user_layout, email_layout, password_layout, cpassword_layout, first_layout, last_layout;
    private EditText user, email, password, cpassword, lastName, firstName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        initView();
    }


    private void initView() {
        TextView signIn = findViewById(R.id.signIn);
        Button signup = findViewById(R.id.signup);
        user_layout = findViewById(R.id.user_layout);
        user = findViewById(R.id.user);
        email_layout = findViewById(R.id.email_layout);
        email = findViewById(R.id.email);
        password_layout = findViewById(R.id.password_layout);
        password = findViewById(R.id.password);
        cpassword_layout = findViewById(R.id.cpassword_layout);
        cpassword = findViewById(R.id.cpassword);
        first_layout = findViewById(R.id.first_layout);
        firstName = findViewById(R.id.firstName);

        signIn.setOnClickListener(this);
        signup.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnLogIn:
                break;
            case R.id.signUp:
                Intent intent1 = new Intent(SignUpActivity.this, SignInActivity.class);
                startActivity(intent1);
                break;
        }
    }
}
