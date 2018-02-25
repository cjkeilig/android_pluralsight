package com.example.unouser.customcomponents;

import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private LengthPicker mHeight;
    private LengthPicker mWidth;
    private TextView mArea;

    @Override
    protected void onResume() {
        super.onResume();
        updateArea();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mHeight = (LengthPicker) findViewById(R.id.height);
        mWidth = (LengthPicker) findViewById(R.id.width);
        mArea = (TextView) findViewById(R.id.area);

        LengthPicker.OnChangeListener listener = new LengthPicker.OnChangeListener() {
            @Override
            public void onChange(int lenght) {
                updateArea();
            }
        };

        mWidth.setOnChangeListener(listener);
        mHeight.setOnChangeListener(listener);
    }

    private void updateArea() {
        int area = mWidth.getNumInches() * mHeight.getNumInches();
        mArea.setText(area + " sq in");
    }
}
