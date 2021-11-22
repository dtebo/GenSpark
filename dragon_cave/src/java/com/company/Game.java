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

    public void startGame(){
        StringBuilder sb = new StringBuilder();
        sb.append("You are in a land full of dragons. In front of you,\r\n");
        sb.append("you see two caves. In one cave, the dragon is friendly\r\n");
        sb.append("and will share his treasure with you. The other dragon\r\n");
        sb.append("is greedy and hungry and will eat you on sight.\r\n");
        sb.append("Which cave will you go into? (1 or 2): ");

        System.out.println(sb);

        int answer = 0;

        try {
            answer = getInputAnswer();
        }
        catch(Exception ex){
            System.out.println(ex);
        }

        switch(answer){
            case 1:
                StringBuilder sbAns1 = new StringBuilder();
                sbAns1.append("\r\n\r\nYou approach the cave...\r\n\r\n");
                sbAns1.append("It is dark and spooky...\r\n\r\n");
                sbAns1.append("A large dragon jumps out in front of you! He opens his jaws and...\r\n\r\n");
                sbAns1.append("Gobbles you down in one bite!");
                System.out.println(sbAns1);
                break;
            case 2:
                StringBuilder sbAns2 = new StringBuilder();
                sbAns2.append("\r\n\r\nYou approach the cave...\r\n\r\n");
                sbAns2.append("It is brightly lit...\r\n\r\n");
                sbAns2.append("You notice the light gleaming from the bountiful treasure inside!\r\n\r\n");
                sbAns2.append("A large dragon approaches you smiling! He gleefully proclaims, 'What's mine is yours! Enjoy!'\r\n\r\n");
                sbAns2.append("You've won the day! Congratulations!");
                System.out.println(sbAns2);
                break;
            default:
                break;
        }

    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }
}
