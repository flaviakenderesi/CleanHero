package com.example.android.cleanhero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    String winner = "Winner!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays "Winner!" when score is 10 for Team A.
     */
    public void displayWinner(String winner) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(winner);
    }

    /**
     * Add 3 points for Team A.
     */
    public void threePointsTeamA(View view) {
        scoreTeamA = scoreTeamA + 3;
        if (scoreTeamA < 10) {
            displayForTeamA(scoreTeamA);
        } else {
            displayWinner(winner);
        }


    }

    /**
     * Add 2 points for Team A.
     */
    public void twoPointsTeamA(View view) {
        scoreTeamA = scoreTeamA + 2;
        if (scoreTeamA < 10) {
            displayForTeamA(scoreTeamA);
        } else {
            displayWinner(winner);
        }
    }

    /**
     * Add 1 points for Team A.
     */
    public void onePointTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        if (scoreTeamA < 10) {
            displayForTeamA(scoreTeamA);
        } else {
            displayWinner(winner);
        }
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays "Winner!" when score is 10 for Team B.
     */
    public void displayWinnerB(String winner) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(winner);
    }

    /**
     * Add 3 points for Team A.
     */
    public void threePointsTeamB(View view) {
        scoreTeamB = scoreTeamB + 3;
        if (scoreTeamB < 10) {
            displayForTeamB(scoreTeamB);
        } else {
            displayWinnerB(winner);
        }
    }

    /**
     * Add 2 points for Team A.
     */
    public void twoPointsTeamB(View view) {
        scoreTeamB = scoreTeamB + 2;
        if (scoreTeamB < 10) {
            displayForTeamB(scoreTeamB);
        } else {
            displayWinnerB(winner);
        }
    }

    /**
     * Add 1 points for Team A.
     */
    public void onePointTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        if (scoreTeamB < 10) {
            displayForTeamB(scoreTeamB);
        } else {
            displayWinnerB(winner);
        }
    }

    /**
     * Reset all scores for both Team A and Team B.
     */
    public void resetAllScores(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

}
