package fr.campus.dungeoncrawler.Equipment.Defensive;

public class Potion extends DefensiveEquipment {
        public Potion(String name,  int defenseLevel, String type) {
            super(name, defenseLevel, type);
        }


    @Override
    public String toString() {
        return "Potion";
    }
}
