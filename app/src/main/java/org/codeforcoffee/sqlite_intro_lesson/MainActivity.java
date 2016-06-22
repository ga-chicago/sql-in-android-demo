package org.codeforcoffee.sqlite_intro_lesson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHelper db = new DatabaseHelper(this);
        db.insert(1, "Super Mario", "1985");
        db.insert(2, "Legend of Zelda", "1986");
        db.insert(3, "Battlefront", "2015");
        db.insert(4, "Civilization 6", "2016");

        Game retrievedGame = db.getGame(2);

        ArrayList<Game> videoGames = new ArrayList<>();
        videoGames.add(db.getGame(1));
        videoGames.add(db.getGame(2));
        videoGames.add(db.getGame(3));
        videoGames.add(db.getGame(4));

        String n = "set a breakpoint here to inspect the cursor / game above";


    }
}
