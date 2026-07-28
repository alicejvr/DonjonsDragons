package fr.campus.dungeoncrawler.Equipment.Defensive;

public class PotionClassic extends DefensiveEquipment{


    public PotionClassic() {
        super("potion standard", 2, "Increase lifePoints");
    }


    @Override
    public String toString() {
        return "potion standard";
    }
}
