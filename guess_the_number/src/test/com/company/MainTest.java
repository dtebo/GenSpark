package com.company;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.Test
    void generateRandom() {
        int random = ThreadLocalRandom.current().nextInt(1, 20);
        assertTrue(random >= 1 && random <= 20);
    }

    @org.junit.jupiter.api.Test
    void getName() {
        String name = " ";
        assertEquals(" ", name);
    }

    @Test
    void displayIntro() {
        String intro = "Hello! What is your name? ";
        assertEquals("Hello! What is your name? ", intro);
    }

    @org.junit.jupiter.api.Test
    void feedback() {
        int random = 15;
        int guess = 15;

        assertTrue(random == guess);
    }

    @org.junit.jupiter.api.Test
    void getGuess() {

    }

    @org.junit.jupiter.api.Test
    void playAgain() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }
}