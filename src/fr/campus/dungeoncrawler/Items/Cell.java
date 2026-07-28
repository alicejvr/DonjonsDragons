package fr.campus.dungeoncrawler.Items;

import fr.campus.dungeoncrawler.Character.Player.Warrior;
import fr.campus.dungeoncrawler.Character.Player.Wizard;
import fr.campus.dungeoncrawler.Equipment.Defensive.DefensiveEquipment;
import fr.campus.dungeoncrawler.Equipment.Offensive.OffensiveEquipment;
import fr.campus.dungeoncrawler.Equipment.Offensive.Spell.Fireball;
import fr.campus.dungeoncrawler.Equipment.Offensive.Weapon.Mace;
import fr.campus.dungeoncrawler.Game;
import fr.campus.dungeoncrawler.Character.Character;

public class Cell<T> {
    private T cellContent;

    public Cell(T cellContent) {
        this.cellContent = cellContent;
    }

    public T getCellContent() {
        return cellContent;
    }

    public void setCellContent(T cellContent) {
        this.cellContent = cellContent;
    }

    public void interact(Character c) {

        if (((this.cellContent) instanceof Mace) && (c instanceof Warrior)) {
            System.out.println("Warrior gets it");

        } else if (((this.cellContent) instanceof Fireball) && (c instanceof Wizard)) {
            System.out.println("Wizard gets it");
        }
    }
}

