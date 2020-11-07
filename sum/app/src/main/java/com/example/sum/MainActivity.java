package com.example.sum;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView result;
    EditText numberOne;
    EditText numberTwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberOne=(EditText) findViewById(R.id.editText1);
        numberTwo=(EditText) findViewById(R.id.editText2);
        Button Add_button=(Button) findViewById(R.id.add);
        result = (TextView) findViewById(R.id.textViewR);

        Add_button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                int num1 = Integer.parseInt(numberOne.getText().toString());
                int num2 = Integer.parseInt(numberTwo.getText().toString());
                int sum = num1 + num2;
                result.setText(Integer.toString(sum));
            }
        });
    }
}