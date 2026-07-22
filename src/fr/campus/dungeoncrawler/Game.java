package fr.campus.dungeoncrawler;

// contiendra la logique interne du jeu (joueurs, avancement), ttes les mécaniques du jeu


import fr.campus.dungeoncrawler.Character.Warrior;
import fr.campus.dungeoncrawler.Character.Wizard;
import fr.campus.dungeoncrawler.Character.Character;
import fr.campus.dungeoncrawler.Items.Dice;
import fr.campus.dungeoncrawler.Items.Board;

public class Game {
    Menu menu = new Menu();
    private int playerPosition = 0;

    public void introduction() {

        String playerInputIntro = menu.askPlayerString("----------------- Bienvenue sur Dungeon Crawler ! -----------------\nFaites votre choix :\n1 = Créer un nouveau personnage\n2 = Quitter le jeu");
        if (playerInputIntro.equals("1")) {
            startIntro();
        } else {
            System.exit(1);
        }
    }

// menu d'introduction pour choisir son personnage (Warrior/Wizard), le nommer, modifier ses infos et lancer une partie
    public void startIntro() {
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
        if (playerStart.equalsIgnoreCase("Go")) {
            playGame();
        }
    }

        public void playGame() {
        Board board = new Board();
            while (playerPosition < board.getCells() +1) {

                Dice dice = new Dice();
                menu.askPlayerRollDice();
                playerPosition = playerPosition + dice.rollDice();
                System.out.println("Nouvelle position du joueur " + playerPosition);
            }
        }

    }