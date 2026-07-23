package fr.campus.dungeoncrawler.Character;

import fr.campus.dungeoncrawler.Equipment.Offensive.OffensiveEquipment;
import fr.campus.dungeoncrawler.Equipment.Offensive.Spell;

public class Wizard extends Character {
    /**
     *
     * @param name
     */
    // Constructors
    public Wizard(String name)  {
        super("Wizard", name, 8, 6, new Spell("Illusion", 2, "spell"));
    }

// Méthode toString



}
