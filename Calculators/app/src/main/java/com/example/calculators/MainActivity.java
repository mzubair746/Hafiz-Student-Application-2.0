package com.example.calculators;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText d1;
    private EditText d2;

    private TextView tv;
    private Button add;
    private Button sub;
    private Button mult;
    private Button div;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        d1 = findViewById(R.id.editTextNumber);
        d2 = findViewById(R.id.editTextNumber2);
        tv = findViewById(R.id.tvResult);
        add = findViewById(R.id.button);
        sub = findViewById(R.id.button2);
        mult = findViewById(R.id.button3);
        div = findViewById(R.id.button4);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performOperation("+");
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performOperation("-");
            }
        });

        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performOperation("*");
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performOperation("/");
            }
        });
    }

    private void performOperation(String operator) {
        String operand1String = d1.getText().toString();
        String operand2String = d2.getText().toString();

        if (operand1String.isEmpty() || operand2String.isEmpty()) {
            tv.setText("Please enter both operands.");
            return;
        }

        double operand1 = Double.parseDouble(operand1String);
        double operand2 = Double.parseDouble(operand2String);
        double result = 0;

        switch (operator) {
            case "+":
                result = operand1 + operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;
            case "*":
                result = operand1 * operand2;
                break;
            case "/":
                if (operand2 == 0) {
                    tv.setText("Cannot divide by zero.");
                    return;
                }
                result = operand1 / operand2;
                break;
        }

        tv.setText("Result: " + result);
    }
}