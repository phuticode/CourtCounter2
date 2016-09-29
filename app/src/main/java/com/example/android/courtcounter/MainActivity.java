package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA,scoreB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForA(scoreA);
        displayForB(scoreB);
    }

    //Display given score for team 1

    public void displayForA(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.scoreA);
        scoreView.setText(String.valueOf(score));

    }
    //Display given score for team 1
    public void displayForB(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.scoreB);
        scoreView.setText(String.valueOf(score));
    }

    public void button3Left(View view)
    {

        scoreA = scoreA + 3;
        displayForA(scoreA);

    }
    public void button2Left(View view)
    {

        scoreA = scoreA + 2;
        displayForA(scoreA);

    }
    public void buttonFreeThrow(View view)
    {

        scoreA = scoreA + 1;
        displayForA(scoreA);

        //team b buttons

    }public void button3Right(View view)
    {

        scoreB = scoreB + 3;
        displayForB(scoreB);

    }
    public void button2Right(View view)
    {

        scoreB = scoreB + 2;
        displayForB(scoreB);

    }
    public void buttonFreeThrowRight(View view)
    {

        scoreB = scoreB + 1;
        displayForB(scoreB);

    } public void buttonReset(View view)
    {
        displayForA(0);
        displayForB(0);

    }
}
