package com.kodilla.patterns.builder.checker;

public class Board {
    public final static int MIN_INDEX = 0;
    public final static int MAX_INDEX = 9;
    private Figure[][] board = new Figure[10][10];

//    public Board() {
//        for (int n = 0; n < 10; n++) {
//            board[n] = new Figure[10];
//        }
//    }

    public Figure getFigure(int x, int y) {
        return board[x][y];
    }

    public void setFigure(Figure figure, int x, int y) {
        board[x][y] = figure;
    }

    public String toString() {
        String result = "";
        for (int n = MIN_INDEX; n <= MAX_INDEX; n++) {
            result += "|";
            for (int k = MIN_INDEX; k <= MAX_INDEX; k++) {
                if (board[n][k] == null) {
                    result += "  ";
                } else {
                    result += (board[n][k]).getColor().equals(Figure.BLACK) ? "b" : "w";
                    result += (board[n][k]) instanceof Pawn ? "P" : "Q";
                }
                result += "|";
            }
            result += "\n";
        }
        return result;
    }
}
