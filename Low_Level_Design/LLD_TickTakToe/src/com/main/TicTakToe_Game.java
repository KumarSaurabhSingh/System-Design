package com.main;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.model.PieceType;
import com.model.Player;
import com.model.childPiece.PlayingPiece_O;
import com.model.childPiece.PlayingPiece_X;
import com.playing_board.Board;


public class TicTakToe_Game {
    Deque<Player> players;
    Board gameBoard;

    TicTakToe_Game() {
        initializeGame();
    }

    public void initializeGame() {
        // Creating two players
        players = new LinkedList<>();

        PlayingPiece_X pieceCross = new PlayingPiece_X();
        Player player1 = new Player("Player 1", pieceCross);

        PlayingPiece_O pieceNot = new PlayingPiece_O();
        Player player2 = new Player("Player 2", pieceNot);

        players.add(player1);
        players.add(player2);

        // Initializing the board
        gameBoard = new Board(3);
    }

    public String StartGame() {
        boolean noWinner = true;
        Scanner input = new Scanner(System.in);

        while (noWinner) {
            Player playerTurn = players.removeFirst();
            gameBoard.printBoard();

            List<Pair> freeSpaces = gameBoard.getFreeCells();
            if (freeSpaces.isEmpty()) {
                noWinner = false;
                break;
            }

            // Read user input
            System.out.println(playerTurn.name + ", enter the row and column number (comma-separated): ");
            String s = input.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.parseInt(values[0].trim());
            int inputCol = Integer.parseInt(values[1].trim());

            // Place the piece
            boolean pieceAdded = gameBoard.addPiece(inputRow, inputCol, playerTurn.playingPiece);
            if (!pieceAdded) {
                System.out.println("Incorrect position! Please try again.");
                players.addFirst(playerTurn);
                continue;
            }

            // Check if there's a winner
            boolean winner = isThereWinner(inputRow, inputCol, playerTurn.playingPiece.pieceType);
            if (winner) {
                input.close();
                return playerTurn.name + " wins!";
            }

            players.addLast(playerTurn);
        }

        input.close();
        return "It's a tie!";
    }

    public boolean isThereWinner(int row, int col, PieceType pieceType) {
        boolean rowMatch = true, colMatch = true, diagonalMatch = true, antiDiagonal = true;

        // Check row
        for (int i = 0; i < gameBoard.size; i++) {
            if (gameBoard.board[row][i] == null || gameBoard.board[row][i].pieceType != pieceType) {
                rowMatch = false;
            }
        }

        // Check column
        for (int i = 0; i < gameBoard.size; i++) {
            if (gameBoard.board[i][col] == null || gameBoard.board[i][col].pieceType != pieceType) {
                colMatch = false;
            }
        }

        // Check main diagonal
        for (int i = 0; i < gameBoard.size; i++) {
            if (gameBoard.board[i][i] == null || gameBoard.board[i][i].pieceType != pieceType) {
                diagonalMatch = false;
            }
        }

        // Check anti-diagonal
        for (int i = 0, j = gameBoard.size - 1; i < gameBoard.size; i++, j--) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
                antiDiagonal = false;
            }
        }

        return rowMatch || colMatch || diagonalMatch || antiDiagonal;
    }
}
