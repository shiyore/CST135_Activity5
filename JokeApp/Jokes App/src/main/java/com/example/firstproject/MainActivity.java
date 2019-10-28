package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Button btn_joke1 , btn_joke2, btn_joke3 , btn_joke4 , btn_joke5 , btn_joke6;

    TextView tv_message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_joke1 = findViewById(R.id.btn_joke1);
        btn_joke2 = findViewById(R.id.btn_joke2);
        btn_joke3 =  findViewById(R.id.btn_joke3);
        btn_joke4 =  findViewById(R.id.btn_joke4);
        btn_joke5 =  findViewById(R.id.btn_joke5);
        btn_joke6 =  findViewById(R.id.btn_joke6);

        tv_message = findViewById(R.id.tv_message);

        //create click listener
        btn_joke1.setOnClickListener(new View.OnClickListener(){
            //@Override
            public void onClick(View v){
                Toast.makeText(MainActivity.this , "To get to the other side." , Toast.LENGTH_SHORT).show();
            }
        });
        btn_joke2.setOnClickListener(new View.OnClickListener(){
            //@Override
            public void onClick(View v){
                Toast.makeText(MainActivity.this , "Follow the fresh prints." , Toast.LENGTH_SHORT).show();
            }
        });
        btn_joke3.setOnClickListener(new View.OnClickListener(){
            //@Override
            public void onClick(View v){
                Toast.makeText(MainActivity.this , "Because if they flew over the bay, they would be called bagels." , Toast.LENGTH_SHORT).show();
            }
        });
        btn_joke4.setOnClickListener(new View.OnClickListener(){
            //@Override
            public void onClick(View v){
                tv_message.setText("He was peeling bad.");
            }
        });
        btn_joke5.setOnClickListener(new View.OnClickListener(){
            //@Override
            public void onClick(View v){
                tv_message.setText("They make up everything.");
            }
        });
        btn_joke6.setOnClickListener(new View.OnClickListener(){
            //@Override
            public void onClick(View v){
                tv_message.setText("Dinner's on me.");
            }
        });

    }
}
