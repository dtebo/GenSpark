package com.company;

import java.util.Scanner;

public class Game {
    private int answer;

    public Game() {
    }

    public int getInputAnswer(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public StringBuilder intro(){
        StringBuilder sb = new StringBuilder();
        sb.append("You are in a land full of dragons. In front of you,\r\n");
        sb.append("you see two caves. In one cave, the dragon is friendly\r\n");
        sb.append("and will share his treasure with you. The other dragon\r\n");
        sb.append("is greedy and hungry and will eat you on sight.\r\n");
        sb.append("Which cave will you go into? (1 or 2): ");

        return sb;
    }

    public boolean processAnswer(int answer){
        StringBuilder sb;

        switch(answer){
            case 1:
                sb = new StringBuilder();
                sb.append("\r\n\r\nYou approach the cave...\r\n\r\n");
                sb.append("It is dark and spooky...\r\n\r\n");
                sb.append("A large dragon jumps out in front of you! He opens his jaws and...\r\n\r\n");
                sb.append("Gobbles you down in one bite!");
                System.out.println(sb);
                break;
            case 2:
                sb = new StringBuilder();
                sb.append("\r\n\r\nYou approach the cave...\r\n\r\n");
                sb.append("It is brightly lit...\r\n\r\n");
                sb.append("You notice the light gleaming from the bountiful treasure inside!\r\n\r\n");
                sb.append("A large dragon approaches you smiling! He gleefully proclaims, 'What's mine is yours! Enjoy!'\r\n\r\n");
                sb.append("You've won the day! Congratulations!");
                System.out.println(sb);
                return true;
            default:
                break;
        }

        return false;
    }

    public void startGame(){
        System.out.println(intro());

        int answer = 0;

        try {
            answer = getInputAnswer();
        }
        catch(Exception ex){
            System.out.println(ex);
        }

        processAnswer(answer);
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }
}
