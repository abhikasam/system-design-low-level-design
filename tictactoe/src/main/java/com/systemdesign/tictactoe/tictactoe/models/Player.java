package com.systemdesign.tictactoe.tictactoe.models;

import lombok.Data;

@Data
public class Player {
    private String name;
    private Piece piece;

    public Player(String name, Piece piece) {
        this.name = name;
        this.piece = piece;
    }
}
