package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {

    TextView result;

    Button add,sub,div,mul;

    int num_1,num_2;
    float sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        result = (TextView)findViewById(R.id.result);
        add = (Button)findViewById(R.id.add);
        sub = (Button)findViewById(R.id.sub);
        mul = (Button)findViewById(R.id.mul);
        div = (Button)findViewById(R.id.div);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        final String number1 = String.valueOf(extras.getInt("number1"));
        final String number2 = String.valueOf(extras.getInt("number2"));

        EditText No3 = (EditText)findViewById(R.id.No3);
        EditText No4 = (EditText)findViewById(R.id.No4);

        No3.setText(number1);
        No4.setText(number2);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num_1 = Integer.parseInt(number1);
                num_2 = Integer.parseInt(number2);
                sum = num_1 + num_2;

                result.setText(number1 + "+" +number2 + "=" + String.valueOf(sum) );

                }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num_1 = Integer.parseInt(number1);
                num_2 = Integer.parseInt(number2);
                sum = num_1 - num_2;

                result.setText(number1 + "-" +number2 + "=" + String.valueOf(sum) );

            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num_1 = Integer.parseInt(number1);
                num_2 = Integer.parseInt(number2);
                sum = num_1 * num_2;

                result.setText(number1 + "*" +number2 + "=" + String.valueOf(sum) );

            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num_1 = Integer.parseInt(number1);
                num_2 = Integer.parseInt(number2);
                sum = num_1 / num_2;

                result.setText(number1 + "/" +number2 + "=" + String.valueOf(sum) );

            }
        });

    }
}