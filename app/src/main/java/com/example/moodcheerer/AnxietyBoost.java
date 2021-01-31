package com.example.moodcheerer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class AnxietyBoost extends AppCompatActivity {
    private Button button;
    TextView fun;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anxiety_boost);
        fun=(TextView)findViewById(R.id.textView3);
        button = (Button) findViewById(R.id.button6);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                getJoke();
            }
        });
    }

    public void getJoke(){
        String str;
        String[] jokes=new String[7];
        jokes[0]="Why don't scientists trust atoms? Because they make up everything!";
        jokes[1]="Two artists had an art contest. It ended in a draw!";
        jokes[2]="You can only get spoiled milk from a pampered cow";
        jokes[3]="What is red and smells like blue paint? Red paint.";
        jokes[4]="Two gold fish are in a tank.\n" +
                "One looks at the other and says, You know how to drive this thing?!";
        jokes[5]="What’s red and moves up and down? A tomato in an elevator";
        jokes[6]=" What did the left eye say to the right eye? Between you and me, something smells.";

        Random rand=new Random();
        int randnum=rand.nextInt(7);
        str=jokes[randnum];
        fun.setText(" "+str);

    }
}