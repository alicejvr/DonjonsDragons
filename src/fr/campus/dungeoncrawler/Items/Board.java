package fr.campus.dungeoncrawler.Items;

import java.util.ArrayList;

public class Board {
    private int length;
    private ArrayList<Cell> board = new ArrayList<Cell>();

    public void initBoard() {
            board.add(new Cell("vide"));
            board.add(new Cell("ennemi"));
            board.add(new Cell("arme"));
            board.add(new Cell("potion"));

    }
// Constructors

    public Board(int length) {
        this.length = length;
    }


// Getters


    public ArrayList<Cell> getBoard() {
        return board;
    }


// Setters

    public void setLength(int length) {
        this.length = length;
    }


// Méthode toString

    @Override
    public String toString() {
        return "Board{" +
                "length=" + length +
                ", board=" + board +
                '}';
    }

}