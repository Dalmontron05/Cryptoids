//* Main Java File
package Cryptoids;

// Imports
import java.util.Scanner;
import ANSI.EscapeCodes;
import Cryptoids.Creatures.*;

// TODO: refactor the whole introduction and tutorial in other methods. when you make the replay do loop, exclude those during a 'replay.'

public class Main
{
    public static void main(String[] args)
    {
        
        // Variables
        String player1Name, player2Name;
        Boolean playTutorial, willReplay;
        
        // Lets the users replay the game
        do
        {
            Scanner in = new Scanner(System.in);
            clear();
            willReplay = false;

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
            Bigfoot bigfoot = new Bigfoot();
            Mothman mothman = new Mothman();
    
            // Players
            Player player1 = new Player(player1Name);
            Player player2 = new Player(player2Name);
    
            // Asks the user if they need a tutorial
            System.out.println("Do you need the tutorial? (true/false)");
    
            playTutorial = in.nextBoolean(); // ? Scanner doesn't have way to grab a character specifically, so maybe refactor this later?
    
            if (playTutorial == true)
            {
                System.out.println("Alright, this is how you play the game.");
            }
            else
            {
                System.out.println("Alright, let's get into the game.");
            }

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

