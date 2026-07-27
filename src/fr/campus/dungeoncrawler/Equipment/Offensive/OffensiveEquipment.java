package fr.campus.dungeoncrawler.Equipment.Offensive;

public abstract class OffensiveEquipment {
    protected String name;
    protected int attack;
    protected String type;

// Constructors

    public OffensiveEquipment(String name, int attack, String type) {
        this.name = name;
        this.attack = attack;
        this.type = type;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }

    public String getType() {
        return type;
    }

// Setters

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAttack(int newAttack) {
        this.attack = newAttack;
    }

    public void setType(String newType) {
        this.type = newType;
    }



    // Méthode toString


    @Override
    public String toString() {
        return "OffensiveEquipment{" +
                "name='" + name + '\'' +
                ", attack=" + attack +
                ", type='" + type + '\'' +
                '}';
    }
}