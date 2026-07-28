package fr.campus.dungeoncrawler.Character.Player;

import fr.campus.dungeoncrawler.Character.Character;
import fr.campus.dungeoncrawler.Equipment.Defensive.Shield;
import fr.campus.dungeoncrawler.Equipment.Offensive.Weapon.Sword;


public class Warrior extends Character {

    public Warrior(String name) {
        super("Warrior", name, 5, 10, 10,
                new Sword(),
                new Shield());
    }

    @Override
    public String toString() {
        return "        +---------------+ \n        Ton personnage est un " + type + ",\n" +
                "        il s'appelle " + name + ",\n" +
                "        il a " + attackLevel + " points d'attaque, " +
                lifePoints + " points de vie (et peut en avoir maximum " +
                maxLifePoints + ")," +
                "\n        son équipement offensif c'est un(e) " + offensiveEquipment.getName() +
                ",\n        et son équipement défensif c'est un(e) " + defensiveEquipment.getName() + "." +
                "\n        +---------------+ \n";
    }
}

