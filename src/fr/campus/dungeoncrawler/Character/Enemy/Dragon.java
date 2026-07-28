package fr.campus.dungeoncrawler.Character.Enemy;

import fr.campus.dungeoncrawler.Character.Character;
import fr.campus.dungeoncrawler.Equipment.Defensive.PotionClassic;
import fr.campus.dungeoncrawler.Equipment.Offensive.Spell.Fireball;


public class Dragon extends Character {

    public Dragon(String name) {
        super("Dragon", name, 4, 15, 15,
                new Fireball(),
                new PotionClassic());
    }

    @Override
    public String toString() {
        return "dragon";
    }
}
