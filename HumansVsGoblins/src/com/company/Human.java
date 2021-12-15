package com.company;

public class Human {
    private int Health = 100;
    private int[] position = {4, 0};
    public static String appearance = "\u1e24";

    public Human() {
    }

    public void checkSpace(int[][] board){

    }

    public void move(String direction){
        switch(direction){
            case "n":
                position[0] = position[0] - 1;
                break;
            case "s":
                position[0] = position[0] + 1;
                break;
            case "e":
                position[1] = position[1] + 1;
                break;
            case "w":
                position[1] = position[1] - 1;
                break;
            default:
                break;
        }
    }

    public int[] getPosition() {
        return position;
    }

    public void setPosition(int[] position) {
        this.position = position;
    }

    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        Health = health;
    }

    @Override
    public String toString(){
        return "Human{health=" + getHealth() + "}";
    }
}
