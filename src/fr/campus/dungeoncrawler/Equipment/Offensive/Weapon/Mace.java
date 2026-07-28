package fr.campus.dungeoncrawler.Equipment.Offensive.Weapon;

import fr.campus.dungeoncrawler.Equipment.Offensive.OffensiveEquipment;

public class Mace extends OffensiveEquipment {


    public Mace() {
        super("Massue", 3, "Increase Warrior attackLevel");
    }


    @Override
    public String toString() {
        return "massue";
    }
}
