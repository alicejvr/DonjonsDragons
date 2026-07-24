package fr.campus.dungeoncrawler.Character;

import fr.campus.dungeoncrawler.Equipment.Defensive.DefensiveEquipment;
import fr.campus.dungeoncrawler.Equipment.Offensive.OffensiveEquipment;

public abstract class Character {
    private String type;                            // warrior ou wizard
    private String name;
    private int attackLevel;
    private int lifePoints;
    private int maxLifePoints;
    private OffensiveEquipment offensiveEquipment;
    private DefensiveEquipment defensiveEquipment;


// Constructors


    protected Character(String type, String name, int attackLevel, int lifePoints, int maxLifePoints, OffensiveEquipment offensiveEquipment) {
        this.type = type; // this.type = attribut de l'objet, vide tant qu'on a pas créé l'objet
        // type = paramètre du constructeur
        this.name = name;
        this.attackLevel = attackLevel;
        this.lifePoints = lifePoints;
        this.maxLifePoints = maxLifePoints;
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

    public int getLifePoints() {
        return lifePoints;
    }

    public OffensiveEquipment getOffensiveEquipment() {
        return offensiveEquipment;
    }

    public DefensiveEquipment getDefensiveEquipment() {
        return defensiveEquipment;
    }

    public int getMaxLifePoints() {
        return maxLifePoints;
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

    public void setOffensiveEquipment(OffensiveEquipment offensiveEquipment) {
        this.offensiveEquipment = offensiveEquipment;
    }

    public void setDefensiveEquipment(DefensiveEquipment defensiveEquipment) {
        this.defensiveEquipment = defensiveEquipment;
    }

    public void setMaxLifePoints(int newMaxLifePoints) {
        this.maxLifePoints = newMaxLifePoints;
    }

    // Méthode toString

    @Override
    public String toString() {
        return "        +---------------+ \n        Ton personnage est un " + type + ",\n" +
                "        il s'appelle " + name + ",\n" +
                "        il a " + attackLevel + " points d'attaque " +
                lifePoints + " points de vie (et peut en avoir jusqu'à " +
                maxLifePoints + ")," +
                "\n        son équpipement offensif c'est : " + offensiveEquipment +
                ",\n        et son équipement défensif c'est : " + defensiveEquipment + "." +
                "\n        +---------------+ \n";
    }
}