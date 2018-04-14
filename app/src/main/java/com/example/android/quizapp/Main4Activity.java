package com.example.android.quizapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    int count = 0;

    public void submitAnswer(View view) {

        RadioButton radioOne = (RadioButton) findViewById(R.id.option_one);
        RadioButton radioTwo = (RadioButton) findViewById(R.id.option_two);
        RadioButton radioThree = (RadioButton) findViewById(R.id.option_three);
        RadioButton radioFour = (RadioButton) findViewById(R.id.option_four);
        Boolean optionOne = radioOne.isChecked();
        Boolean optionTwo = radioTwo.isChecked();
        Boolean optionThree = radioThree.isChecked();
        Boolean optionFour = radioFour.isChecked();
        questionOne(optionOne, optionTwo, optionThree, optionFour);

        CheckBox checkOne = (CheckBox) findViewById(R.id.red);
        CheckBox checkTwo = (CheckBox) findViewById(R.id.blue);
        CheckBox checkThree = (CheckBox) findViewById(R.id.black);
        CheckBox checkFour = (CheckBox) findViewById(R.id.orange);
        Boolean one = checkOne.isChecked();
        Boolean two = checkTwo.isChecked();
        Boolean three = checkThree.isChecked();
        Boolean four = checkFour.isChecked();
        questionTwo(one, two, three, four);

        EditText editText = (EditText) findViewById(R.id.text1);
        String word = editText.getText().toString();
        questionThird(word);

        Toast.makeText(Main4Activity.this, "You answered " + count + " of the 3 questions correct.", Toast.LENGTH_SHORT).show();
        count = 0;
    }

    public void questionOne(boolean optionOne, boolean optionTwo, boolean optionThree, boolean optionFour) {
        TextView text = (TextView) findViewById(R.id.answer1);
        if (optionFour == true) {
            text.setText("\u2713Correct");
            text.setTextColor(Color.GREEN);
            count++;
        } else {
            text.setText("\u2715Incorrect");
            text.setTextColor(Color.RED);

        }
    }

    public void questionTwo(boolean one, boolean two, boolean three, boolean four) {
        TextView text = (TextView) findViewById(R.id.answer2);
        if (one == false && two == false && three == true && four == false) {
            text.setText("\u2713Correct");
            text.setTextColor(Color.GREEN);
            count++;
        } else {
            text.setText("\u2715Incorrect");
            text.setTextColor(Color.RED);

        }

    }


    public void questionThird(String word) {

        TextView text = (TextView) findViewById(R.id.answer3);

        if (word.toLowerCase().equals("Twenty Eight".toLowerCase()) || word.equals("28")) {

            text.setText("\u2713Correct");
            text.setTextColor(Color.GREEN);
            count++;
        } else {
            text.setText("\u2715Incorrect");
            text.setTextColor(Color.RED);

        }

    }
}
