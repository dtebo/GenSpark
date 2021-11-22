package com.company;

import java.util.ArrayList;

public class Guess {
    private ArrayList<Integer> locations;
    private boolean isCorrect;
    private String letter;

    public Guess() {
        this.locations = new ArrayList<>();
    }

    public ArrayList<Integer> getLocations() {
        return locations;
    }

    public void setLocations(ArrayList<Integer> locations) {
        this.locations = locations;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }
}
