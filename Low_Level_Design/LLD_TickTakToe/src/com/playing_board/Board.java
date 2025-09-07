package com.playing_board;

import java.util.ArrayList;
import java.util.List;

import com.main.Pair;
import com.model.PlayingPiece;


public class Board {

    public int size;
    public PlayingPiece[][] board;

    //Constructor
    public Board(int size){
        this.size = size;
        board = new PlayingPiece[size][size];
    }


    // Adding piece on the board
    public boolean addPiece(int row, int col, PlayingPiece playingPiece) {
        if (board[row][col] != null) {
            return false;
        }
        board[row][col] = playingPiece;
        return true;
    }


    // Checking for free cells
    public List<com.main.Pair> getFreeCells() {
        List<Pair> freeCells = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) {
                    freeCells.add(new Pair(i, j));
                }
            }
        }
        return freeCells;
    }

    // Print Board Method (Needed in TicTakToe_Game)
    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) {
                    System.out.print("- ");
                } else {
                    System.out.print(board[i][j].pieceType + " ");
                }
            }
            System.out.println();
        }
    }


}
