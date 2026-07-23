package fr.campus.dungeoncrawler;

import fr.campus.dungeoncrawler.Character.Warrior;
import fr.campus.dungeoncrawler.Character.Wizard;
import fr.campus.dungeoncrawler.Character.Character;
import fr.campus.dungeoncrawler.Exceptions.OutOfBoardException;
import fr.campus.dungeoncrawler.Items.Dice;
import fr.campus.dungeoncrawler.Items.Board;

public class Game {
    Menu menu = new Menu();
    private int playerPosition = 0;     // on initialise la position du player à la case 0

    public void start() {

        String playerInputIntro = menu.askPlayerString("----------------- Bienvenue sur Dungeon Crawler ! -----------------\nFaites votre choix :\n1 = Créer un nouveau personnage\n2 = Quitter le jeu");
        if (playerInputIntro.equals("1")) {
            characterMenu();
        } else {
            System.exit(1);
        }
    }

    // menu d'introduction pour choisir son personnage (Warrior/Wizard), le nommer, modifier ses infos et lancer une partie
    public void characterMenu() {
        Character playerChoice;

        String playerInputType = menu.askPlayerString("Choisissez :\n1 = Wizard\n2 = Warrior\n[ Vous pouvez quitter le jeu à tout moment en tapant Q ]");

        String playerName = menu.askPlayerString("Nommez votre personnage :");
        if (playerInputType.equals("1")) {
            playerChoice = new Wizard(playerName);
        } else {
            playerChoice = new Warrior(playerName);
        }

        String playerCharacterInfo = menu.askPlayerString("1 = Afficher les infos de " + playerName + "\n2 = Modifier les infos de " + playerName);
        if (playerCharacterInfo.equals("1")) {
            System.out.println(playerChoice.toString());
        } else {
            String playerModif = menu.askPlayerString("Vous souhaitez modifier :\n1. Son niveau d'attaque\n2. Son niveau de vie");
            if (playerModif.equals("1")) {
                menu.askPlayerString("Entrez le nouveau niveau d'attaque de " + playerName + " :");
            } else {
                menu.askPlayerString("Entrez le nouveau niveau de vie de " + playerName + " :");
            }
        }
        String playerStart = menu.askPlayerString("Tapez 'Go' pour lancer votre partie !");
        if (playerStart.equalsIgnoreCase("Go")) {   // si le player tape go ça lance le jeu
            try {
                playGame();
            } catch (OutOfBoardException e) {
                System.out.println("On sort du plateau ça va PAS !");
            }
        }
    }

    public void playGame() {
        throw new OutOfBoardException("Saisie erronee : chaine vide");
        Board board = new Board(); // on crée l'instance de Board
        System.out.println("Position initiale du joueur : case " + playerPosition);

        while (playerPosition < board.getLength()) {     // tant que la position du joueur est inférieure à 64,

            Dice dice = new Dice();
            menu.askPlayerRollDice();       // on demande au player de lancer le dé

            playerPosition = playerPosition + dice.rollDice();  // la position du joueur avance en fonction du return de rollDice

            if (playerPosition >= board.getLength() ) {        // mais si la position dépasse 64
                playerPosition = board.getLength();              // alors la position vaut 64

                System.out.println("Le joueur est sur la case "+ playerPosition +"\nFin de partie !\n");
                String playerEndGame = menu.askPlayerString("Choisissez :\n1 = Quitter le jeu\n2 = Recommencer une partie");
                if (playerEndGame.equals("1")) {
                    System.out.println("Vous avez quitté le jeu.");
                    System.exit(1);     // on quitte le jeu
                } else {            // le joueur veut recommencer une partie
                    playerPosition = 0;         // donc on initialiste de nouveau sa position à 0
                    start();                  // et on relance le menu Welcome
                }
            }

            System.out.println("Le joueur est sur la case " + playerPosition);
        }
    }

}