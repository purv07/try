package com.example.ps_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class P6 extends AppCompatActivity {

    EditText f2;
    TextView f1;
    float r1,r2;
    boolean add;
    boolean su;
    boolean mu;
    boolean di;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p6);
        Button ac = findViewById(R.id.AC);
        Button eq=findViewById(R.id.Equal);
        Button n1 = findViewById(R.id.N1);
        Button n2 = findViewById(R.id.N2);
        Button n3 = findViewById(R.id.N3);
        Button n4 = findViewById(R.id.N4);
        Button n5 = findViewById(R.id.N5);
        Button n6 = findViewById(R.id.N6);
        Button n7 = findViewById(R.id.N7);
        Button n8 = findViewById(R.id.N8);
        Button n9 = findViewById(R.id.N9);
        Button n0 = findViewById(R.id.N0);
        Button n00 = findViewById(R.id.N00);
        Button ndot = findViewById(R.id.Ndot);
        Button sum = findViewById(R.id.Sum);
        Button sub = findViewById(R.id.Sub);
        Button mul = findViewById(R.id.Mul);
        Button div = findViewById(R.id.Div);
        f1 = findViewById(R.id.sec2);

        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f1.setText(" ");
                //f2.setText("");
            }
        });
        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //f1.setText(String.valueOf(1));
                f1.setText(f1.getText()+"1");
            }
        });
        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //f1.setText(String.valueOf(1));
                f1.setText(f1.getText()+"2");
            }
        });
        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //f1.setText(String.valueOf(1));
                f1.setText(f1.getText()+"3");
            }
        });
        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //f1.setText(String.valueOf(1));
                f1.setText(f1.getText()+"4");
            }
        });
        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //f1.setText(String.valueOf(1));
                f1.setText(f1.getText()+"5");
            }
        });
        n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //f1.setText(String.valueOf(1));
                f1.setText(f1.getText()+"6");
            }
        });
        n7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //f1.setText(String.valueOf(1));
                f1.setText(f1.getText()+"7");
            }
        });
        n8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //f1.setText(String.valueOf(1));
                f1.setText(f1.getText()+"8");
            }
        });
        n9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //f1.setText(String.valueOf(1));
                f1.setText(f1.getText()+"9");
            }
        });
        n0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //f1.setText(String.valueOf(1));
                f1.setText(f1.getText()+"0");
            }
        });
        n00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //f1.setText(String.valueOf(1));
                f1.setText(f1.getText()+"00");
            }
        });
        ndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //f1.setText(String.valueOf(1));
                f1.setText(f1.getText()+".");
            }
        });

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(f1==null){
                    f1.setText("");
                }else {
                    r1=Float.parseFloat(f1.getText()+" ");
                    add=true;
                    f1.setText(null);
                }
            }
        });

        eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                r2=Float.parseFloat(f1.getText()+"");
                if(add==true){
                    f1.setText(r1+r2+"");
                    add=false;
                }
                if(mu==true){
                    f1.setText(r1*r2+"");
                    mu=false;
                }
                if(su==true){
                    f1.setText(r1-r2+"");
                    su=false;
                }
                if(di==true){
                    f1.setText(r1/r2+"");
                    di=false;
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(f1==null){
                    f1.setText("");
                }else {
                    r1=Float.parseFloat(f1.getText()+" ");
                    su=true;
                    f1.setText(null);
                }
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(f1==null){
                    f1.setText("");
                }else {
                    r1=Float.parseFloat(f1.getText()+" ");
                    mu=true;
                    f1.setText(null);
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(f1==null){
                    f1.setText("");
                }else {
                    r1=Float.parseFloat(f1.getText()+" ");
                    di=true;
                    f1.setText(null);
                }
            }
        });


    }
}