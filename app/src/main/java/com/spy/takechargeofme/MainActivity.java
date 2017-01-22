package com.spy.takechargeofme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

        Button Send;
        EditText phoneNumber;
        EditText msgText;

        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            phoneNumber = (EditText) findViewById(R.id.phoneNum);
            msgText = (EditText) findViewById(R.id.msgField);

            Send = (Button) findViewById(R.id.smsButton);
            Send.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    sendSMS(phoneNumber.getText().toString(), msgText.getText().toString());
                }
            });
        }
    public void sendSMS (String phoneNb, String msgText) {
        SmsManager sms = SmsManager.getDefault();
        sms.sendTextMessage(phoneNb, "5145693080", msgText, null, null);
    }
}
