package com.example.kgtopoundconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editText;
    private TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        textView=findViewById(R.id.textView);
        editText=findViewById(R.id.editText);
        textView2=findViewById(R.id.textView2);
        ///////this is first method to call a thing on click
        /*button.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Converted to pound", Toast.LENGTH_SHORT).show();
                //toast display7 small message after pressing button
                String s=editText.getText().toString();//here we take value of edit text
                Integer a= Integer.parseInt(s);//here we pass it as a int
                double p=a*2.205;//here we covert it to pound
                textView2.setText("Coverted Value in Pound is:"+p);//here we set textView2 by replaced value
            }
        });*/



    }
    ////this is second method known as on click to call a funcyion on click it is declared outside main
    public void calculate(View view)
    {
        String s=editText.getText().toString();
        Integer a=Integer.parseInt(s);
        double p=a*2.205;
        textView2.setText("converted to pound:"+p);

    }
}