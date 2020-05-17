package com.lister.autopacktest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private int mUnuesed;
    private String mUnUsedString = "hahaha";
    private boolean mShouldShowDensity = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_test).setOnClickListener(this);

        if (true) {
            Log.e("TAG", "density: " + SizeUtils.getDensity(this));
        } else {
            Log.e("TAG", "nothing to show");
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_test:
                startActivity(new Intent(this, SecondActivity.class));
                break;
        }
    }
}
