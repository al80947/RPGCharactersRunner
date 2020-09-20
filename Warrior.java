
public class Warrior {
//instance variables are being declared here
private String name;
private int level;
private int maxHealth;
private int health;
private int attack;
private int defense;
private int magicAttack;
private int magicDefense;
private int agility;
private int wisdom;

    //constructor: This is for creating a level 1 character
    public Warrior(String n) {
        name = n;
        level = 1;
        maxHealth = 20;
        health = maxHealth;
        attack = 10;
        defense = 8;
        magicAttack = 0;
        magicDefense = 4;
        agility = 8;
        wisdom = 2;
    }
    
    //constructor: For creating a higher level character
    public Warrior(String n, int 1) {
        name = n;
        level = lev;
        maxHealth = 20*lev;
        health = maxHealth;
        attack = 10*lev;
        defense = 8*lev;
        magicAttack = 0*lev;
        magicDefense = 4*lev;
        agility = 8*lev;
        wisom = 2*lev;
}


