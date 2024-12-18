//* Main Java File
package Cryptoids;

import java.util.ArrayList;
// Imports
import java.util.Scanner;
import ANSI.EscapeCodes;
import Cryptoids.Creatures.*;

// TODO: refactor the whole introduction and tutorial in other methods. when you make the replay do loop, exclude those during a 'replay.'
// TODO: refactor colorcodes to have generic bold, highlight, etc modifeires for ansi codes and just use a color and another type before using reset.

public class Main
{
    public static void main(String[] args)
    {
        // Variables
        String player1Name, player2Name;
        Boolean playTutorial, willReplay = false, hasPlayerWon = false;
        int gameplayLoopIndex = 0;
        
        // Lets the users replay the game
        do
        {
            Scanner in = new Scanner(System.in);
            clear();

            // Introduction
            System.out.println("Hello, Welcome to Cryptoids! This is a local multiplayer 1v1 card game. You and a friend can make a deck of various cryptids you know and love like bigfoot and mothman.\nLet's start with your names.");
            
            // Asks players for their names
            System.out.println("Who is Player 1?");
            player1Name = in.nextLine();
    
            System.out.println("Who is Player 2?");
            player2Name = in.nextLine();
            
            clear();
    
            // Objects
            // Cryptoids
            // player 1 default deck
            ArrayList<Cryptoid> p1DefaultDeck = new ArrayList<Cryptoid>() {{
                Bigfoot Bigfoot1 = new Bigfoot();
                Bigfoot Bigfoot2 = new Bigfoot();
                Mothman Mothman1 = new Mothman();
                add(Bigfoot1);
                add(Bigfoot2);
                add(Mothman1);
            }};
            // player 2 default deck
            ArrayList<Cryptoid> p2DefaultDeck = new ArrayList<Cryptoid>() {{
                Bigfoot Mothman1 = new Bigfoot();
                Mothman Mothman2 = new Mothman();
                Bigfoot Bigfoot1 = new Bigfoot();
                add(Mothman1);
                add(Mothman2);
                add(Bigfoot1);
            }};
    
            // Players
            Player player1 = new Player(player1Name, p1DefaultDeck);
            Player player2 = new Player(player2Name, p2DefaultDeck);
    
            // * Man screw the tutorial for now
            // Asks the user if they need a tutorial
            // System.out.println("Do you need the tutorial? (true/false)");
    
            // playTutorial = in.nextBoolean(); // ? Scanner doesn't have way to grab a character specifically, so maybe refactor this later?
    
            // if (playTutorial == true)
            // {
            //     System.out.println("Alright, this is how you play the game.");
            // }
            // else
            // {
            //    System.out.println("Alright, let's get into the game.");
            // }

            // Main Gameplay Loop
            do
            {
                // Round counter
                gameplayLoopIndex++;
                System.out.println(EscapeCodes.BLACK_BACKGROUND_BRIGHT + "Round " + gameplayLoopIndex + EscapeCodes.RESET);

                // Player 1 Status Bar
                System.out.print("\t" + EscapeCodes.BLUE_BOLD + player1.name + EscapeCodes.RESET + "'s Current Cryptoid (left): " + EscapeCodes.CYAN_BOLD + player1.currentCryptoid.getName() + EscapeCodes.RESET + "  |  ");
                System.out.print("Health: " + EscapeCodes.GREEN_BOLD + player1.currentCryptoid.getCurrentHp() + EscapeCodes.RESET + "/" + EscapeCodes.GREEN + player1.currentCryptoid.getTotalHp() + "\t" + EscapeCodes.RESET);
                System.out.println("Attack: " + EscapeCodes.RED_BRIGHT + player1.currentCryptoid.getAttack() + EscapeCodes.RESET);

                // Player 2 Status Bar
                System.out.print("\t" + EscapeCodes.BLUE_BOLD + player2.name + EscapeCodes.RESET + "'s Current Cryptoid (right): " + EscapeCodes.CYAN_BOLD + player2.currentCryptoid.getName() + EscapeCodes.RESET + "  |  ");
                System.out.print("Health: " + EscapeCodes.GREEN_BOLD + player2.currentCryptoid.getCurrentHp() + EscapeCodes.RESET + "/" + EscapeCodes.GREEN + player2.currentCryptoid.getTotalHp() + "\t" + EscapeCodes.RESET);
                System.out.println("Attack: " + EscapeCodes.RED_BRIGHT + player2.currentCryptoid.getAttack() + EscapeCodes.RESET);
                
                hasPlayerWon = true;
            }
            while (hasPlayerWon == false);

            // Replay system
            System.out.println("Would you like to play again? (true/false)");
            willReplay = in.nextBoolean();

            // Replay catch cases
            if (willReplay == false)
            {
                System.out.println("Exiting...");
                System.exit(0);
            }
        }
        while (willReplay == true);
    }

    private static void clear()
    {
        // Clears previous output and flushes input buffer
        System.out.println(EscapeCodes.CLEAR);
        System.out.flush();
    }
}

