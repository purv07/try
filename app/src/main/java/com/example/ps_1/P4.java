package com.example.ps_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class P4 extends AppCompatActivity {
    RadioGroup r1;
    Button btn1;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p4);
        r1=findViewById(R.id.radioGroup);
        btn1=findViewById(R.id.button14);
        tv1=findViewById(R.id.textView7);

        r1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton rb=findViewById(i);
                if(rb!=null)
                {
                    String Text=rb.getText().toString();
                    tv1.setText("Selected Subject : "+Text);
                }
            }
        });

    }
}