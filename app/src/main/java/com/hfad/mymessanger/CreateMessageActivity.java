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
    public void onSendMessage(View view){

        EditText messageView = (EditText) findViewById(R.id.message);
        String messageText = messageView.getText().toString();

        Intent intent = new Intent(this, ReceiveMessageActivity.class); // RMA will be called in intent

        intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE, messageText);

        startActivity(intent);  // this will start the intent
    }
}