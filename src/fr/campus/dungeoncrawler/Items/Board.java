package fr.campus.dungeoncrawler.Items;

import java.util.ArrayList;

public class Board {
    private int length = 64;
    private ArrayList<Cell> board = new ArrayList<Cell>();

public int initBoard() {
    for(int i = 0; i < length; i++){
        board.add(new Cell());
    }
    return board.size();
}
// Constructors

// Getters


    public ArrayList<Cell> getBoard() {
        return board;
    }
}

// Setters


// Méthode toString



