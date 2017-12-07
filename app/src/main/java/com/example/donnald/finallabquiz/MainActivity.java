package com.example.donnald.finallabquiz;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etAuthor, etQuote;
    Button btnSave, btnNext;
    SharedPreferences preferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etAuthor = (EditText) findViewById(R.id.et_author);
        etQuote = (EditText) findViewById(R.id.et_quote);
        btnSave = (Button) findViewById(R.id.btn_save);
        btnNext = (Button) findViewById(R.id.btn_next);
        preferences = PreferenceManager.getDefaultSharedPreferences(this);
    }

    public void saveInfo(View view){

        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("author",etAuthor.getText().toString());
        editor.putString("quote",etQuote.getText().toString());
        editor.commit();
        Toast.makeText(this, "Saved in Shared Preferences!", Toast.LENGTH_LONG).show();
    }

    public void goNext(View view) {
        Intent intent = new Intent(this, SecondaryActivity.class);
        startActivity(intent);
    }



}
