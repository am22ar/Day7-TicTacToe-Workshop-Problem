package com.tictactoe;

import java.util.Scanner;

public class TicTacToe {
    int i;
    char[] board = new char[10];
    char player, computer;
    Scanner scan = new Scanner(System.in);

    public void initialize() {
        for (i = 1; i < 10; i++) {
            board[i] = ' ';
        }
    }

    public void showboard() {
        System.out.println(board[1] + " | " + board[2] + " | " + board[3]);
        System.out.println("---------");
        System.out.println(board[4] + " | " + board[5] + " | " + board[6]);
        System.out.println("---------");
        System.out.println(board[7] + " | " + board[8] + " | " + board[9]);
    }
    public void check()
    {
        System.out.println("Please Select Your Choice Letter : 'X' or 'O' ");
        char choice = scan.next().toUpperCase().charAt(0);
        if (choice == 'X') {
            player = 'X';
            computer = 'O';
        } else if (choice == 'Y') {
            player = 'O';
            computer = 'X';
        }
    }
    public static void main(String[] args) {

        TicTacToe obj = new TicTacToe();
        obj.initialize();
        obj.showboard();

    }
}
