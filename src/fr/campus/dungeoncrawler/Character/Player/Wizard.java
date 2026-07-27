package fr.campus.dungeoncrawler.Character.Player;

import fr.campus.dungeoncrawler.Character.Character;
import fr.campus.dungeoncrawler.Equipment.Defensive.PotionClassic;
import fr.campus.dungeoncrawler.Equipment.Offensive.Spell;

public class Wizard extends Character {

    public Wizard(String name) {
        super("Wizard", name, 7, 7, 7,
                new Spell("Avada", 8, "Death spell"),
                new PotionClassic());
    }


    @Override
    public String toString() {
        return "Wizard";
    }
}
