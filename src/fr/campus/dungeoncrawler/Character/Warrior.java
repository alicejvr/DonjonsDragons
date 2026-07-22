package fr.campus.dungeoncrawler.Character;

import fr.campus.dungeoncrawler.Equipment.OffensiveEquipment;

public class Warrior extends Character {

    // Constructor
    public Warrior(String name) {
        super("Warrior", name, 5, 10, new OffensiveEquipment("Dague", 2, "Weapon"));
    }

}

