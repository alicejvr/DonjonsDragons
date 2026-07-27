package fr.campus.dungeoncrawler.Character.Player;

import fr.campus.dungeoncrawler.Character.Character;
import fr.campus.dungeoncrawler.Equipment.Defensive.Shield;
import fr.campus.dungeoncrawler.Equipment.Offensive.Weapon;

public class Warrior extends Character {

    public Warrior(String name) {
        super("Warrior", name, 5, 10, 10,
                new Weapon("Dague", 3, "Arme blanche"),
                new Shield("Bouclier doré", 3, "défense"));
    }


    @Override
    public String toString() {
        return "Warrior";
    }
}

