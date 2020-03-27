package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    EditText number1;
    EditText number2;
    Button btn_ok;

    String num1;
    String num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        number1 = (EditText) findViewById(R.id.id_input1);
        number2 = (EditText) findViewById(R.id.id_input2);
        btn_ok = (Button) findViewById(R.id.id_btn_ok);


        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);

                intent.putExtra("NUMBER1", number1.getText().toString());
                intent.putExtra("NUMBER2", number2.getText().toString());

                //implement toast message
                Context context = getApplicationContext();
                CharSequence message = "Numbers are saved successfully";
                int duration = Toast.LENGTH_LONG;

                Toast toast =  Toast.makeText(context,message,duration);

                toast.show();
                startActivity(intent);
            }
        });
    }
}