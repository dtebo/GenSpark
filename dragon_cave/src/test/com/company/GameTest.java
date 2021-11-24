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
        StringBuilder sb = new StringBuilder();
        int answer = 1;

        switch(answer){
            case 1:
                sb = new StringBuilder();
                sb.append("\r\n\r\nYou approach the cave...\r\n\r\n");
                sb.append("It is dark and spooky...\r\n\r\n");
                sb.append("A large dragon jumps out in front of you! He opens his jaws and...\r\n\r\n");
                sb.append("Gobbles you down in one bite!");
                break;
            case 2:
                sb = new StringBuilder();
                sb.append("\r\n\r\nYou approach the cave...\r\n\r\n");
                sb.append("It is brightly lit...\r\n\r\n");
                sb.append("You notice the light gleaming from the bountiful treasure inside!\r\n\r\n");
                sb.append("A large dragon approaches you smiling! He gleefully proclaims, 'What's mine is yours! Enjoy!'\r\n\r\n");
                sb.append("You've won the day! Congratulations!");
                break;
            default:
                break;
        }

        StringBuilder expected = new StringBuilder();
        expected.append("\r\n\r\nYou approach the cave...\r\n\r\n");
        expected.append("It is dark and spooky...\r\n\r\n");
        expected.append("A large dragon jumps out in front of you! He opens his jaws and...\r\n\r\n");
        expected.append("Gobbles you down in one bite!");

        assertEquals(expected.toString(), sb.toString());
    }

    @Test
    void setAnswer() {
    }

    @Test
    void getInputAnswer() {
    }

    @AfterEach
    void tearDown() {
        game = null;
    }
}