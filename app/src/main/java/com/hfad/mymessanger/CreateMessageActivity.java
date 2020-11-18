package com.hfad.mymessanger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    // this method called when the button is clicked
    public void onSendMessage(View view) {

        EditText messageView = (EditText) findViewById(R.id.message);
        String messageText = messageView.getText().toString();

        Intent intent = new Intent(Intent.ACTION_SEND);

        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, messageText);

        String chooserTitle = getString(R.string.chooser);   // this gets chooser title from xml

        Intent chosenIntent = Intent.createChooser(intent, chooserTitle);

        startActivity(chosenIntent); // this will start the intent

    }
}