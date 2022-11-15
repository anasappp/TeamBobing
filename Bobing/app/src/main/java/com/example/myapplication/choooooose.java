package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class choooooose extends AppCompatActivity {
    Intent a,b,c,d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choooooose);
        Button origin = (Button) findViewById(R.id.origin);
        origin.setOnClickListener(new ButtonListener());
        Button rule = (Button) findViewById(R.id.rule);
        rule.setOnClickListener(new ButtonListener());
        Button single = (Button) findViewById(R.id.single);
        single.setOnClickListener(new ButtonListener());
        Button duoren = (Button) findViewById(R.id.duoren);
        duoren.setOnClickListener(new ButtonListener());

    }
    class ButtonListener implements View.OnClickListener{
        Intent a,b,c,d;
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.origin:
                    a = new Intent(com.example.myapplication.choooooose.this, origin.class);
                    startActivity(a);
                    break;

                case R.id.rule:
                    b = new Intent(com.example.myapplication.choooooose.this, rule1.class);
                    startActivity(b);
                    break;

                case R.id.single:
                    c = new Intent(com.example.myapplication.choooooose.this, singlegame.class);
                    startActivity(c);
                    break;

                case R.id.duoren:
                    d = new Intent(com.example.myapplication.choooooose.this, duoren.class);
                    startActivity(d);
                    break;
            }
        }
    }

}