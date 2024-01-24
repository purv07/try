package com.example.ps_1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import java.lang.String;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class P10 extends AppCompatActivity {
    Button btn1;
    EditText e1,e2;

    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p10);
        btn1 = findViewById(R.id.button18);
        e1=findViewById(R.id.et1);
        t1=findViewById(R.id.tv1);
        Toolbar tool2 = findViewById(R.id.tool1);
        tool2.setTitle("Currency Converter");
        tool2.setTitleTextColor(Color.WHITE);
        registerForContextMenu(btn1);
        //e1.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Select Mode");
        menu.add(0, v.getId(), 0, "Rupees to Dollars");
        menu.add(0, v.getId(), 0, "Dollars to Rupees");
        menu.add(0, v.getId(), 0, "Rupees to Pound");
        menu.add(0, v.getId(), 0, "Pound to Rupees");
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if (item.getTitle().equals("Rupees to Dollars")) {
            String str = e1.getText().toString();
            float rupees = Float.parseFloat(str);
            float dollars = rupees * 0.0121f;
            t1.setText(String.format("Converted Rupees to Dollars :- "+"%.2f", dollars));
        } else if (item.getTitle().equals("Dollars to Rupees")) {
            String str = e1.getText().toString();
            float rupees = Float.parseFloat(str);
            float dollars = rupees * 82.8732f;
            t1.setText(String.format("Converted Dollars to Rupees :- "+"%.2f", dollars));
        } else if (item.getTitle().equals("Rupees to Pound")) {
            String str = e1.getText().toString();
            float rupees = Float.parseFloat(str);
            float dollars = rupees * 0.0096f;
            t1.setText(String.format("Converted Rupees to Pound :- "+"%.2f", dollars));

        } else if (item.getTitle().equals("Pound to Rupees")) {
            String str = e1.getText().toString();
            float rupees = Float.parseFloat(str);
            float dollars = rupees * 104.4567f;
            t1.setText(String.format("Converted Pound to Rupees :- "+"%.2f", dollars));

        }
        return true;
    }
}