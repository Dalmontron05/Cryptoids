//* Main Java File
package Cryptoids;

import ANSI.ConsoleColors;

// Imports
// import java.util.Scanner;


public class Main
{
    public static void main(String[] args)
    {
        System.out.println(ConsoleColors.GREEN_BACKGROUND + "Hello World!");
        Cryptoid test = new Cryptoid();
        // System.out.println(test.name);
        test.printName();
    }

    public static void Player()
    {}
}

