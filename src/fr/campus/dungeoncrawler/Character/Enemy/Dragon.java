package fr.campus.dungeoncrawler.Character.Enemy;

import fr.campus.dungeoncrawler.Character.Character;
import fr.campus.dungeoncrawler.Equipment.Defensive.DefensiveEquipment;
import fr.campus.dungeoncrawler.Equipment.Offensive.OffensiveEquipment;

public class Dragon extends Character {
        public Dragon(String type, String name, int attackLevel, int lifePoints, int maxLifePoints, OffensiveEquipment offensiveEquipment, DefensiveEquipment defensiveEquipment) {
            super(type, name, attackLevel, lifePoints, maxLifePoints, offensiveEquipment, defensiveEquipment);
        }

    @Override
    public String toString() {
        return "Dragon";
    }
}
