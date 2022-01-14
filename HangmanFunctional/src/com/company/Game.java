package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class Game {
    private List<String> words;
    private Stream<Guess> guesses;
    private int numWrongGuesses;

    public Game() {
    }

    public int getNumWrongGuesses() {
        return numWrongGuesses;
    }

    public void setNumWrongGuesses(int numWrongGuesses) {
        this.numWrongGuesses = numWrongGuesses;
    }

    public List<String> getWords() {
        return words;
    }

    public void setWords(List<String> words) {
        this.words = words;
    }

    public String getGameWord(){
        int random = ThreadLocalRandom.current().nextInt(0, getWords().size() - 1);

        return getWords().get(random);
    }

    public void printBoard(String filePath) throws IOException {
        List<String> boardStates = Files.readAllLines(Paths.get(filePath));

        switch(getNumWrongGuesses()){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                break;
        }
    }

    public List<String> readWords(String filePath) throws IOException {
        List<String> fileWords = new ArrayList<>();

        fileWords = Files.readAllLines(Paths.get(filePath));

        return fileWords;
    }

    public void start() throws IOException {
        try{
            setWords(readWords("C:\\GenSpark\\GenSpark\\HangmanFunctional\\src\\com\\company\\words.txt"));
        }
        catch(Exception ex){
            System.out.println(ex);
        }

        Player player1 = new Player();

        System.out.println("Welcome to Hangman!");
        System.out.println();
        System.out.println("Please enter your name: ");

        Scanner sc = new Scanner(System.in);
        player1.setName(sc.next());

        System.out.println(String.format("Welcome, %s!", player1.getName()));

        while(numWrongGuesses < 3){
            System.out.println("Guess a letter: ");

            Scanner sc2 = new Scanner(System.in);
            String letter = "";

            try{
                letter = sc2.next();

                if(letter.length() > 1){
                    throw new Exception("A guess can only be one character.");
                }

                guesses
                        .forEach(g -> {
                            if (g.getLetter().equals(letter)) {
                                System.out.println("You have already guessed that letter. Choose again.");
                                setNumWrongGuesses(numWrongGuesses + 1);
                            }
                        });

//                for(Guess g: guesses){
//                    //Has the letter been guessed?
//                    if(g.getLetter().equals(letter)){
//                        //Yes!
//                        System.out.println("You have already guessed that letter. Choose again.");
//                        setNumWrongGuesses(numWrongGuesses + 1);
//                        continue;
//                    }
//                }
            }
            catch(Exception ex){
                System.out.println(ex);
            }

            //Main Game Loop
            Guess guess = new Guess();
            guesses.concat(guess);
        }
    }
}
