package com.company;



public class Main {

    public static void freeze(GamePiece piece) {
        // if piece.frozen = true
        // do something else
        piece.setFrozen(true);
        System.out.println(piece.frozen);
    }
    public static void main(String[] args) {
	    // write your code here
        // Create a GamePiece object.
        // Only call the methods on the object, do not access the instance variables
        // directly (piece.frozen = true)
        GamePiece piece  = new GamePiece();
        freeze(piece);



//        Verify that if the game piece is not frozen then the call to freeze sets the frozen varable to true.
//        Verify that if the game piece is frozen then the call to unfreeze sets the frozen varable to false.
//        Verify that if the game piece is not frozen then the call to move results in the new position.
//        Verify that if the game piece is frozen then the call to move does not change the position.

        //test freeze, unfreeze, move

    }
}
