package fr.campus.dungeoncrawler.Equipment.Defensive;

public class Shield extends DefensiveEquipment {


    public Shield(String name,  int points, String type) {
        super(name, points, type);
    }


    @Override
    public String toString() {
        return "Bouclier";
    }
}
