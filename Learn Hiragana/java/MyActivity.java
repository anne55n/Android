package com.example.anastassiyaneznanova.learnhiragana;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyActivity extends Activity {
    Button k, sec, third;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        k = (Button) findViewById(R.id.button);
        sec = (Button) findViewById(R.id.button2);
        third = (Button) findViewById(R.id.button3);
    }

    public void onClick(View v) {

        if (v.getId() == R.id.button) {
            Intent intent = new Intent(MyActivity.this, MyActivity2.class);
            startActivity(intent);
        }
        else if (v.getId() == R.id.button2) {
            Intent intent = new Intent(MyActivity.this, MyActivity3.class);
            startActivity(intent);
        }
        else if (v.getId() == R.id.button3) {
            Intent intent = new Intent(MyActivity.this, MyActivity4.class);
            startActivity(intent);
        }

    }
}