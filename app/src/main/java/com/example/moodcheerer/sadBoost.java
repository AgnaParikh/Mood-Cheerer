package com.example.moodcheerer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class sadBoost extends AppCompatActivity {
    private Button button;
    TextView thought;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sad);
        thought=(TextView)findViewById(R.id.thoughtText);
        button = (Button) findViewById(R.id.sad);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                    getThought();
                }
            });
        }

        public void getThought(){
            String str;
            String[] thoughts=new String[7];
            thoughts[0]="Never regret anything that made you smile. – Mark Twain";
            thoughts[1]="If you hear a voice within you say ‘you cannot paint,’ then by all means paint, and that voice will be silenced.";
            thoughts[2]="On a deeper level you are already complete. When you realize that, there is a playful, joyous energy behind what you do";
            thoughts[3]="Most people are about as happy as they make up their minds to be";
            thoughts[4]="Happiness is not something you postpone for the future; it is something you design for the present. Jim Rohn";
            thoughts[5]="Be happy for this moment. This moment is your life.";
            thoughts[6]=" Life will bring you pain all by itself. Your responsibility is to create joy.";

            Random rand=new Random();
            int randnum=rand.nextInt(7);
            str=thoughts[randnum];
            thought.setText(" "+str);

    }
}
