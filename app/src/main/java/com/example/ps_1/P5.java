package com.example.ps_1;


import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class P5 extends AppCompatActivity {
    Button btn1;
    ConstraintLayout cl1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p5);
        btn1=findViewById(R.id.button15);
        cl1=findViewById(R.id.con1);
        registerForContextMenu(btn1);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Choose a Color ");
        menu.add(0,v.getId(),0,"Yellow");
        menu.add(0,v.getId(),0,"Gray");
        menu.add(0,v.getId(),0,"Cyan");
        menu.add(0,v.getId(),0,"Green");
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {

        if(item.getTitle()=="Yellow"){
            cl1.setBackgroundColor(Color.YELLOW);
        } else if (item.getTitle()=="Gray") {
            cl1.setBackgroundColor(Color.GRAY);
        } else if (item.getTitle()=="Cyan") {
            cl1.setBackgroundColor(Color.CYAN);
        } else if (item.getTitle()=="Green") {
            cl1.setBackgroundColor(Color.GREEN);
        }
        return true;
    }
}


