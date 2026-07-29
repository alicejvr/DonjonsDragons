package fr.campus.dungeoncrawler.Items;

import fr.campus.dungeoncrawler.Character.Enemy.Dragon;
import fr.campus.dungeoncrawler.Character.Enemy.Goblin;
import fr.campus.dungeoncrawler.Character.Enemy.Witch;
import fr.campus.dungeoncrawler.Character.Player.Warrior;
import fr.campus.dungeoncrawler.Character.Player.Wizard;
import fr.campus.dungeoncrawler.Equipment.Defensive.DefensiveEquipment;
import fr.campus.dungeoncrawler.Equipment.Defensive.PotionBig;
import fr.campus.dungeoncrawler.Equipment.Defensive.PotionClassic;
import fr.campus.dungeoncrawler.Equipment.Offensive.OffensiveEquipment;
import fr.campus.dungeoncrawler.Equipment.Offensive.Spell.Fireball;
import fr.campus.dungeoncrawler.Equipment.Offensive.Spell.Flash;
import fr.campus.dungeoncrawler.Equipment.Offensive.Weapon.Mace;
import fr.campus.dungeoncrawler.Equipment.Offensive.Weapon.Sword;
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
// TODO si la case est une CellEmpty, on passe au tour suivant = rollDice() automatiquement

        if (((this.cellContent instanceof Mace) || (this.cellContent instanceof Sword)) && (c instanceof Warrior)) {
            OffensiveEquipment theWeapon = (OffensiveEquipment) cellContent;
            c.setAttackLevel(c.getAttackLevel() + theWeapon.getPoints());
            System.out.println("-*-*-*- "+ c.getName() +" gagne " + theWeapon.getPoints() + " points d'attaque !");

        } else if (((this.cellContent instanceof Fireball) || (this.cellContent instanceof Flash)) && (c instanceof Wizard)) {
            OffensiveEquipment theWeapon = (OffensiveEquipment) cellContent;
            c.setAttackLevel(c.getAttackLevel() + theWeapon.getPoints());
            System.out.println("-*-*-*- "+ c.getName() +" gagne " + theWeapon.getPoints() + " points d'attaque !");
        }

        if ((this.cellContent instanceof PotionBig) || (this.cellContent instanceof PotionClassic)) {
            DefensiveEquipment thePotion = (DefensiveEquipment) cellContent;
            c.setLifePoints(c.getLifePoints() + thePotion.getPoints());
            System.out.println("-*-*-*- "+ c.getName() +" gagne " + thePotion.getPoints() +" points de vie !");
        }

        if ((this.cellContent instanceof Dragon) || (this.cellContent instanceof Witch) || (this.cellContent instanceof Goblin)) {
            System.out.println("-*-*-*- "+ c.getName() +" attaque !");


        }
    }


}