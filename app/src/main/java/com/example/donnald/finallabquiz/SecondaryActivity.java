package com.example.donnald.finallabquiz;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondaryActivity extends AppCompatActivity {
    SharedPreferences preferences;
    TextView tvAuthor, tvQuote;
    Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);
        tvAuthor = (TextView) findViewById(R.id.tv_author_out);
        tvQuote = (TextView) findViewById(R.id.tv_quote_out);
        btnBack = (Button) findViewById(R.id.btn_back);
        preferences = PreferenceManager.getDefaultSharedPreferences(this);

        String author = preferences.getString("author","");
        //second parameter is default return value
        String quote = preferences.getString("quote","");
        tvAuthor.setText(author);
        tvQuote.setText(quote);
    }


    public void goBack(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
