//* Main Java File
package Cryptoids;

import ANSI.ConsoleColors;
import Cryptoids.Creatures.*;

// Imports
// import java.util.Scanner;


public class Main
{
    public static void main(String[] args)
    {
        // System.out.println(ConsoleColors.GREEN_BACKGROUND + "Hello World!");
        Bigfoot bigfoot = new Bigfoot();

        System.out.println("");
        System.out.println(bigfoot.art);
        
    }
}

