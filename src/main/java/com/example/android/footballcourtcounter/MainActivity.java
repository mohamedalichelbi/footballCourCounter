package com.example.android.footballcourtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.android.footballcourtcounter.R;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int foulTeamA = 0;
    int foulTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goalTeamA(View v) {
        scoreTeamA = scoreTeamA + 1 ;
        displayForTeamA(scoreTeamA);
    }

    public void noGoalTeamA(View v) {
        scoreTeamA = scoreTeamA - 1 ;
        displayForTeamA(scoreTeamA);
    }

    public void foulForTeamA(View v) {
        foulTeamA = foulTeamA + 1 ;
        displayFoulTeamA(foulTeamA);
    }

    public void noFoulForTeamA(View v) {
        foulTeamA = foulTeamA - 1 ;
        displayFoulTeamA(foulTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given fouls for Team A.
     */
    public void displayFoulTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_foul);
        scoreView.setText(String.valueOf(score));
    }

    public void goalTeamB(View v) {
        scoreTeamB = scoreTeamB + 1 ;
        displayForTeamB(scoreTeamB);
    }

    public void noGoalTeamB(View v) {
        scoreTeamB = scoreTeamB - 1 ;
        displayForTeamB(scoreTeamB);
    }

    public void foulForTeamB(View v) {
        foulTeamB = foulTeamB + 1 ;
        displayFoulTeamB(foulTeamB);
    }

    public void noFoulForTeamB(View v) {
        foulTeamB = foulTeamB - 1 ;
        displayFoulTeamB(foulTeamB);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given fouls for Team B.
     */
    public void displayFoulTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_foul);
        scoreView.setText(String.valueOf(score));
    }

    public void resetScore(View v) {
        scoreTeamB = 0 ;
        scoreTeamA = 0 ;
        foulTeamA = 0;
        foulTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayFoulTeamA(foulTeamA);
        displayFoulTeamB(foulTeamB);
    }

}