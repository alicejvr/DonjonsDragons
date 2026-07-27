package fr.campus.dungeoncrawler.Equipment.Offensive;

public abstract class OffensiveEquipment {
    protected String name;
    protected int points;
    protected String type;

// Constructors

    public OffensiveEquipment(String name, int points, String type) {
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

    public void setAttack(int newPoints) {
        this.points = newPoints;
    }

    public void setType(String newType) {
        this.type = newType;
    }



    // Méthode toString


    @Override
    public String toString() {
        return "OffensiveEquipment{" +
                "name='" + name + '\'' +
                ", attack=" + points +
                ", type='" + type + '\'' +
                '}';
    }
}