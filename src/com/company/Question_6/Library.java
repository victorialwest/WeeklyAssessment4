package com.company.Question_6;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Game> gameLibrary = new ArrayList<Game>();
    private Menu menu;
    /*
    FROM THE ANSWER KEY:
    This needed to be added

    public Library(Menu menu) {
        this.menu = menu;
    }

    */


    protected void addGame(Game game) {
        //Code goes here to add game to where ever we are saving game things to
        gameLibrary.add(game);
        Menu menu = new Menu();
        menu.startMenu();
    }

    // PLEASE LOOK BELOW FOR THE CORRECT METHOD

    protected void removeGame(int gameIndex) {
        if (gameLibrary.isEmpty()) {
            System.out.println("There are no games to remove from the Library at this time.");
        } else {
            gameIndex -= gameIndex;
            gameLibrary.remove(gameIndex);
            System.out.println("This game has been removed from your library.");
        }

        Menu menu = new Menu();
        menu.startMenu();
    }

    /*
        FROM THE ANSWER KEY:
        This was the missing method:

        protected void removeGame(int gameIndex) {
        if (gameLibrary.isEmpty()) {
            System.out.println("There are no games to remove from the Library at this time.");
        } else {
            gameIndex -= gameIndex;
            gameLibrary.remove(gameIndex);
            System.out.println("This game has been removed from your library.");
        }
        menu.startMenu();
    }
     */

    protected void listGames() {

        System.out.println("\n");
        if (gameLibrary.isEmpty()) {
            System.out.println("There are no games in your Library.");
        } else {
            int index = 1;
            for (Game game : gameLibrary) {
                System.out.println(index++ + ". " + game.getTitle());
            }
        }

        /*

        PLEASE SEE BELOW

        */

        System.out.println("\n");
        Menu menu = new Menu();
        menu.startMenu();
    }

     /*
        From the Answer Key:

        System.out.println("\n");
        menu.startMenu();

        */
}
