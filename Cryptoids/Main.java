//* Main Java File
package Cryptoids;

// Imports
import java.util.Scanner;
import ANSI.EscapeCodes;
import Cryptoids.Creatures.*;


public class Main
{
    
    public static void main(String[] args)
    {
        clear();

        Scanner in = new Scanner(System.in);

        // Variables
        String player1Name, player2Name;


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
        
        // Example battle
        // System.out.println("\n\nLet's see an example battle before we jump in! We'll give " + player1Name + " bigfoot and " + player2Name + " mothman.\n");
        // System.out.println(bigfoot.art);
        // System.out.println(mothman.art);
        
        bigfoot.printArt();
        mothman.printArt();

        in.close();
    }

    private static void clear()
    {
        // Clears previous output and flushes input buffer
        System.out.println(EscapeCodes.CLEAR);
        System.out.flush();
    }
}

