package fr.campus.dungeoncrawler.Equipment.Offensive.Spell;

import fr.campus.dungeoncrawler.Equipment.Offensive.OffensiveEquipment;

public class Fireball extends OffensiveEquipment {


    public Fireball() {
        super("boule de feu", 7, "Increase Wizard attackLevel");
    }

    @Override
    public String toString() {
        return "boule de feu";
    }
}
