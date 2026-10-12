package com.checkmate.model;
import com.checkmate.model.Position;

public class PositionTestManual {
    public static void main(String[] args){

        Position position = new Position(3, 5);

        System.out.println("Row: " + position.getRow());
        System.out.println("Column: " + position.getColumn());

    }
}
