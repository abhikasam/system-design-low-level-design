package com.systemdesign.tictactoe.tictactoe.models;

import lombok.Data;

import java.util.Deque;
import java.util.List;

@Data
public class Board {
    private Deque<Player> players;
    private Piece[][] pieces;

    public Board() {
        this.pieces = new Piece[3][3];
    }

    void addPlayer(Player player){
        players.addLast(player);
    }

    void setPiece(Piece piece,int x,int y){
        if(x>=0 && x< 3 && y>=0 && y<3){
            if(pieces[x][y]!=null){
                pieces[x][y]=piece;
            }
        }
    }
}
