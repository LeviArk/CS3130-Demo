package com.acme.csci3130;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import static android.provider.AlarmClock.EXTRA_MESSAGE;
import static com.acme.csci3130.R.layout.activity_main;

public class MainActivity extends Activity {
    public static final String Extra_Message = "com.acme.csci3130.MESSAGE";
    EditText editText;
    TextView toShowIt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);
        editText = (EditText) findViewById(R.id.editText);
        toShowIt = (TextView) findViewById(R.id.DisplayText);
    }

    public void changeWords (View view){
        //editText.setText("Found");
        String message = editText.getText().toString();
        toShowIt.setText(message);

    }
}
