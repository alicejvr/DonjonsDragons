package fr.campus.dungeoncrawler.Character.Player;

import fr.campus.dungeoncrawler.Character.Character;
import fr.campus.dungeoncrawler.Equipment.Defensive.Potion;
import fr.campus.dungeoncrawler.Equipment.Offensive.Spell;

public class Wizard extends Character {
    /**
     *
     * @param name
     */
    // Constructors
    public Wizard(String name)  {
        super("Wizard", name, 7, 7, 7, new Spell("Sort d'illusion", 2, "spell"), new Potion("Potion", 2, "Potion"));
    }

// Méthode toString



}
