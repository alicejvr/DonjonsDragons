package fr.campus.dungeoncrawler.Character;

import fr.campus.dungeoncrawler.Equipment.OffensiveEquipment;

public abstract class Character {
    private String type = "Settler";                            // warrior ou wizard
    private String name = "Jean Bono";
    private int attackLevel = 1;
    private int lifeLevel = 2;
    private OffensiveEquipment offensiveEquipment = new OffensiveEquipment("Bâton", 2, "weapon");


// Constructors

    protected Character(String type, String name, int attackLevel, int lifeLevel, OffensiveEquipment offensiveEquipment){
        this.type = type; // this.name = attribut de l'objet, vide tant qu'on a pas créé l'objet
        // name = paramètre du constructeur
        this.name = name;
        this.attackLevel = attackLevel;
        this.lifeLevel = lifeLevel;
        this.offensiveEquipment = offensiveEquipment;
    }


//  Actions


// Getters

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getAttackLevel() {
        return attackLevel;
    }

    public int getLifeLevel() {
        return lifeLevel;
    }

    public OffensiveEquipment getOffensiveEquipment() {
        return offensiveEquipment;
    }

    // Setters
    public void setType(String newType) {
        this.type = newType;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAttackLevel(int newAttackLevel) {
        this.attackLevel = newAttackLevel;
    }

    public void setLifeLevel(int newLifeLevel) {
        this.lifeLevel = newLifeLevel;
    }

    public void setOffensiveEquipment(OffensiveEquipment offensiveEquipment) {
        this.offensiveEquipment = offensiveEquipment;
    }

// Méthode toString


    @Override
    public String toString() {
        return "Character {\n" +
                "type='" + type + '\'' +
                ",\n name = '" + name + '\'' +
                ",\n attackLevel = " + attackLevel +
                ",\n lifeLevel = "  + lifeLevel +
                ",\n offensiveEquipment = " + offensiveEquipment +
                "\n}";
    }
}