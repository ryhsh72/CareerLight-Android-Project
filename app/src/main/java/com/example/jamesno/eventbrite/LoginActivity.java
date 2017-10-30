package com.example.jamesno.eventbrite;

import android.content.Intent;
import android.view.View;

import com.facebook.accountkit.AccountKit;
import com.facebook.accountkit.AccessToken;
import com.facebook.accountkit.ui.AccountKitActivity;
import com.facebook.accountkit.ui.AccountKitConfiguration;
import com.facebook.accountkit.ui.LoginType;

/**
 * Created by James No on 10/29/2017.
 */

public class LoginActivity extends MainActivity {
//    AccessToken accessToken = AccountKit.getCurrentAccessToken();
//    public static int APP_REQUEST_CODE = 99;
//
//    if(accessToken !=null) {
//            //Handle Returning User
//    } else {
//            //Handle new or logged out user
//    }
//
//
//    // Login Flow for SMS
//
//    public void phoneLogin(final View view) {
//        final Intent intent = new Intent(getActivity(), AccountKitActivity.class);
//        AccountKitConfiguration.AccountKitConfigurationBuilder configurationBuilder =
//                new AccountKitConfiguration.AccountKitConfigurationBuilder(
//                        LoginType.PHONE,
//                        AccountKitActivity.ResponseType.CODE); // or .ResponseType.TOKEN
//        // ... perform additional configuration ...
//        intent.putExtra(
//                AccountKitActivity.ACCOUNT_KIT_ACTIVITY_CONFIGURATION,
//                configurationBuilder.build());
//        startActivityForResult(intent, APP_REQUEST_CODE);
//    }
//
//    // Login Flow for Email
//
//    public void emailLogin(final View view) {
//        final Intent intent = new Intent(getActivity(), AccountKitActivity.class);
//        AccountKitConfiguration.AccountKitConfigurationBuilder configurationBuilder =
//                new AccountKitConfiguration.AccountKitConfigurationBuilder(
//                        LoginType.EMAIL,
//                        AccountKitActivity.ResponseType.CODE); // or .ResponseType.TOKEN
//        // ... perform additional configuration ...
//        intent.putExtra(
//                AccountKitActivity.ACCOUNT_KIT_ACTIVITY_CONFIGURATION,
//                configurationBuilder.build());
//        startActivityForResult(intent, APP_REQUEST_CODE);
//    }
}
