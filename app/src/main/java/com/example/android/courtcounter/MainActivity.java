package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    int pt=0;
    int ppt;
    public void plusThree(View view){
        ppt=pt;
        pt +=3;
        displayForTeamA(pt);
    }

    public void plusTwo(View view){
        ppt=pt;
        pt+=2;
        displayForTeamA(pt);
    }
    public void freeThrow(View view){
        ppt=pt;

        pt+=1;
        displayForTeamA(pt);
    }
    public void reset(View view){
        ppt=pt;
        ppt1=pt1;

        pt =0;
        pt1=0;
        displayForTeamA(pt);
        displayForTeamB(pt1);
    }
    public void undo(View view)
    {
        pt = ppt;
        displayForTeamA(pt);


    }
    int pt1=0;
    int ppt1;
    public void plusThree1(View view){
        ppt1=pt1;
        pt1 +=3;
        displayForTeamB(pt1);
    }
    public void plusTwo1(View view){
        ppt1=pt1;
        pt1+=2;
        displayForTeamB(pt1);
    }
    public void freeThrow1(View view){
        ppt1=pt1;

        pt1+=1;
        displayForTeamB(pt1);
    }

    public void undo1(View view)
    {
        pt1 = ppt1  ;
        displayForTeamB(pt1);


    }


}
