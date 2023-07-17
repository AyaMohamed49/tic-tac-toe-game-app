package com.example.tictactoegame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddPlayers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_players);

        ViewCompat.setLayoutDirection(getWindow().getDecorView(), ViewCompat.LAYOUT_DIRECTION_LTR);
        EditText playerOne= findViewById(R.id.playerOneET);
        EditText playerTwo= findViewById(R.id.playerTwoET);
        Button startGame= findViewById(R.id.startGameBtn);

        startGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getPlayerOne = playerOne.getText().toString();
                String getPlayerTwo = playerTwo.getText().toString();

                if(getPlayerOne.isEmpty() || getPlayerTwo.isEmpty())
                {
                    Toast.makeText(AddPlayers.this, "Please enter player names", Toast.LENGTH_LONG).show();
                }
                else
                {
                    Intent intent= new Intent(AddPlayers.this, MainActivity.class);
                    intent.putExtra("playerOne", getPlayerOne);
                    intent.putExtra("playerTwo", getPlayerTwo);
                    startActivity(intent);
                }
            }
        });
    }
}