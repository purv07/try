package com.example.ps_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class P9 extends AppCompatActivity {

    EditText ed1,ed2,ed3,ed4,ed5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p9);
        ed1=findViewById(R.id.enroll);
        ed2=findViewById(R.id.name);
        ed3=findViewById(R.id.pymarks);
        ed4=findViewById(R.id.javamarks);
        ed5=findViewById(R.id.ecommarks);
        Toolbar toolbar = findViewById(R.id.tool1);
        Button btn1=findViewById(R.id.button16);
        Spinner spin = findViewById(R.id.spinner);
        Spinner spin1 = findViewById(R.id.spinner2);
        toolbar.setTitle("Student Details");
        toolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar);


        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,
                R.array.Course, android.R.layout.simple_spinner_dropdown_item);
        adapter1.setDropDownViewResource(androidx.constraintlayout.widget.R.layout.support_simple_spinner_dropdown_item);
        spin.setAdapter(adapter1);

        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                R.array.Sem, android.R.layout.simple_spinner_dropdown_item);
        adapter2.setDropDownViewResource(androidx.constraintlayout.widget.R.layout.support_simple_spinner_dropdown_item);
        spin1.setAdapter(adapter2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a,b;
                a=spin.getSelectedItem().toString();
                b=spin1.getSelectedItem().toString();
                Intent intent=new Intent(P9.this, P9_2Page.class);
                intent.putExtra("Enroll",ed1.getText().toString());
                intent.putExtra("Name",ed2.getText().toString());
                intent.putExtra("Course",a.toString());
                intent.putExtra("Sem",b.toString());
                intent.putExtra("Pymarks",ed3.getText().toString());
                intent.putExtra("JavaMarks",ed4.getText().toString());
                intent.putExtra("EcomMarks",ed5.getText().toString());
                startActivity(intent);
                //Toast.makeText(P9.this, b, Toast.LENGTH_SHORT).show();
            }
        });



    }

}