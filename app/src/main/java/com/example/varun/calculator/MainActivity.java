package com.example.varun.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void plus(View view) {
        EditText first = (EditText) findViewById(R.id.first);
        EditText second = (EditText) findViewById(R.id.second);
        TextView answer = (TextView) findViewById(R.id.answer);
        if ((first.getText().toString().trim().length() != 0)&&(second.getText().toString().trim().length() != 0)) {
            float a = Float.parseFloat(first.getText().toString());
            float b = Float.parseFloat(second.getText().toString());
            float c = a + b;
            String ans = Float.toString(c);
            answer.setText(ans);
        }
        else
            answer.setText("Value Missing!!!");
    }

    public void minus(View view){
        EditText first = (EditText)findViewById(R.id.first);
        EditText second = (EditText)findViewById(R.id.second);
        TextView answer =(TextView)findViewById(R.id.answer);
        if ((first.getText().toString().trim().length() != 0)&&(second.getText().toString().trim().length() != 0)) {
            float a = Float.parseFloat(first.getText().toString());
            float b = Float.parseFloat(second.getText().toString());
            float c = a - b;
            String ans = Float.toString(c);
            answer.setText(ans);
        }
        else
            answer.setText("Value Missing!!!");
    }

    public void multiply(View view){
        EditText first = (EditText)findViewById(R.id.first);
        EditText second = (EditText)findViewById(R.id.second);
        TextView answer =(TextView)findViewById(R.id.answer);
        if ((first.getText().toString().trim().length() != 0)&&(second.getText().toString().trim().length() != 0)) {
            float a = Float.parseFloat(first.getText().toString());
            float b = Float.parseFloat(second.getText().toString());
            float c = a * b;
            String ans = Float.toString(c);
            answer.setText(ans);
        }
        else
            answer.setText("Value Missing!!!");
    }

    public void divide(View view){
        EditText first = (EditText)findViewById(R.id.first);
        EditText second = (EditText)findViewById(R.id.second);
        TextView answer =(TextView)findViewById(R.id.answer);
        if ((first.getText().toString().trim().length() != 0)&&(second.getText().toString().trim().length() != 0)) {
            float a = Float.parseFloat(first.getText().toString());
            float b = Float.parseFloat(second.getText().toString());
            float c = a / b;
            String ans = Float.toString(c);
            answer.setText(ans);
        }
        else
            answer.setText("Value Missing!!!");
    }

    public void credit(View view){
        Intent i = new Intent(this, credits.class);
        startActivity(i);
    }

    public void exit(View view){
        finish();
    }
}
