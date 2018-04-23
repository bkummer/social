package com.limerick.cs4028.social;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.firebase.ui.auth.AuthUI;
import com.firebase.ui.auth.IdpResponse;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SignInActivity extends BaseActivity implements View.OnClickListener {

    private static final int RC_SIGN_IN = 123;
    private static final String TAG = "SignInActivity";
    private FirebaseAuth auth;
    private FirebaseUser user;

    public void onClickSignIn(View view) {
        auth = FirebaseAuth.getInstance();
        user = auth.getCurrentUser();
        if (user != null){
            showPopUpMessage("already signed in, displayName= " + user.getDisplayName() + ", " +
            "email= " + user.getEmail() + ", " +
            "uuid= " + user.getUid());
        } else {
            List<AuthUI.IdpConfig> providers = Arrays.asList(new AuthUI.EMAIL_PROVIDER).build());
            startActivityForResult(
                    AuthUI.getInstance().createSignInIntentBuilder().setAvailableProviders(providers).build(),RC_SIGN_IN);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(int requestCode, int resultCode, Intent data);
        if(requestCode == RC_SIGN_IN) {
            IdpResponse response = IdpResponse.fromResultIntent(data);

            if(resultCode == RESULT_OK) {
                FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
                showPopUpMessage("sign in successful, " );
            }else{
                if (response == null) {
                    showPopUpMessage("sign in cancelled");
                    return;
                }
            }

        }
    }

    private void showPopUpMessage(String message) {
        Log.e(TAG, message);

        CoordinatorLayout coordinatorLayout = findViewById(R.id.coordinator_layout);
        Snackbar.make(coordinatorLayout, message, Snackbar.LENGTH_INDEFINITE).show();
    }
}
