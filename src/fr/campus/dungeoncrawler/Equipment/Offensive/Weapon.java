package fr.campus.dungeoncrawler.Equipment.Offensive;

public class Weapon extends OffensiveEquipment {


    public Weapon(String name, int points, String type) {
        super(name, points, type);
    }

    @Override
    public String toString() {
        return "Arme";
    }
}
