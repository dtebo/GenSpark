package com.company;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void getSelectedWord() {
    }

    @org.junit.jupiter.api.Test
    void getNumWrongGuesses() {
    }

    @org.junit.jupiter.api.Test
    void getWord() {
        String word = "pizza";
        assertEquals("pizza",word);
    }

    @org.junit.jupiter.api.Test
    void printBoard() {
        String board = """
                                HANGMAN
                                
                                +--+
                                   |
                                   |
                                   |
                                  ===
                                  
                                  
                            """;

        assertEquals("""
                                HANGMAN
                                
                                +--+
                                   |
                                   |
                                   |
                                  ===
                                  
                                  
                            """, board);
    }
}