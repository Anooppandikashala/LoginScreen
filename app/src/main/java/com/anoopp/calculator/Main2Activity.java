package com.anoopp.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    EditText firstNumber,secondNumber;
    Button plus1;
    Button minus1;
    Button mult1;
    Button division1;

    TextView result1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        plus1=findViewById(R.id.plus);
        minus1=findViewById(R.id.minus);
        mult1=findViewById(R.id.mul);
        division1=findViewById(R.id.div);

        result1=findViewById(R.id.result);
        firstNumber=findViewById(R.id.firstNumber);
        secondNumber=findViewById(R.id.secondNumber);
    }

    public void plusFunction(View view){
        float num1,num2,result;

        num1=Float.parseFloat(firstNumber.getText().toString());
        num2=Float.parseFloat(secondNumber.getText().toString());

        result=num1+num2;
        result1.setText(String.valueOf(result));
    }

    public void minusFunction(View view){
        float num1,num2,result;

        num1=Float.parseFloat(firstNumber.getText().toString());
        num2=Float.parseFloat(secondNumber.getText().toString());

        result=num1-num2;
        result1.setText(String.valueOf(result));
    }
    public void multFunction(View view){
        float num1,num2,result;

        num1=Float.parseFloat(firstNumber.getText().toString());
        num2=Float.parseFloat(secondNumber.getText().toString());

        result=num1*num2;
        result1.setText(String.valueOf(result));
    }
    public void divideFunction(View view){
        float num1,num2,result;

        num1=Float.parseFloat(firstNumber.getText().toString());
        num2=Float.parseFloat(secondNumber.getText().toString());
        try{
            result=num1/num2;
            result1.setText(String.valueOf(result));

        }
        catch (Exception e){

            result1.setText("Infinity");

        }


    }
}
