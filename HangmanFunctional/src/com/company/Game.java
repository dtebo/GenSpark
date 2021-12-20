package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Game {
    private List<String> words;

    public Game() {
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
        String boardState = Files.readString(Paths.get(filePath));
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


    }
}
