 package com.subtlyrude.courtcounter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0;
    int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void plus3A(View view) {
        teamAScore+=3;
        displayA(teamAScore);
    }

    public void plus2A(View view) {
        teamAScore+=2;
        displayA(teamAScore);

    }

    public void freeThrowA(View view) {
        teamAScore+=1;
        displayA(teamAScore);

    }

    public void plus3B(View view) {
        teamBScore+=3;
        displayB(teamBScore);
    }

    public void plus2B(View view) {
        teamBScore+=2;
        displayB(teamBScore);


    }

    public void freeThrowB(View view) {
        teamBScore+=1;
        displayB(teamBScore);

    }
    public void reset(View view) {
        teamAScore=0;
        teamBScore=0;
        displayA(teamAScore);
        displayB(teamBScore);

    }

    private void displayA(int number) {
        TextView teamAScore = (TextView) findViewById(R.id.teamAScore);
        teamAScore.setText("" + number);
    }

    private void displayB(int number) {
        TextView teamBScore = (TextView) findViewById(R.id.teamBScore);
        teamBScore.setText("" + number);
    }
}