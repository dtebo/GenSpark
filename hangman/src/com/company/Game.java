package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private final String[] WORDS = {"cat","job","programmer","roof","pizza"};
    private String selectedWord;
    private int numWrongGuesses = 0;
    private String wordChars = "";
    private ArrayList<Guess> guesses = new ArrayList<>();
    private HashMap<Character, ArrayList<Integer>> charLocations = new HashMap<>();

    public String getSelectedWord() {
        return selectedWord;
    }

    public void setSelectedWord(String selectedWord) {
        this.selectedWord = selectedWord;
    }

    public int getNumWrongGuesses() {
        return numWrongGuesses;
    }

    public void setNumWrongGuesses(int numWrongGuesses) {
        this.numWrongGuesses = numWrongGuesses;
    }

    public String getWord(){
        Random random = new Random();

        //Get the index for the random word choice
        int randIndex = random.nextInt(4);

        return WORDS[randIndex];
    }

    public void printBoard(StringBuilder sb, String letter){
        if(guesses.size() > 0 && letter != ""){
            for(int i = 0; i <= guesses.size() - 1; i++){
                if(guesses.get(i).getLocations().size() > 0){
                    for(int j = 0; j <= guesses.get(i).getLocations().size() - 1; j++){
                        sb.setCharAt(guesses.get(i).getLocations().get(j), guesses.get(i).getLetter().charAt(0));
                    }
                }
            }

            switch (getNumWrongGuesses()){
                case 1:
                    System.out.println("HANGMAN\r\n");
                    System.out.println("+--+");
                    System.out.println("o  |");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("  ===\r\n\r\n");
                    break;
                case 2:
                    System.out.println("HANGMAN\r\n");
                    System.out.println("+--+");
                    System.out.println("o  |");
                    System.out.println("|  |");
                    System.out.println("   |");
                    System.out.println("  ===\r\n\r\n");
                    break;
                case 3:
                    System.out.println("HANGMAN\r\n");
                    System.out.println("+--+");
                    System.out.println("o  |");
                    System.out.println("|  |");
                    System.out.println("|  |");
                    System.out.println("  ===\r\n\r\n");
                    break;
                default:
                    System.out.println("HANGMAN\r\n");
                    System.out.println("+--+");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("  ===\r\n\r\n");
                    break;
            }
        }

        System.out.println("");
        System.out.println(sb);
    }

    public void start(){
        setSelectedWord(getWord());

        wordChars = "";
        for(int i = 0; i <= getSelectedWord().length() - 1; i++){
            wordChars += "_";
        }

        StringBuilder sb = new StringBuilder(wordChars);

        System.out.println("HANGMAN\r\n");
        System.out.println("+--+");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("  ===\r\n\r\n");

        printBoard(sb, "");

        while(numWrongGuesses < 3){
            System.out.print("Guess a letter. ");

            Scanner scanner = new Scanner(System.in);
            String letter = "";

            try{
                letter = scanner.next();

                if(letter.length() > 1){
                    throw new Exception("A guess can only be one character.");
                }

                //Check all guesses
                for(Guess g: guesses){
                    //Has the letter been guessed?
                    if(g.getLetter().equals(letter)){
                        //Yes!
                        System.out.println("You have already guessed that letter. Choose again.");
                        setNumWrongGuesses(numWrongGuesses + 1);
                        continue;
                    }
                }
            }
            catch(Exception ex){
                System.out.println(ex);
                break;
            }

            Guess guess = new Guess();
            guess.setLetter(letter);

            if(getSelectedWord().contains(letter)){
                guess.setCorrect(true);

                int index = getSelectedWord().indexOf(letter);
                while(index >= 0){

                    if(index != -1){
                        guess.getLocations().add(index);
                    }

                    index = getSelectedWord().indexOf(letter, index + 1);
                }
            }
            else{
                guess.setCorrect(false);
                setNumWrongGuesses(numWrongGuesses + 1);
            }

            guesses.add(guess);

            printBoard(sb, letter);

            if(sb.toString().equals(getSelectedWord())){
                System.out.println(String.format("Yes! The secret word is \"%s\"! You have won!\r\n", getSelectedWord()));
                System.out.print("Do you want to play again? (yes or no) ");

                String answer = scanner.next();

                if(answer.equals("yes")){
                    sb.delete(0, sb.length() - 1);
                    guesses.clear();
                    start();
                }
                else{
                    System.exit(0);
                }
            }
        }

        System.out.println("You Fail!");
    }
}
