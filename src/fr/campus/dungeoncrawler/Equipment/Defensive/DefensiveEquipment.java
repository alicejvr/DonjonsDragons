package fr.campus.dungeoncrawler.Equipment.Defensive;

public abstract class DefensiveEquipment {
    protected String name;
    protected int points;
    protected String type;

// Constructors

    public DefensiveEquipment(String name, int points, String type) {
        this.name = name;
        this.points = points;
        this.type = type;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public String getType() {
        return type;
    }


// Setters

    public void setName(String newName) {
        this.name = newName;
    }

    public void setPoints(int newPoints) {
        this.points = newPoints;
    }

    public void setType(String newType) {
        this.type = newType;
    }

// Méthode toString


    @Override
    public String toString() {
        return "DefensiveEquipment{" +
                "name='" + name + '\'' +
                ", defense=" + points +
                ", type='" + type + '\'' +
                '}';
    }
}