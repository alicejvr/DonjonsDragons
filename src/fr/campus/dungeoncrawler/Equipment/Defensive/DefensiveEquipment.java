package fr.campus.dungeoncrawler.Equipment.Defensive;

public abstract class DefensiveEquipment {
    private String name;
    private int defenseLevel;
    private String type;                   // shield ou potion

// Constructors

    public DefensiveEquipment(String name,  int defenseLevel, String type) {
        this.name = name;
        this.defenseLevel = defenseLevel;
        this.type = type;
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