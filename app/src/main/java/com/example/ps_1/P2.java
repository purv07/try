package com.example.ps_1;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class P2 extends AppCompatActivity {

    Button b1;
    EditText e1;

    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p2);
        b1 = findViewById(R.id.button3);
        e1 = findViewById(R.id.editTextText);
        t1 = findViewById(R.id.textView2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                t1.setText("Name :- "+e1.getText().toString());
            }
        });
    }

}