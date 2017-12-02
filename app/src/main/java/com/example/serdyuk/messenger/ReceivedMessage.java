package com.example.serdyuk.messenger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ReceivedMessage extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "Empty Message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_received_message);

        Intent intent = getIntent();

        String intentMessage = intent.getStringExtra(EXTRA_MESSAGE);
        TextView textView = findViewById(R.id.receivedMessage);
        textView.setText(intentMessage);
    }
}
