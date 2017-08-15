package com.company;

public class Main {


    public static void main(String[] args) {

        GamePiece queen = new GamePiece();
        queen.move(4,5);
        queen.move(1,20);

        GamePiece pawn = new GamePiece();
        pawn.freeze();

    }
}
