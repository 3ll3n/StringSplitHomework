package com.codeclan.example.stringsplit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by user on 27/02/2017.
 */

public class StringSplitterActivity extends AppCompatActivity {

    EditText words;
    Button shakeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_string_splitter);

        words = (EditText)findViewById(R.id.words);
        shakeButton = (Button)findViewById(R.id.shake_btn);
    }
}
