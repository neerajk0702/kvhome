package com.kredivation.kviot.activity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.facebook.CallbackManager;
import com.facebook.FacebookSdk;
import com.facebook.login.widget.LoginButton;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.GoogleApiClient;
import com.kredivation.kviot.R;
import com.kredivation.kviot.utilities.ASTProgressBar;
import com.kredivation.kviot.utilities.CompatibilityUtility;

public class SignInActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etUserName, etPass;
    Button btnLogIn;
    TextView signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        chechPortaitAndLandSacpe();//chech Portait And LandSacpe Orientation
        initView();
    }

    public void chechPortaitAndLandSacpe() {
        if (CompatibilityUtility.isTablet(SignInActivity.this)) {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        } else {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        }

    }

    private void initView() {
        etUserName = findViewById(R.id.etUserName);
        etPass = findViewById(R.id.etPass);
        btnLogIn = findViewById(R.id.btnLogIn);
        signUp = findViewById(R.id.signUp);
        signUp.setOnClickListener(this);
        btnLogIn.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnLogIn:
                Intent i = new Intent(SignInActivity.this, AddServicesActivity.class);
                startActivity(i);
                break;
            case R.id.signUp:
                Intent intent1 = new Intent(SignInActivity.this, SignUpActivity.class);
                startActivity(intent1);
                break;
        }
    }
}
