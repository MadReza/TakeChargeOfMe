package com.spy.takechargeofme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.ImageView;
import android.provider.ContactsContract;

public class AskTell extends AppCompatActivity {

    ImageView contactPicture;
    TextView contactName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_ask_tell);
        contactPicture = (ImageView)findViewById(R.id.contactPicture);
        contactName = (TextView)findViewById(R.id.contactName);

        contactName.setText("Ramez Nahas, co-team leader k?");

    }
}
