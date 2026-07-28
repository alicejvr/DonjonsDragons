package fr.campus.dungeoncrawler.Character.Enemy;

import fr.campus.dungeoncrawler.Character.Character;
import fr.campus.dungeoncrawler.Equipment.Defensive.PotionClassic;
import fr.campus.dungeoncrawler.Equipment.Offensive.Spell.Flash;

public class Witch extends Character {

    public Witch(String name) {
        super("sorcière", name, 5, 8, 8,
                new Flash(),
                new PotionClassic());
    }

    @Override
    public String toString() {
        return type;
    }
}
