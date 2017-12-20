package com.example.dawar.jsonresponcedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        String value = getIntent().getExtras().getString("email");
        TextView tv=(TextView)findViewById(R.id.tv);
        tv.setText(value);
    }
}
