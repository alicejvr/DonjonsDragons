package fr.campus.dungeoncrawler.Character;

import fr.campus.dungeoncrawler.Equipment.Offensive.Weapon;

public class Warrior extends Character {
    /**
     *
     * @param name
     */
    // Constructor
    public Warrior(String name) {
        super("Warrior", name, 5, 10, 12, new Weapon("Dague", 3, "weapon"));
    }


}

