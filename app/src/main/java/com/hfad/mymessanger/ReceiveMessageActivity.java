package com.hfad.mymessanger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ReceiveMessageActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "message";   //This is the name of the extra value we’re passing in the intent

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);

        Intent intent = getIntent(); // we are getting intent in here

        String messageText =  intent.getStringExtra(EXTRA_MESSAGE); // here we are getting the message from our intent using getStringExtra()

        TextView messageView = (TextView) findViewById(R.id.message); // here we are getting id of TextView in layout which is "message"

        messageView.setText(messageText); // we are setting text  messageText which we get from intent
    }
}