package com.spy.takechargeofme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;

public class AskTell extends AppCompatActivity {

    ImageView contactPicture;
    EditText contactName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_ask_tell);
        contactPicture = (ImageView)findViewById(R.id.contactPicture);
        contactName = (EditText)findViewById(R.id.contactName);

        contactName.setText("Ramez");
    }
}
