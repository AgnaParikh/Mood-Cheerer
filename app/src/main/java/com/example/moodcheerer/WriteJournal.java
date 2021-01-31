package com.example.moodcheerer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WriteJournal extends AppCompatActivity {

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write_journal);

        button = (Button) findViewById(R.id.button7);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                getBack();
            }
        });
    }

    private void getBack () {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}