package fr.campus.dungeoncrawler.Equipment.Defensive;

public class PotionClassic extends DefensiveEquipment{


    // Constructor
    public PotionClassic(String name, int defense, String type) {
        super(name, defense, type);
    }


    @Override
    public String toString() {
        return "PotionClassic";
    }
}
