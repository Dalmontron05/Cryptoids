//* Base player class for both players.

package Cryptoids;
import Cryptoids.Creatures.*;
import java.util.ArrayList;

public class Player
{
    // Attributes
    public String name;
    public ArrayList<Cryptoid> deck;
    public Cryptoid currentCryptoid;

    // Constructors
    public Player(String name, ArrayList<Cryptoid> deck)
    {
        this.name = name;
        this.deck = deck; // the first index is considered the "current" cryptoid enganged in combat
        currentCryptoid = deck.get(0);
    }
}

