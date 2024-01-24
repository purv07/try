package com.example.ps_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class P7_2Page extends AppCompatActivity {
    TextView tv1,tv2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p72_page);
        tv1=findViewById(R.id.textView9);
        tv2=findViewById(R.id.textView10);

        Intent intent=getIntent();
//        if (extras != null) {
//            user = extras.getString("User");
//            pass = extras.getString("Pass");
//        }
//        tv1.setText(user);
//        tv2.setText(pass);
        //Intent intent=getIntent();


        String a=intent.getStringExtra("User");
        String c=intent.getStringExtra("Pass");
        tv1.setText("Usernmae :- "+a);
        tv2.setText("Password :- "+c);


    }
}