package com.systemdesign.tictactoe.tictactoe.models;

import lombok.Data;

@Data
public class Piece {
    private PieceType pieceType;

    public Piece(PieceType pieceType) {
        this.pieceType = pieceType;
    }
}
