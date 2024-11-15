package Cryptoids.Creatures;

public class Cryptoid {
    // Attributes
    public String name;
     // All possible types of cryptoids: Normal, Water
    public String type;
    public int attack;
    public int totalHp;
    public int currentHp;
    public String art;

    // Constructors
    // public Cryptoid(String name, String type, int attack, int totalHp, int currentHp, String art)
    // {
    //     this.name = name; 
    //     this.type = type; 
    //     this.attack = attack; 
    //     this.totalHp = totalHp; 
    //     this.currentHp = currentHp; 
    //     this.art = art; 
    // }

    public Cryptoid()
    {
        name = "Cryptoid";
        type = "Normal";
        attack = 25;
        totalHp = 75;
        currentHp = 75;
        art = "?";
    }
}

