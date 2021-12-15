package com.company;

import java.io.PrintStream;
import java.util.concurrent.ThreadLocalRandom;

public class Land {
    /*NOTE: 0 = Empty Space,
            1 = Human,
            2 = Goblin,
            3 = Drop,
            4 = Treasure
     */
    private static int[][] board = {{0,0,0,0,0,0,0,0,0,0},
                                    {0,0,0,0,0,0,0,0,0,0},
                                    {0,0,0,0,0,0,0,0,0,0},
                                    {0,0,0,0,0,0,0,0,0,0},
                                    {0,0,0,0,0,0,0,0,0,0},
                                    {0,0,0,0,0,0,0,0,0,0},
                                    {0,0,0,0,0,0,0,0,0,0},
                                    {0,0,0,0,0,0,0,0,0,0},
                                    {0,0,0,0,0,0,0,0,0,0},
                                    {0,0,0,0,0,0,0,0,0,0},};

    public Land() {
    }

    public void randomizeBoard(){
        for(int i = 0; i <= this.board.length - 1; i++){
            for(int j = 0; j <= this.board[i].length - 1; j++){
                int random = ThreadLocalRandom.current().nextInt(0, 2);
                this.board[i][j] = random;
            }
        }
    }

    public void draw(int[] humanPosition){
        String land = "\u0841";

        //Draw the human at its designated position
        board[humanPosition[0]][humanPosition[1]] = 1;

        //Print the game board
        for(int i = 0; i <= this.board.length - 1; i++){
//            System.out.print(land);
            for(int j = 0; j <= this.board[i].length - 1; j++){
                if(this.board[i][j] == 0){
                    System.out.print(land);
                }
                else if(this.board[i][j] == 1){
                    System.out.print(Human.appearance);
                }
                else if(this.board[i][j] == 2){
                    System.out.print(Goblin.appearance);
                }
            }
            System.out.println();
        }

        int[] prevPosition = humanPosition;

        //Clear the previous position
        board[prevPosition[0]][prevPosition[1]] = 0;

        System.out.println();
        System.out.println();
        System.out.println();
    }

    public static int[][] getBoard() {
        return board;
    }

    public static void setBoard(int[][] board) {
        Land.board = board;
    }
}
