package com.codeclan.example.stringsplit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCountActivity extends AppCompatActivity {

    EditText words;
    Button shakeButton;
    TextView answerText;
    WordCounter counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_counter);

        words = (EditText)findViewById(R.id.words);
        shakeButton = (Button)findViewById(R.id.shake_btn);
        answerText = (TextView)findViewById(R.id.answer_text);

        counter = new WordCounter();
    }

    public void onWordCountButtonClick(View button) {
        String text = words.getText().toString();
        int count = counter.getCount(text);
        answerText.setText(Integer.toString(count) + " words entered!");
    }
}
