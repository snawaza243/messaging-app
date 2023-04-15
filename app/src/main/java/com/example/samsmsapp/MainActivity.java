package com.example.samsmsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    EditText previewNum;
    EditText previewMsg;
    Button sendMsgBtn;
    TextView previewInbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        previewNum = findViewById(R.id.editTextNum);
//        String inputNumStr =  previewNum.getText().toString();

//        previewMsg = findViewById(R.id.editTextMessage);
//        String inputMsgStr = previewMsg.getText().toString();

        sendMsgBtn = findViewById(R.id.msgSendBtn);
        previewInbox = findViewById(R.id.textViewInbox);
    }
    public void sendMessage(View view ) {

        previewNum = findViewById(R.id.editTextNum);
        String inputNumStr1 =  previewNum.getText().toString();
        String inputNumStr =  "+91"+inputNumStr1;
        previewMsg = findViewById(R.id.editTextMessage);
        String inputMsgStr = previewMsg.getText().toString();
        SmsManager samSms = SmsManager.getDefault();
        samSms.sendTextMessage(inputNumStr, null,inputMsgStr,null,null );

    }
}