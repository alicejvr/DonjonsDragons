package fr.campus.dungeoncrawler.Equipment.Defensive;

public abstract class DefensiveEquipment {
    private String name;
    private int defense;
    private String type;                   // shield ou potion

// Constructors

    public DefensiveEquipment(String name,  int defense, String type) {
        this.name = name;
        this.defense = defense;
        this.type = type;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getDefense() {
        return defense;
    }

    public String getType() {
        return type;
    }


// Setters

    public void setName(String newName) {
        this.name = newName;
    }

    public void setDefense(int newDefense) {
        this.defense = newDefense;
    }

    public void setType(String newType) {
        this.type = newType;
    }

// Méthode toString


    @Override
    public String toString() {
        return "DefensiveEquipment{" +
                "name='" + name + '\'' +
                ", defense=" + defense +
                ", type='" + type + '\'' +
                '}';
    }
}