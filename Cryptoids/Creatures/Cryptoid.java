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


    //* Methods
    public void printArt()
    {
        System.out.println(art);
    }
}

