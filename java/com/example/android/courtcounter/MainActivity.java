package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    final int POINTS_FOR_FREE_THROW = 1;
    final int POINTS_FOR_2pnt_THROW = 2;
    final int POINTS_FOR_3pnt_THROW = 3;

    int scoreTeamA = 0;
    int scoreTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayTeamA(0);
        displayTeamB(0);
    }

    protected void displayTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText("" + score);
    }

    protected void displayTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText("" + score);
    }

    protected void threePointTeamA(View view){
        scoreTeamA = scoreTeamA + POINTS_FOR_3pnt_THROW;
        displayTeamA(scoreTeamA);
    }
    //sdsds

    protected void twoPointTeamA(View view){
        scoreTeamA = scoreTeamA + POINTS_FOR_2pnt_THROW;
        displayTeamA(scoreTeamA);
    }

    protected void freeThrowTeamA(View view){
        scoreTeamA = scoreTeamA + POINTS_FOR_FREE_THROW;
        displayTeamA(scoreTeamA);
    }
    //sdfsd

    protected void threePointTeamB(View view){
        scoreTeamB = scoreTeamB + POINTS_FOR_3pnt_THROW;
        displayTeamB(scoreTeamB);
    }

    protected void twoPointTeamB(View view){
        scoreTeamB = scoreTeamB + POINTS_FOR_2pnt_THROW;
        displayTeamB(scoreTeamB);
    }

    protected void freeThrowTeamB(View view){
        scoreTeamB = scoreTeamB + POINTS_FOR_FREE_THROW;
        displayTeamB(scoreTeamB);
    }

    protected void reset(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayTeamA(scoreTeamA);
        displayTeamB(scoreTeamB);
    }
}
