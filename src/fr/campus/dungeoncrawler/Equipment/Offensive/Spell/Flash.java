package fr.campus.dungeoncrawler.Equipment.Offensive.Spell;

import fr.campus.dungeoncrawler.Equipment.Offensive.OffensiveEquipment;

public class Flash extends OffensiveEquipment {


    public Flash() {
        super("éclair", 2, "Increase Wizard attackLevel");
    }

    @Override
    public String toString() {
        return "éclair";
    }
}
