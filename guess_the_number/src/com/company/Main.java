package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void startGame() throws Exception{
        int numTries = 0;

        Random random = new Random();
        int randomNumber = random.nextInt(20);

        System.out.println("Hello! What is your name? ");

        Scanner sc = new Scanner(System.in);
        String name = "";

        try {
            name = sc.nextLine();
        }
        catch(Exception ex){
            System.out.println(ex);
        }

        System.out.println(String.format("\r\n\r\nWell, %s, I am thinking of a number between 1 and 20.", name));
        System.out.println("\r\n\r\nTake a guess. ");

        int guess = -1;

        while(numTries < 6){
            try{
                guess = sc.nextInt();
            }
            catch(Exception ex){
                System.out.println(ex);
                break;
            }

            if(guess > randomNumber){
                System.out.println("\r\nYour guess is too high.\r\n");
                System.out.println("Take a guess. ");
            }
            else if(guess < randomNumber){
                System.out.println("\r\nYour guess is too low.\r\n");
                System.out.println("Take a guess. ");
            }
            else if(guess == randomNumber){
                System.out.println(String.format("Good job, %s! You guessed my number in %o guesses!", name, numTries + 1));
                System.out.println("\r\nWould you like to play again? (y or n): ");

                String playAgain = "";

                try{
                    playAgain = sc.next();
                }
                catch(Exception ex){
                    System.out.println(ex);
                }

                if(playAgain == "n"){
                    System.exit(0);
                }
                else if(playAgain == "y"){
                    startGame();
                }
                else{
                    System.exit(0);
                }
            }
            ++numTries;
        }
    }

    public static void main(String[] args) {
	// write your code here
        try {
            startGame();
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
