package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class xiucaiduo extends AppCompatActivity {
    Intent a, b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xiucaiduo);
        Button origin = (Button) findViewById(R.id.fanhui);
        origin.setOnClickListener(new ButtonListener());
        Button rule = (Button) findViewById(R.id.restart);
        rule.setOnClickListener(new ButtonListener());

    }
    class ButtonListener implements View.OnClickListener{
        Intent a,b;
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.fanhui:
                    a = new Intent(xiucaiduo.this, choooooose.class);
                    startActivity(a);
                    break;

                case R.id.restart:
                    b = new Intent(xiucaiduo.this, multi.class);
                    startActivity(b);
                    break;
            }
        }
    }

}