package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Button btn1 = (Button)findViewById(R.id.button);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               goToActivity2();

                Context context = getApplicationContext();
                CharSequence message = "Sending message ...";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, message, duration);
                toast.setGravity(Gravity.BOTTOM|Gravity.CENTER,0,0);
                toast.show();

                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                Bundle extras = new Bundle();

                EditText No1 = findViewById(R.id.No1);
                EditText No2 = findViewById(R.id.No2);

                int number1 = Integer.parseInt(No1.getText().toString());
                int number2 = Integer.parseInt(No2.getText().toString());

                extras.putInt("number1" , number1);
                extras.putInt("number2" , number2);
                intent.putExtras(extras);
                startActivity(intent);
            }


        });
    }

    private void  goToActivity2() {

        Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
        startActivity(intent);
    }


}