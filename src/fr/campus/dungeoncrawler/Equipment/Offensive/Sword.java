package fr.campus.dungeoncrawler.Equipment.Offensive;

public class Sword extends OffensiveEquipment {


    // Constructor

    public Sword(String name, int attack, String type) {
        super(name, attack, type);
    }

    @Override
    public String toString() {
        return "Sword";
    }
}
