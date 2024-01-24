package com.example.ps_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class P7 extends AppCompatActivity {
    EditText ed1,ed2;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p7);
        btn1=findViewById(R.id.button17);
        ed1=(EditText) findViewById(R.id.User);
        ed2=(EditText) findViewById(R.id.Pass);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),P7_2Page.class);
                String a=ed1.getText().toString();
                String b=ed2.getText().toString();
                intent.putExtra("User",a);
                intent.putExtra("Pass",b);
                startActivity(intent);

            }
        });
    }
}