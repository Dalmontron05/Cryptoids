//* Base class that defines cryptoids
// This class is not meant to be used on it's own, it only provides a template for it's subclasses
package Cryptoids.Creatures;

public class Cryptoid
{
    //* Attributes
    private String name = "Cryptoid";
    // All possible types of cryptoids: Normal, Water, Flying
    private String type = "Normal";
    private int attack = 25;
    private int totalHp = 75;
    private int currentHp = 75;
    // ASKII Art Should be 50 characters long. Generate the art at https://www.asciiart.eu/image-to-ascii
    private String art = "?";


    //* Constructors
    // we use this constructor to override variable values from subclasses. it's not meant to be set from main
    public Cryptoid(String name, String type, int attack, int totalHp, int currentHp, String art)
    {
        this.name = name;
        this.type = type;
        this.attack = attack;
        this.totalHp = totalHp;
        this.currentHp = currentHp;
        this.art = art;
    }
    
    //* Methods
    // attackSequence will automatically call attack, isHealth0, and takeDamage. It'll returns if the other cryptoid is dead
    // WHY: some functions need to be called by this cryptoid, others need to be called by the opposing cryptoid
    public boolean attackSequence(Cryptoid other)
    {
        attack(other);
        Boolean isOtherDead = other.isHealth0();
        return isOtherDead;
    }

    public void attack(Cryptoid other)
    {
        other.takeDamage(getAttack());
    }

    public boolean isHealth0()
    {
        if (currentHp <= 0)
        {
            return true;
        }
        return false;
    }

    public void takeDamage(int damage)
    {
        currentHp -= damage;
    }

    
    //* Setters and Getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getTotalHp() {
        return totalHp;
    }

    public void setTotalHp(int totalHp) {
        this.totalHp = totalHp;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public void setCurrentHp(int currentHp) {
        this.currentHp = currentHp;
    }

    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }
}

