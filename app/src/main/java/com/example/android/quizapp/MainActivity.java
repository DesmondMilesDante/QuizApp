package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


/**
 * This app displays a categories on various type of quizzes.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is used to go into Main2Activity which contains quizzes about Science.
     */
    public void science(View view) {

        TextView science = (TextView) findViewById(R.id.science_quiz);
        science.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });

    }

    /**
     * This method is used to go into Main3Activity which contains quizzes about History.
     */
    public void history(View view) {

        TextView history = (TextView) findViewById(R.id.history_quiz);

        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(intent);
            }
        });

    }


    /**
     * This method is used to go into Main4Activity which contains quizzes about Sports.
     */
    public void sports(View view) {

        TextView sports = (TextView) findViewById(R.id.sports_quiz);

        sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main4Activity.class);
                startActivity(intent);
            }
        });
    }
}
