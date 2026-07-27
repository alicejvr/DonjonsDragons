package fr.campus.dungeoncrawler.Equipment.Offensive;

public class Fireball extends OffensiveEquipment {



    // Constructor

    public Fireball(String name, int attack, String type) {
        super(name, attack, type);
    }

    @Override
    public String toString() {
        return "Fireball";
    }
}
