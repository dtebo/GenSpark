package com.company;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    Main main;

    @BeforeEach
    void setUp() {
        main = new Main();
    }

    @Test
    void main() {
    }

    @Test
    void startGame() {

    }

    @AfterEach
    void tearDown() {
        main = null;
    }
}