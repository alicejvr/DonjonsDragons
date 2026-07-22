package fr.campus.dungeoncrawler.Character;

import fr.campus.dungeoncrawler.Equipment.OffensiveEquipment;

public class Wizard extends Character {

    // Constructors
    public Wizard(String name)  {
        super("Wizard", name, 8, 6, new OffensiveEquipment("Bâton", 3, "Weapon"));
    }
}
