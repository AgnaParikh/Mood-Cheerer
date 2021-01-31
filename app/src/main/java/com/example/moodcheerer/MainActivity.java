package com.example.moodcheerer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //anger
        button = (Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openMusic();
            }
        });

        button = (Button) findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Write();
            }
        });

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                wise();
            }
        });

        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Jokes();
            }
        });
    }
        public void openMusic(){
            Intent intent = new Intent(this, AngerBoost.class);
            startActivity(intent);
        }

    public void wise(){
        Intent intent = new Intent(this,sadBoost.class);
        startActivity(intent);
    }

    //Jounal Writer
    public void Write(){
        Intent intent = new Intent(this, WriteJournal.class);
        startActivity(intent);
    }
    //Jokes for sad
    public void Jokes(){
        Intent intent = new Intent(this, AnxietyBoost.class);
        startActivity(intent);
    }
}