package com.checkmate.model;

public class Board {

    private int[][] squares = new int[8][8];

    public int getSquares(int row, int column) {
        return squares[row][column];
    }

    public void setSquares(int row, int column, int value){
        squares[row][column] = value;
    }

}