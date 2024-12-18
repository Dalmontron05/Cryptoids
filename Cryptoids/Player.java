//* Base player class for both players.

package Cryptoids;
import Cryptoids.Creatures.*;
import java.util.ArrayList;

public class Player
{
    // Attributes
    public String name;
    public ArrayList<Cryptoid> deck;

    // Constructors
    public Player(String name, ArrayList<Cryptoid> deck)
    {
        this.name = name;
        this.deck = deck;
    }
}

