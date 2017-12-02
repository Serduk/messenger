package com.example.serdyuk.messenger;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateMessageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    public void onSendMessage(View view) {
        System.out.println("Clicked!");
        EditText textView = findViewById(R.id.message);
        String textInMessage = textView.getText().toString();

        Intent intent = new Intent(this, ReceivedMessage.class);
        intent.putExtra(ReceivedMessage.EXTRA_MESSAGE, textInMessage);
        startActivity(intent);
    }
}
