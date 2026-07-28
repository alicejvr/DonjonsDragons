package fr.campus.dungeoncrawler.Equipment.Offensive.Weapon;

import fr.campus.dungeoncrawler.Equipment.Offensive.OffensiveEquipment;

public class Sword extends OffensiveEquipment {


    public Sword() {
        super("épée", 5, "Increase Warrior attackLevel");
    }

    @Override
    public String toString() {
        return "épée";
    }
}
