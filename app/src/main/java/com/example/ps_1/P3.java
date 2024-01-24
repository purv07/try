package com.example.ps_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class P3 extends AppCompatActivity {

    Button btn1;
    CheckBox c1, c2, c3, c4, c5;

    //int Total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p3);
        btn1 = findViewById(R.id.button13);
        c1 = findViewById(R.id.checkBox);
        c2 = findViewById(R.id.checkBox2);
        c3 = findViewById(R.id.checkBox3);
        c4 = findViewById(R.id.checkBox4);
        c5 = findViewById(R.id.checkBox5);

        btn1.setOnClickListener(view -> {
            int Total=0;
            if (c1.isChecked() || c2.isChecked() || c3.isChecked() || c4.isChecked() || c5.isChecked()) {
                if (c1.isChecked()) {
                    Total = Total + 80;
                }
                if (c2.isChecked()) {
                    Total = Total + 120;
                }
                if (c3.isChecked()) {
                    Total = Total + 90;
                }
                if (c4.isChecked()) {
                    Total = Total + 70;
                }
                if (c5.isChecked()) {
                    Total = Total + 130;
                }
                //Toast.makeText(this,"Total :- "+Total, Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(), P3_2Page.class);

                intent.putExtra("Bill",Total);
                startActivity(intent);
            } else {
                Toast.makeText(this, "No Item Selected", Toast.LENGTH_SHORT).show();
            }

        });
    }
}