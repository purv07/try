package com.example.ps_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class P3_2Page extends AppCompatActivity {
    TextView tv1;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p32_page);
        tv1=findViewById(R.id.textView4);
        btn1=findViewById(R.id.button12);

        Intent intent=getIntent();
        String b= String.valueOf(intent.getIntExtra("Bill",0));
        tv1.setText("Payable Amount :- "+b);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(P3_2Page.this, "Payment 0f ₹"+b+" Successful", Toast.LENGTH_LONG).show();


            }
        });
        

    }
}