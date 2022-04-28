package ru.gb.semenova.homework4;

import java.util.Random;

public class Task1 {
    public static final int WIDTH = 10;
    public static final int HEIGHT = 10;
    public static final int MINES_COUNT = 20;
    public static final int MINE = 1000;
    public static final int EMPTY = 0;
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {

        play();
    }

    public static void play() {
        boolean win = true;
        int[][] board = generateBoard();
        printBoard(board);
    }

    public static int[][] generateBoard() {
        final int[][] board = new int[HEIGHT][WIDTH];
        Random random = new Random();
        int mines = MINES_COUNT;
        while (mines > 0) {
            int x, y;
            do {
                x = random.nextInt(HEIGHT);
                y = random.nextInt(WIDTH);
            } while (board[x][y] == MINE);
            board[x][y] = MINE;
            mines--;
        }

        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                if (board[i][j] == MINE) {
                    continue;
                }
                int mCount = 0;
                for (int k = i - 1; k <= i + 1; k++) {
                    for (int l = j - 1; l <= j + 1; l++) {
                        if (k < 0 || k >= HEIGHT || l < 0 || l >= WIDTH){
                            continue;
                        }
                        if (board[k][l] == MINE) {
                            mCount++;
                        }
                    }
                }

            }
        }

        return board;
    }

    public static void printBoard(int[][] board) {
        System.out.println("    ");
        for (char i = 'A'; i < 'A' + WIDTH; i++ ){
            System.out.print("  " + i);
        }
        System.out.println();
        for (int i = 0; i < HEIGHT; i++){
            System.out.printf("%3d", i);
            for (int j = 0; j < WIDTH; j++){
                if (board[i][j] == EMPTY){
                    System.out.print(" .");
                } else if (board[i][j] == MINE) {
                    System.out.print(" *");
                } else {
                    System.out.printf("%2d", board[i][j]);
                }
            }
            System.out.println();
        }
    }
}
