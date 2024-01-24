package com.example.ps_1;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class P9_2Page extends AppCompatActivity {

    //TextView ed1,ed2,ed3,ed4,ed5,ed6,ed7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p92_page);
        Toolbar tool2 = findViewById(R.id.tool2);
        //View v2=findViewById(R.id.view2);
        tool2.setTitle("Student Result");
        tool2.setTitleTextColor(Color.WHITE);

        TextView ed1 = findViewById(R.id.textView11);
        TextView ed2 = findViewById(R.id.textView12);
        TextView ed3 = findViewById(R.id.textView13);
        TextView ed4 = findViewById(R.id.textView14);
        TextView ed5 = findViewById(R.id.textView15);
        TextView ed6 = findViewById(R.id.textView16);
        TextView ed7 = findViewById(R.id.textView17);
        TextView ed8 = findViewById(R.id.textView18);
        TextView ed9 = findViewById(R.id.textView20);

        Intent intent = getIntent();
        String a = intent.getStringExtra("Enroll");
        String b = intent.getStringExtra("Name");
        String c = intent.getStringExtra("Course");
        String d = intent.getStringExtra("Sem");
        String e = intent.getStringExtra("Pymarks");
        String f = intent.getStringExtra("JavaMarks");
        String g = intent.getStringExtra("EcomMarks");
        int py=Integer.parseInt(e);
        int java=Integer.parseInt(f);
        int eco=Integer.parseInt(g);
        ed1.setText("Enrollment No :- " + a);
        ed2.setText("Name :- " + b);
        ed3.setText("Course :- " + c);
        ed4.setText("Semester :- " + d);
        ed5.setText("Python Marks :- " + py);
        ed6.setText("Java Marks :- " + java);
        ed7.setText("Ecom Marks :- " + eco);
        int Total= Integer.parseInt(String.valueOf((py+java+eco)));
        ed8.setText("Total :- " + Total);
        float Per=Float.parseFloat(String.valueOf(Total/3));
        ed9.setText("Percentages :- "+Per);

    }
}