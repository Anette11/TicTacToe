package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity {
    private Button buttonPlay;
    private Button buttonExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        initialize();
    }

    private void initialize() {
        buttonPlay = findViewById(R.id.buttonPlay);
        buttonExit = findViewById(R.id.buttonExit);
    }

    public void onClickPlay(View view) {
        play();
    }

    public void onClickExit(View view) {
        exit();
    }

    @Override
    public void onBackPressed() {
        play();
    }

    public void exit() {
        ActivityCompat.finishAffinity(this);
        System.exit(0);
    }

    public void play() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
        System.exit(0);
    }
}
