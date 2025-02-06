package com.systemdesign.tictactoe.tictactoe.models;

public class Game {
    Board board;

    public Game() {
        this.board=new Board();
    }

    void start(){
        //add players
    }
    boolean isEnded(){
        //check if any three are same, either in row, column or dimensionally.
        return true;
    }
}