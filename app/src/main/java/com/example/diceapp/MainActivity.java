package com.example.diceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Random ran = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void rollTask(View view) {
        int val = ran.nextInt(6) + 1;
        TextView number = findViewById(R.id.numVal);
        TextView word = findViewById(R.id.greeting);

        number.setText(val+"");

        switch(val){
            case 1 : word.setText("Its better than Nothing!");
                            break;
            case 2 : word.setText("Keep your calm");
                            break;
            case 3 : word.setText("You might get better");
                            break;
            case 4 : word.setText("Nice!");
                            break;
            case 5 : word.setText("Pretty Good");
                            break;
            case 6 : word.setText("You are Lucky!");
                            break;
            default : break;
        }

    }

}