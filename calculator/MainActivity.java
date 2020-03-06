package com.example.calci;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView ans=(TextView)findViewById(R.id.tv2);
        final EditText e1=(EditText) findViewById(R.id.ed1);
        final EditText e2=(EditText) findViewById(R.id.ed2);
        Button add=(Button) findViewById(R.id.b1_add);
        Button mul=(Button) findViewById(R.id.b2_mul);
        Button div=(Button) findViewById(R.id.b4_div);
        Button sub=(Button) findViewById(R.id.b3_sub);
        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int a;
                int b;
                a=Integer.parseInt(e1.getText().toString());
                b = Integer.parseInt(e2.getText().toString());
                int c=a+b;
                ans.setText(c+" ");
            }
        });

        mul.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int a;
                int b;
                a=Integer.parseInt(e1.getText().toString());
                b = Integer.parseInt(e2.getText().toString());
                int c=a*b;
                ans.setText(c+" ");
            }
        });

        sub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int a;
                int b;
                a=Integer.parseInt(e1.getText().toString());
                b = Integer.parseInt(e2.getText().toString());
                int c=a-b;
                ans.setText(c+" ");
            }
        });

        div.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                float a;
                float b;
                a=Float.parseFloat(e1.getText().toString());
                b = Float.parseFloat(e2.getText().toString());
                float c=a/b;
                ans.setText(c+" ");
            }
        });




    }
}
