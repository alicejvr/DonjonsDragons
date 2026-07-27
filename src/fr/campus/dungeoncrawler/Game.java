package fr.campus.dungeoncrawler;

import fr.campus.dungeoncrawler.Character.Enemy.Dragon;
import fr.campus.dungeoncrawler.Character.Player.Warrior;
import fr.campus.dungeoncrawler.Character.Player.Wizard;
import fr.campus.dungeoncrawler.Character.Character;
import fr.campus.dungeoncrawler.Equipment.Defensive.DefensiveEquipment;
import fr.campus.dungeoncrawler.Equipment.Defensive.Shield;
import fr.campus.dungeoncrawler.Equipment.Offensive.Fireball;
import fr.campus.dungeoncrawler.Exceptions.OutOfBoardException;
import fr.campus.dungeoncrawler.Items.Dice;
import fr.campus.dungeoncrawler.Items.Board;


public class Game {
    Menu menu = new Menu();

    public void start() throws OutOfBoardException {

        String playerInputIntro = menu.askPlayerString("\n\n+--------------+ Bienvenue sur Dungeon Crawler ! +--------------+\n\nFaites votre choix :\n1 = Créer un nouveau personnage\n2 = Quitter le jeu");
        if (playerInputIntro.equals("1")) {
            characterMenu();
        } else {
            System.exit(1);
        }
    }

    // menu d'introduction pour choisir son personnage (Warrior/Wizard), le nommer, modifier ses infos et lancer une partie
    public void characterMenu() throws OutOfBoardException {
        Character playerChoice;

        String playerInputType = menu.askPlayerString("\nChoisissez :\n1 = Wizard\n2 = Warrior\n[ Vous pouvez quitter le jeu à tout moment en tapant Q ]");

        String playerName = menu.askPlayerString("\nNommez votre personnage :");
        if (playerInputType.equals("1")) {
            playerChoice = new Wizard(playerName);
        } else {
            playerChoice = new Warrior(playerName);
        }

        String playerCharacterInfo = menu.askPlayerString("\n1 = Afficher les infos de " + playerName + "\n2 = Modifier les infos de " + playerName);
        if (playerCharacterInfo.equals("1")) {
            System.out.println(playerChoice);
        } else {
            String playerModif = menu.askPlayerString("Vous souhaitez modifier :\n1. Son niveau d'attaque\n2. Son niveau de vie");
            if (playerModif.equals("1")) {
                menu.askPlayerString("Entrez le nouveau niveau d'attaque de " + playerName + " :");
            } else {
                menu.askPlayerString("Entrez le nouveau niveau de vie de " + playerName + " :");
            }
        }
        String playerStart = menu.askPlayerString("\nTapez 'go' pour lancer votre partie !");
        if (playerStart.equalsIgnoreCase("Go")) {   // si le player tape go ça lance le jeu
            try {
                playTurn();
            } catch (OutOfBoardException e) {
                System.out.println("Erreur");
            }
            playTurn();

        }
    }

    // mécanique du jeu : le joueur démarre à la case 0 et parcourt les cases du plateau
    public void playTurn() throws OutOfBoardException {

        Board board = new Board();
        int playerPosition = 0;      // on initialise la position du player à la case 0
        System.out.println("\nPosition initiale du joueur : case " + playerPosition);

        while (playerPosition <= board.getBoard().size()) {     // tant que la position du joueur est inférieure ou égale à la taille du board,

            Dice dice = new Dice();         // on crée un dé
            menu.askPlayerRollDice();       // on demande au player de lancer le dé

            playerPosition = playerPosition + dice.rollDice();  // la position du joueur avance en fonction du return de rollDice

            if (playerPosition >= board.getBoard().size()) {            // mais si la position dépasse 64

                playerPosition = board.getBoard().size();              // alors la position vaut 64

                System.out.println("Le joueur est sur la case " + playerPosition + "\nContenu de la case : " + board.getBoard().get(playerPosition - 1).getCellContent() + "\n\n+--------------+ Gagné ! Fin de partie ! +--------------+\n");
                String playerEndGame = menu.askPlayerString("Choisissez :\n1 = Quitter le jeu\n2 = Recommencer une partie");
                if (playerEndGame.equals("1")) {
                    System.out.println("Vous avez quitté le jeu.");
                    System.exit(1);     // on quitte le jeu
                } else {            // le joueur veut recommencer une partie
                    playerPosition = 0;         // donc on initialiste de nouveau sa position à 0
                    start();                  // et on relance le menu Welcome
                }
                throw new OutOfBoardException("Erreur");
            }

            System.out.println("Le joueur est sur la case " + playerPosition);
            System.out.println("Contenu de la case : " + board.getBoard().get(playerPosition - 1).getCellContent());
        }
    }



}
