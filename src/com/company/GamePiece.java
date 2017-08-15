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

    public void freeze() {
        //if the game piece is not frozen
        // then call the freeze sets to the frozen variable true

        if (this.frozen == false){
            this.frozen = true;
        }
        System.out.println(this.frozen);
    }
    public void unfreeze(){
        if (this.frozen == true){
            this.frozen = false;
        }
        System.out.println(this.frozen);
    }

    public void move(int x ,int y){
        System.out.println("moving to the");
      if (this.frozen == false){
          this.positionY = y;
          this.positionX = x;
      }
    }

}
