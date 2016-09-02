package com.example.ken_lox.myapplication;

import android.graphics.Color;
import android.support.v4.text.TextDirectionHeuristicCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    //Dealer variables
    private FactBook mFactBook =new FactBook();
    private colorWheel mColorWheel=new colorWheel();
    private TextView mFactTextView;
    private Button mShowFactButton;
    private RelativeLayout mRelativeLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Assign views
        mFactTextView= (TextView) findViewById(R.id.FacttextView);
        mShowFactButton= (Button) findViewById(R.id.ShowfactButton);
        mRelativeLayout= (RelativeLayout) findViewById(R.id.relativeid);

        View.OnClickListener listener=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fact=mFactBook.getfact();
                int color=mColorWheel.getColor();


                mFactTextView.setText(fact);
                mRelativeLayout.setBackgroundColor(color);
                mShowFactButton.setTextColor(color);

            }
        };


        mShowFactButton.setOnClickListener(listener);

       //Toast.makeText(MainActivity.this,"Yay!",Toast.LENGTH_SHORT).show();
        Log.d("Mainactivity","message");



    }
}
