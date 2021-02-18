package com.ismailcifci.timer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

public class MainActivity extends AppCompatActivity {
     Chronometer timerHere ;
     Button stopButton ;
    Button startButton ;
    Button finishButton ;
    Button continueButton ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timerHere = findViewById(R.id.timerHere);
        stopButton = findViewById(R.id.button2);
        startButton = findViewById(R.id.btnget);
        finishButton = findViewById(R.id.button3);
        continueButton = findViewById(R.id.btnget2);

        stopButton.setVisibility(View.INVISIBLE);
        finishButton.setVisibility(View.INVISIBLE);
    }

    public void startTimer(View view)
    {
      timerHere.setBase(SystemClock.elapsedRealtime());
      timerHere.start();

        startButton.setVisibility(View.INVISIBLE);
        stopButton.setVisibility(View.VISIBLE);
        finishButton.setVisibility(View.VISIBLE);




    }

    public  void stopTimer(View view)
    {
        timerHere.stop();
        stopButton.setVisibility(View.INVISIBLE);
        finishButton.setVisibility(View.INVISIBLE);
        continueButton.setVisibility(View.VISIBLE);



    }

    public void continueTimer(View view)
    {
        timerHere.start();
        continueButton.setVisibility(View.INVISIBLE);
        stopButton.setVisibility(View.VISIBLE);
        finishButton.setVisibility(View.VISIBLE);

    }

    public void finishTimer(View view) {

        timerHere.setBase(SystemClock.elapsedRealtime());

        timerHere.stop();

        stopButton.setVisibility(View.INVISIBLE);
        finishButton.setVisibility(View.INVISIBLE);
        startButton.setVisibility(View.VISIBLE);

    }


}