package fr.campus.dungeoncrawler.Character;

import fr.campus.dungeoncrawler.Equipment.Defensive.DefensiveEquipment;
import fr.campus.dungeoncrawler.Equipment.Offensive.OffensiveEquipment;

public abstract class Character {
    protected String type;                            // warrior ou wizard
    protected String name;
    protected int attackLevel;
    protected int lifePoints;
    protected int maxLifePoints;
    protected OffensiveEquipment offensiveEquipment;
    protected DefensiveEquipment defensiveEquipment;


// Constructors


    public Character(String type, String name, int attackLevel, int lifePoints, int maxLifePoints,
       OffensiveEquipment offensiveEquipment, DefensiveEquipment defensiveEquipment ) {
        this.type = type;
        this.name = name;
        this.attackLevel = attackLevel;
        this.lifePoints = lifePoints;
        this.maxLifePoints = maxLifePoints;
        this.offensiveEquipment = offensiveEquipment;
        this.defensiveEquipment = defensiveEquipment;
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

    public int getLifePoints() {
        return lifePoints;
    }

    public int getMaxLifePoints() {
        return maxLifePoints;
    }

    public OffensiveEquipment getOffensiveEquipment() {
        return offensiveEquipment;
    }

    public DefensiveEquipment getDefensiveEquipment() {
        return defensiveEquipment;
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

    public void setLifePoints(int newLifePoints) {
        this.lifePoints = newLifePoints;
    }

    public void setMaxLifePoints(int newMaxLifePoints) {
        this.maxLifePoints = newMaxLifePoints;
    }

    public void setOffensiveEquipment(OffensiveEquipment offensiveEquipment) {
        this.offensiveEquipment = offensiveEquipment;
    }

    public void setDefensiveEquipment(DefensiveEquipment defensiveEquipment) {
        this.defensiveEquipment = defensiveEquipment;
    }

    // Méthode toString

    @Override
    public String toString() {
        return "        +---------------+ \n        Ton personnage est un " + type + ",\n" +
                "        il s'appelle " + name + ",\n" +
                "        il a " + attackLevel + " points d'attaque " +
                lifePoints + " points de vie (et peut en avoir maximum " +
                maxLifePoints + ")," +
                "\n        son équipement offensif c'est un(e) " + offensiveEquipment.getName() +
                ",\n        et son équipement défensif c'est un(e) " + defensiveEquipment.getName() + "." +
                "\n        +---------------+ \n";
    }
}