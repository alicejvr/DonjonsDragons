package fr.campus.dungeoncrawler.Items;

import fr.campus.dungeoncrawler.Character.Enemy.Dragon;
import fr.campus.dungeoncrawler.Character.Enemy.Goblin;
import fr.campus.dungeoncrawler.Character.Enemy.Witch;
import fr.campus.dungeoncrawler.Equipment.Defensive.PotionBig;
import fr.campus.dungeoncrawler.Equipment.Defensive.PotionClassic;
import fr.campus.dungeoncrawler.Equipment.Offensive.Fireball;
import fr.campus.dungeoncrawler.Equipment.Offensive.Flash;
import fr.campus.dungeoncrawler.Equipment.Offensive.Mace;
import fr.campus.dungeoncrawler.Equipment.Offensive.Sword;

import java.util.ArrayList;

public class Board {
    private ArrayList<Cell> board = new ArrayList<Cell>();


// Constructors

    public Board() {
        board.add(new Cell(new PotionBig()));
        board.add(new Cell(new Dragon("Eragon")));
        board.add(new Cell(new Witch("Bellatrix")));
        board.add(new Cell(new Goblin("Gimli")));
        board.add(new Cell(new Mace()));
        board.add(new Cell(new Sword()));
        board.add(new Cell(new Flash()));
        board.add(new Cell(new Fireball()));
        board.add(new Cell(new PotionClassic()));
        board.add(new Cell("empty"));

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