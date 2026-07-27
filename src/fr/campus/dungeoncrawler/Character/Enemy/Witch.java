package fr.campus.dungeoncrawler.Character.Enemy;

import fr.campus.dungeoncrawler.Character.Character;
import fr.campus.dungeoncrawler.Equipment.Defensive.PotionClassic;
import fr.campus.dungeoncrawler.Equipment.Offensive.Spell;

public class Witch extends Character {

    public Witch(String name) {
        super("Sorcier", name, 5, 8, 8,
                new Spell("Petrificus", 5, "Petrification Spell"),
                new PotionClassic());
    }

    @Override
    public String toString() {
        return "Witch";
    }
}
