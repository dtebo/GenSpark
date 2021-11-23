package com.company;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static int generateRandom(){
        return ThreadLocalRandom.current().nextInt(1, 20);
    }

    public static String getName(){
        System.out.println("Hello! What is your name? ");
        return sc.next();
    }

    public static boolean feedback(int guess, int realNum){
        if(guess > realNum){
            System.out.println("\r\nYour guess is too high.\r\n");
        }
        else if(guess < realNum){
            System.out.println("\r\nYour guess is too low.\r\n");
        }
        else{
            System.out.println("Good job! You guessed my number!");
            return true;
        }

        return false;
    }

    public static int getGuess(){
        System.out.println("Take a guess. ");
        return sc.nextInt();
    }

    public static boolean playAgain(){
        System.out.println("\r\nWould you like to play again? (y or n): ");
        String answer = sc.next();

        if(answer.equals("y")){
            return true;
        }

        return false;
    }

    public static void startGame() throws Exception{
        int numTries = 0;

        int randomNumber = generateRandom();

        String name = "";

        try {
            name = getName();
        }
        catch(Exception ex){
            System.out.println(ex);
        }

        System.out.println(String.format("\r\n\r\nWell, %s, I am thinking of a number between 1 and 20.", name));
//        System.out.println("\r\n\r\nTake a guess. ");

        int guess = -1;

        while(true){
            try{
                guess = getGuess();
            }
            catch(Exception ex){
                System.out.println(ex);
                break;
            }

            if(feedback(guess, randomNumber)){
               if(!playAgain()){
                   break;
               }

               randomNumber = generateRandom();
               numTries = 0;
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
