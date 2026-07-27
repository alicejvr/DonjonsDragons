package fr.campus.dungeoncrawler.Items;

import fr.campus.dungeoncrawler.Equipment.Defensive.Potion;

import java.util.ArrayList;

public class Board {
    private ArrayList<Cell> board = new ArrayList<Cell>();


// Constructors

    public Board() {
        board.add(new Cell(new Potion("Potion Rouge", 3, "death")));
        /* board.add(new Cell("ennemi"));
        board.add(new Cell("arme"));
        board.add(new Cell("potion"));
        board.add(new Cell("test 5"));
        board.add(new Cell("test 6"));
        board.add(new Cell("test 7"));
        board.add(new Cell("test 8"));
        board.add(new Cell("test 9"));
        board.add(new Cell("dernier test")); */

    }


// Getters

    public ArrayList<Cell> getBoard() {
        return board;
    }


// Setters

    public void setBoard(ArrayList<Cell> board) {
        this.board = board;
    }


// Méthode toString

    @Override
    public String toString() {
        return "Board{" +
                ", board=" + board +
                '}';
    }

}