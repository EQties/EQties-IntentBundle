package com.example.isabel.application6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView txtv= (TextView) findViewById(R.id.textView);

        Bundle b= getIntent().getExtras();
        String user= b.getString("username");
        String pass= b.getString("password");
        txtv.setText("user: "+user + ",pass: "+pass);
    }
}
