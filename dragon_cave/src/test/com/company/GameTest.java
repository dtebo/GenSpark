package com.company;

import org.junit.jupiter.api.*;
import org.mockito.Mockito;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    Game game;

    @BeforeEach
    void setUp() {
        game = new Game();
    }

    @Test
    void getAnswer() {
        System.out.println(game.getAnswer());
        assertEquals(0, game.getAnswer(), "Error! Error!");
    }

    @Test
    void setAnswer() {
    }

    @Test
    void getInputAnswer() {
//        Scanner mockScanner = Mockito.mock(Scanner.class);
//        Mockito.when(mockScanner.nextInt()).thenReturn(1);
//
//        assertEquals(1, game.getInputAnswer());
//
//        Mockito.verify(mockScanner).nextInt();
    }

    @AfterEach
    void tearDown() {
        game = null;
    }
}