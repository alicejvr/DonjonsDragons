package fr.campus.dungeoncrawler.Character.Enemy;

import fr.campus.dungeoncrawler.Character.Character;
import fr.campus.dungeoncrawler.Equipment.Defensive.DefensiveEquipment;
import fr.campus.dungeoncrawler.Equipment.Defensive.PotionClassic;
import fr.campus.dungeoncrawler.Equipment.Offensive.Fireball;
import fr.campus.dungeoncrawler.Equipment.Offensive.Mace;
import fr.campus.dungeoncrawler.Equipment.Offensive.OffensiveEquipment;

public class Goblin extends Character {

    public Goblin(String name) {
        super("Goblin", name, 1, 6, 6,
                new Mace(),
                new PotionClassic());

    }

    @Override
    public String toString() {
        return "Goblin";
    }
}
