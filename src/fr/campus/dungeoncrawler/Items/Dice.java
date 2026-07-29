
package fr.campus.dungeoncrawler.Items;

public class Dice {
    private int sides;

    // Constructors
    public Dice() {
        this.sides = 6;
    }

    // Actions :
    public int rollDice() {
        int resultDice = (int) (Math.random() * sides) + 1;
        System.out.println("Résultat du dé : " + resultDice);
        return resultDice;
    }

// Getter

    public int getDice() {
        return sides;
    }

// Setter

    public void setDice(int dice) {
        this.sides = dice;
    }


}