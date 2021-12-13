package com.company;

public class Goblin {
    private int health = 100;
    private int strength = 10;
    public static final String appearance = "\u1696";

    public Goblin() {
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public String toString(){
        return "Goblin{" + "health=" + getHealth() + ", " +
                "strength=" + getStrength() + "}";
    }
}
