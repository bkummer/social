package com.limerick.cs4028.social;

import android.app.ProgressDialog;
import android.support.v4.widget.ContentLoadingProgressBar;
import android.support.v7.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;


public class BaseActivity extends AppCompatActivity {

    private ContentLoadingProgressBar mProgressBar;

    public void showProgressBar() {
        if (mProgressBar == null) {
            mProgressBar = new ContentLoadingProgressBar(this);
            mProgressBar.show();
        }
    }

    public void hideProgressBar(){
            if(mProgressBar != null){
            mProgressBar.hide();
        }
    }

//    private ProgressDialog mProgressDialog;
//
//    public void showProgressDialog() {
//        if (mProgressDialog == null) {
//            mProgressDialog = new ProgressDialog(this);
//            mProgressDialog.setCancelable(false);
//            mProgressDialog.setMessage("Loading...");
//        }
//
//        mProgressDialog.show();
//    }
//
//    public void hideProgressDialog() {
//        if (mProgressDialog != null && mProgressDialog.isShowing()) {
//            mProgressDialog.dismiss();
//        }
//    }

    public String getUid() {
        return FirebaseAuth.getInstance().getCurrentUser().getUid();
    }


}
