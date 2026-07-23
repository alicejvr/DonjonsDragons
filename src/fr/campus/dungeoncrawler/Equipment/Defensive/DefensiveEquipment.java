package fr.campus.dungeoncrawler.Equipment.Defensive;

public abstract class DefensiveEquipment {
    private String name = "rock";
    private int defenseLevel = 0;
    private String type;                   // shield ou potion

// Constructors


    public DefensiveEquipment(String name) {
        this.name = name;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getDefenseLevel() {
        return defenseLevel;
    }

    public String getType() {
        return type;
    }


// Setters

    public void setName(String newName) {
        this.name = newName;
    }

    public void setDefenseLevel(int newDefenseLevel) {
        this.defenseLevel = newDefenseLevel;
    }

    public void setType(String newType) {
        this.type = newType;
    }

// Méthode toString


    @Override
    public String toString() {
        return "DefensiveEquipment{" +
                "name='" + name + '\'' +
                ", defenseLevel=" + defenseLevel +
                ", type='" + type + '\'' +
                '}';
    }
}