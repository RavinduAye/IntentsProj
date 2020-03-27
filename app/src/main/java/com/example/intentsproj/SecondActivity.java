package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    TextView value1;
    TextView value2;
    TextView method;
    Button add;
    Button minus;
    Button devide;
    Button multi;
    EditText temp;

    String num1;
    String num2;

    Integer val1,val2,total =0;
    double val3,val4;

    CharSequence message = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        value1 = (TextView) findViewById(R.id.id_value1);
        value2 = (TextView) findViewById(R.id.id_value2);
        method = (TextView) findViewById(R.id.id_ans);

        add = (Button) findViewById(R.id.id_btn_add);
        minus =(Button) findViewById(R.id.id_btn_minus);
        multi = (Button) findViewById(R.id.id_btn_multy);
        devide = (Button) findViewById(R.id.id_btn_devide);

        Intent receive = getIntent();

        num1 = receive.getStringExtra("NUMBER1");
        num2 = receive.getStringExtra("NUMBER2");

        value1.setText(num1);
        value2.setText(num2);


        val1 = Integer.parseInt(num1);
        val2 = Integer.parseInt(num2);
        val3 = Double.parseDouble(num1);
        val4 = Double.parseDouble(num2);

        final Context context = getApplicationContext();

        final int duration = Toast.LENGTH_LONG;
        final Toast toast = Toast.makeText(context,message,duration);
        toast.setGravity(Gravity.TOP,0,0);

        //Add
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                method.setText(val1 +" + "+ val2 +" = "+ (val1+val2));

                message = "Add two numbers";
                Toast toast = Toast.makeText(context,message,duration);
                toast.setGravity(Gravity.TOP,0,200);
                toast.show();

            }
        });

        //minus
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                method.setText(val1 +" - "+ val2 +" = "+ (val1-val2));

                message = "Subtract two numbers";
                Toast toast = Toast.makeText(context,message,duration);
                toast.setGravity(Gravity.TOP,0,200);
                toast.show();
            }
        });

        //Multiply
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                method.setText(val1 +" * "+ val2 +" = "+ (val1*val2));

                message = "Multiply two numbers";
                Toast toast = Toast.makeText(context,message,duration);
                toast.setGravity(Gravity.TOP,0,200);
                toast.show();
            }
        });

        //Devide
        devide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                method.setText((val3)  +" / "+ (val4)+" = "+ (val3/val4));

                message = " devide two numbers";
                Toast toast = Toast.makeText(context,message,duration);
                toast.setGravity(Gravity.TOP,0,200);
                toast.show();
            }
        });
    }


}
