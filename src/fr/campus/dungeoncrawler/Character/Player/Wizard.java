package fr.campus.dungeoncrawler.Character.Player;

import fr.campus.dungeoncrawler.Character.Character;
import fr.campus.dungeoncrawler.Equipment.Defensive.PotionClassic;
import fr.campus.dungeoncrawler.Equipment.Offensive.Spell.Flash;

public class Wizard extends Character {

    public Wizard(String name) {
        super("Wizard", name, 7, 7, 7,
                new Flash(),
                new PotionClassic());
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
