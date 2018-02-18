package com.example.unouser.testing;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textValue = findViewById(R.id.textView);
                textValue.setText(Integer.toString(MyWorker.doubleTheValue(Integer.parseInt(textValue.getText().toString()))));

                Snackbar.make(view, "Changed value to double the original", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
