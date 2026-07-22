package fr.campus.dungeoncrawler;

import fr.campus.dungeoncrawler.Items.Dice;

import java.util.Scanner;

public class Menu {

    private final Scanner scanner = new Scanner(System.in);

    public String askPlayerString(String question) {
        System.out.println(question);
        System.out.print("> ");
        String input = this.scanner.nextLine();
        if (input.equalsIgnoreCase("Q")) {
            System.exit(1);
        }
        return input;
    }


    public void askPlayerRollDice() {
        System.out.println("Lancer le dé en tapant sur 'Entrée'");
        System.out.print("> ");
        String input = this.scanner.nextLine();
        if (input.isEmpty()) {
            Dice dice = new Dice();
            // int roll = dice.rollDice();
        }


    }
}


