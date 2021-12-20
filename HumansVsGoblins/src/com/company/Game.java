package com.company;

public class Game {
    public void Start(){
        Land land = new Land();
//        land.randomizeBoard();

        Human human = new Human();

        land.draw(human.getPosition());

        human.move("e");

        land.draw(human.getPosition());


    }
}
