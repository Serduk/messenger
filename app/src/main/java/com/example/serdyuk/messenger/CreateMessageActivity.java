package com.example.serdyuk.messenger;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Random;

public class CreateMessageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    public void onSendMessage(View view) {
        float random = new Random().nextFloat();
        System.out.println("Clicked!");
        System.out.println("Random Float to transfer" + random);
        EditText textView = findViewById(R.id.message);
        String textInMessage = textView.getText().toString();

//        Intent intent = new Intent(this, ReceivedMessage.class);
//        intent.putExtra(ReceivedMessage.EXTRA_MESSAGE, textInMessage);
//        intent.putExtra("random", random);

//        Intent intent = new Intent(Intent.ACTION_SEND);
//        intent.setType("text/plain");
//        intent.putExtra(Intent.EXTRA_SUBJECT, "This is Test Message");
//        intent.putExtra(Intent.EXTRA_TEXT, textInMessage);

        Intent intent;

        try {
            intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "This is Test Message");
            intent.putExtra(Intent.EXTRA_TEXT, textInMessage);

//            If User should always choose in which app he should send message
//            Intent intentChooser = Intent.createChooser(intent, textInMessage);
//            startActivity(intentChooser);
        } catch (ActivityNotFoundException e) {
            e.printStackTrace();
            intent = new Intent(this, ReceivedMessage.class);
            intent.putExtra(ReceivedMessage.EXTRA_MESSAGE, textInMessage);
            intent.putExtra("random", random);
        }

        startActivity(intent);
    }
}
