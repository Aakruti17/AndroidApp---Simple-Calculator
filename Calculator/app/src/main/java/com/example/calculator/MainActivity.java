package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText getFirstValue, getSecondValue;
    TextView tvAns;
    Button add, sub, mul, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getFirstValue = findViewById(R.id.getFirstValue);
        getSecondValue = findViewById(R.id.getSecondValue);

        tvAns = findViewById(R.id.tvAns);

        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);

        add.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                int firstValue, secondValue, ans;
                firstValue = Integer.parseInt(getFirstValue.getText().toString());
                secondValue = Integer.parseInt(getSecondValue.getText().toString());

                ans = firstValue + secondValue;
                tvAns.setText("Addition is : "+ ans);
            }
        });

        sub.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                int firstValue, secondValue, ans;
                firstValue = Integer.parseInt(getFirstValue.getText().toString());
                secondValue = Integer.parseInt(getSecondValue.getText().toString());

                ans = firstValue - secondValue;
                tvAns.setText("Substraction is : "+ ans);
            }
        });

        mul.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                int firstValue, secondValue, ans;
                firstValue = Integer.parseInt(getFirstValue.getText().toString());
                secondValue = Integer.parseInt(getSecondValue.getText().toString());

                ans = firstValue * secondValue;
                tvAns.setText("Multiplication is : "+ ans);
            }
        });

        div.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                int firstValue, secondValue, ans;
                firstValue = Integer.parseInt(getFirstValue.getText().toString());
                secondValue = Integer.parseInt(getSecondValue.getText().toString());

                ans = firstValue / secondValue;
                tvAns.setText("Division is : "+ ans);
            }
        });





    }
}