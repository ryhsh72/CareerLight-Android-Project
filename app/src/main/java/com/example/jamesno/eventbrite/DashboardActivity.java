package com.example.jamesno.eventbrite;

/**
 * Created by jennifer on 10/20/2017.
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.TextView;
public abstract class DashboardActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }
/*
    public void setHeader(String title, boolean btnHomeVisible)
    {
        ViewStub stub = (ViewStub) findViewById(R.id.vsHeader);
        View inflated = stub.inflate();

        TextView txtTitle = (TextView) inflated.findViewById(R.id.txtHeading);
        txtTitle.setText(title);

        Button btnHome = (Button) inflated.findViewById(R.id.btnHome);
        if(!btnHomeVisible)
            btnHome.setVisibility(View.INVISIBLE);
    }*/

    public void btnHomeClick(View view)
    {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }



}




