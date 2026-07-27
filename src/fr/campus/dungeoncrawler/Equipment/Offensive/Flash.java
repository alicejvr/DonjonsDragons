package fr.campus.dungeoncrawler.Equipment.Offensive;

public class Flash extends OffensiveEquipment {


    // Constructor
    public Flash(String name, int attack, String type) {
        super(name, attack, type);
    }

    @Override
    public String toString() {
        return "Flash";
    }
}
