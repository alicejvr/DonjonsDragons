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
        board.add(new Cell("test 5"));
        board.add(new Cell("test 6"));
        board.add(new Cell("test 7"));
        board.add(new Cell("test 8"));
        board.add(new Cell("test 9"));
        board.add(new Cell("dernier test"));


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