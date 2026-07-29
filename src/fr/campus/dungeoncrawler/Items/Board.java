package fr.campus.dungeoncrawler.Items;

import fr.campus.dungeoncrawler.Character.Enemy.Dragon;
import fr.campus.dungeoncrawler.Character.Enemy.Goblin;
import fr.campus.dungeoncrawler.Character.Enemy.Witch;
import fr.campus.dungeoncrawler.Equipment.Defensive.PotionBig;
import fr.campus.dungeoncrawler.Equipment.Defensive.PotionClassic;
import fr.campus.dungeoncrawler.Equipment.Offensive.Spell.Fireball;
import fr.campus.dungeoncrawler.Equipment.Offensive.Spell.Flash;
import fr.campus.dungeoncrawler.Equipment.Offensive.Weapon.Mace;
import fr.campus.dungeoncrawler.Equipment.Offensive.Weapon.Sword;


import java.util.ArrayList;

public class Board {
    private ArrayList<Cell<?>> board = new ArrayList<>();


    public Board() {
        for (int i = 0; i < 64; i++) {
            board.add(new CellEmpty());
        }

        int[] dragons = {45, 52, 56, 62};
        for (int pos : dragons) {
            board.set(pos - 1, new Cell<>(new Dragon("Dragon " + pos)));
        }

        int[] witches = {10, 20, 25, 32, 35, 36, 37, 40, 44, 47};
        for (int pos : witches) {
            board.set(pos - 1, new Cell<>(new Witch("Witch " + pos)));
        }

        int[] goblins = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30};
        for (int pos : goblins) {
            board.set(pos - 1, new Cell<>(new Goblin("Goblin " + pos)));
        }

        int[] maces = {2, 11, 5, 22, 38};
        for (int pos : maces) {
            board.set(pos - 1, new Cell<>(new Mace()));
        }

        int[] swords = {19, 26, 42, 53};
        for (int pos : swords) {
            board.set(pos - 1, new Cell<>(new Sword()));
        }

        int[] flashes = {1, 4, 8, 17, 23};
        for (int pos : flashes) {
            board.set(pos - 1, new Cell<>(new Flash()));
        }

        int[] fireballs = {48, 49};
        for (int pos : fireballs) {
            board.set(pos - 1, new Cell<>(new Fireball()));
        }

        int[] potionsClassic = {7, 13, 31, 33, 39, 43};
        for (int pos : potionsClassic) {
            board.set(pos - 1, new Cell<>(new PotionClassic()));
        }

        int[] potionsBig = {28, 41};
        for (int pos : potionsBig) {
            board.set(pos - 1, new Cell<>(new PotionBig()));
        }
    }

    public ArrayList<Cell<?>> getCells() {
        return board;
    }

    public void setBoard(ArrayList<Cell<?>> board) {
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