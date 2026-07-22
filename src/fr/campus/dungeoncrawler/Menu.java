package fr.campus.dungeoncrawler;

import fr.campus.dungeoncrawler.Items.Dice;
import java.util.Scanner;

public class Menu {

    private final Scanner scanner = new Scanner(System.in);

    public String askPlayerString(String question) {        // fonction qui permet d'automatiser le menu et la question posée au player
        System.out.println(question);
        System.out.print("> ");                              // indique visuellement le champ de réponse
        String input = this.scanner.nextLine();             // récupère la réponse du player qu'on stocke dans la variable input
        if (input.equalsIgnoreCase("Q")) {      // à tout moment si l'input vaut q ou Q, ça quitte le jeu
            System.exit(1);
        }
        return input;                                       // retourne l'input grâce à la variable créée plus haut
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


