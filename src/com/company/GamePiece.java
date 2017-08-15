package com.company;

public class GamePiece {
    int positionX;
    int positionY;
    boolean frozen;
    private String name;
    String color;

//Constructors for GamePiece
    public GamePiece() {
        positionX = 0;
        positionY = 0;
        frozen = false;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public boolean getFrozen() {
        return frozen;
    }

    public void setFrozen(boolean frozen) {
        this.frozen = frozen;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }


//     freeze(takes no params)
//         call setFrozen(true)
//
//     unfreeze()
//         call setFrozen(false)
//
//     move(takes two numbers) don't move if frozen
//         if frozen = false
//             x = firstNumber
//             y = secondNumber

}
