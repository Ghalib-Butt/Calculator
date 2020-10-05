package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    TextView result;
    Button add, subtract, multiply, divide;

    int firstnum, secondnum;
    float answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result=(TextView)findViewById(R.id.result);

        num1=(EditText)findViewById(R.id.num1);
        num2=(EditText)findViewById(R.id.num2);

        add=(Button)findViewById(R.id.add);
        subtract=(Button)findViewById(R.id.subtract);
        multiply=(Button)findViewById(R.id.multiply);
        divide=(Button)findViewById(R.id.divide);

        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                firstnum=Integer.parseInt(num1.getText().toString());
                secondnum=Integer.parseInt(num2.getText().toString());
                answer=firstnum+secondnum;
                result.setText(String.valueOf(answer));
            }
        });

        subtract.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                firstnum=Integer.parseInt(num1.getText().toString());
                secondnum=Integer.parseInt(num2.getText().toString());
                answer=firstnum-secondnum;
                result.setText(String.valueOf(answer));
            }
        });

        multiply.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                firstnum=Integer.parseInt(num1.getText().toString());
                secondnum=Integer.parseInt(num2.getText().toString());
                answer=firstnum*secondnum;
                result.setText(String.valueOf(answer));
            }
        });

        divide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                firstnum=Integer.parseInt(num1.getText().toString());
                secondnum=Integer.parseInt(num2.getText().toString());
                answer=firstnum/secondnum;
                result.setText(String.valueOf(answer));
            }
        });

    }
}