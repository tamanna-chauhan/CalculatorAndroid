package com.acadview.calculator_try;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText firstNum,secondNum;
    Button add,sub,mul,div;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNum =  findViewById(R.id.firstEt);
        secondNum = findViewById(R.id.secondEt);
        add = findViewById(R.id.add);
        sub =  findViewById(R.id.substraction);
        mul = findViewById(R.id.multiply);
        div =  findViewById(R.id.divide);
        result = findViewById(R.id.result);

        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        String num1,num2;

        num1 = firstNum.getText().toString();
        num2 = secondNum.getText().toString();

        switch (view.getId()){
            case R.id.add:
                int Addition = Integer.parseInt(num1) + Integer.parseInt(num2);
                result.setText(String.valueOf(Addition));
                break;

            case R.id.substraction:
                int Substraction = Integer.parseInt(num1) - Integer.parseInt(num2);
                result.setText(String.valueOf(Substraction));
                break;

            case R.id.multiply:
                int Multiply = Integer.parseInt(num1) * Integer.parseInt(num2);
                result.setText(String.valueOf(Multiply));
                break;

            case R.id.divide:
                int Divide = Integer.parseInt(num1) / Integer.parseInt(num2);
                result.setText(String.valueOf(Divide));
                break;
        }
    }
}
