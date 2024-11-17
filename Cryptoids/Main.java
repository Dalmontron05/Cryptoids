//* Main Java File
package Cryptoids;

// Imports
import java.util.Scanner;
// import ANSI.ConsoleColors;
import Cryptoids.Creatures.*;


public class Main
{
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        // Variables
        String player1Name, player2Name, startConfirmation;


        // Introduction
        System.out.println("Hello, Welcome to Cryptoids! This is a co-op 1v1 card game (similar to pokemon tcg). Once you and your friend are ready, type 'Start'");
        startConfirmation = in.nextLine();
        System.out.println(startConfirmation);

        // checks to see if user input "Start"
        if (startConfirmation.equals("Start") || startConfirmation.equals("start"))
        {
            System.out.println("Perfect! Let's begin.");
        }
        else
        {
            System.out.println("The word 'Start' wasn't inputed, so the application is closing...");
            System.exit(0);
        }

        // Asks players for their names
        System.out.println("What is Player 1's name?");
        player1Name = in.nextLine();

        System.out.println("What is PLayer 2's Name?");
        player2Name = in.nextLine();


        // Objects
        //  Cryptoids
        Bigfoot bigfoot = new Bigfoot();
        Mothman mothman = new Mothman();

        // Players
        Player player1 = new Player(player1Name);
        Player player2 = new Player(player2Name);

        // Example battle
        System.out.println("\n\nLet's see an example battle before we jump in! We'll give " + player1Name + " bigfoot and " + player2Name + " mothman.\n");
        System.out.println(bigfoot.art);
        System.out.println(mothman.art);

        in.close();
    }
}

