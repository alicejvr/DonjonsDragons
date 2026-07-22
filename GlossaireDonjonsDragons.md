# Glossaire Donjons & Dragons - Syntaxe Java

Glossaire synthétique des syntaxes Java utilisées dans mon projet DonjonsDragons. 
Généré par Vibe, puis relu, modifié et amélioré par moi-même.

---

## 📁 Structure de Base

### Package
**Définition** : Structure qui regroupe des classes liées dans une hiérarchie de dossiers. Organisee le code, évite les conflits de noms entre classes, et rend le code plus maintenable.  
*Imagine une bibliothèque où chaque rayon (package) contient des livres (classes) sur un même sujet. Ici, `fr.campus.dungeoncrawler` est comme un rayon dédié à ton jeu.*

```java
package fr.campus.dungeoncrawler;
```

---

### Import
Instruction qui permet d'utiliser des classes définies dans d'autres packages, d'accéder à des fonctionnalités externes sans avoir à écrire le chemin complet à chaque utilisation.  

```java
import fr.campus.dungeoncrawler.Character.Warrior;
import fr.campus.dungeoncrawler.Character.Wizard;
import java.util.Scanner;
```

---

### Classe
Modèle permettant de définir des objets ayant des données et des comportements.  
=> Crée des structures de données personnalisées et réutilisables.
*Une classe est comme un moule à gâteau : elle définit la forme (Game, Character...), et chaque objet est un gâteau créé à partir de ce moule.*

```java
public class Game {
    // ... contenu de la classe
}
```

---

## 📦 Programmation Orientée Objet

### Classe et Objet
Une classe est un modèle, un objet est une instance concrète de cette classe.  
Permet de créer plusieurs instances indépendantes avec leurs propres données.  
*La classe `Character` est comme une fiche type "personnage de jeu de rôle". Chaque objet (`new Warrior()`, `new Wizard()`) est une fiche remplie avec un nom, des statistiques, etc.*

```java
// Définition
public class Character { ... }

// Instanciation (Game.java:10)
Menu menu = new Menu();

// Instanciation avec paramètres (Game.java:54)
Board board = new Board();

// Instanciation dynamique (Game.java:59)
Dice dice = new Dice();
```

Dans le dernier exemple, dice est une instance de Dice, manipulée avec le **type** abstrait **Dice**.

---

### Constructeur
Méthode spéciale appelée automatiquement lors de la création d'un objet pour initialiser ses attributs.  
=> Définit l'état initial d'un objet et rend obligatoire la fourniture de certaines données.  

```java
// Constructeur avec paramètres (Character.java:15-22)
public Character(String type, String name, int attackLevel, int lifeLevel, OffensiveEquipment offensiveEquipment){
    this.type = type;
    this.name = name;
    this.attackLevel = attackLevel;
    this.lifeLevel = lifeLevel;
    this.offensiveEquipment = offensiveEquipment;
}

// Constructeur par défaut (Dice.java:18-20)
public Dice() {
    this.sides = 6;
}
```

---

### Héritage
Mécanisme qui permet à une sous-classe (ou classe dérivée) d’hériter des attributs et méthodes non-privés d’une super-classe (ou classe de base)
=> On réutilise ainsi du code commun et on crée des spécialisations. Évite la duplication de code.  
*Si `Character` est un "personnage générique", `Warrior` et `Wizard` sont des types spécifiques qui héritent des caractéristiques de base (nom, points de vie...) mais ajoutent leurs propres particularités.*

```java
// Classe parente (Character.java:5)
public class Character { ... }

// Classe fille Warrior (Warrior.java:5)
public class Warrior extends Character {
    public Warrior(String name) {
        super("Warrior", name, 5, 10, new OffensiveEquipment("Dague", 2, "Weapon"));
    }
}

// Classe fille Wizard (Wizard.java:5)
public class Wizard extends Character {
    public Wizard(String name) {
        super("Wizard", name, 8, 6, new OffensiveEquipment("Bâton", 3, "Weapon"));
    }
}
```
**Hiérarchie logique** : Modéliser des relations "est-un" (ex: un Chien est un Animal).

---

### super()
Mot-clé qui permet d'appeler le constructeur ou les méthodes de la classe parente.  
=> Initialise la partie héritée de l'objet avant d'ajouter les spécificités de la classe fille.  
*Quand tu crées un `Warrior`, `super()` c'est comme dire "D'abord, fais de moi un Character basique, puis ajoute mes caractéristiques de guerrier".*

```java
// Warrior.java:9
super("Warrior", name, 5, 10, new OffensiveEquipment("Dague", 2, "Weapon"));

// Wizard.java:9
super("Wizard", name, 8, 6, new OffensiveEquipment("Bâton", 3, "Weapon"));
```

---

### this
Fait référence à l'objet courant (l'instance actuelle de la classe).  
=> Permet de distinguer les attributs de l'objet des paramètres de méthode qui ont le même nom.  
*Imagine que tu dis "mon nom" (`this.name`) pour parler de ton propre nom, par opposition à "le nom qu'on me donne" (`name`, le paramètre). `this` c'est comme dire "moi-même".*

```java
// Dans un constructeur (Character.java:16-17)
this.type = type;  // this.type = attribut de l'objet
// name = paramètre du constructeur
this.name = name;

// Dans une méthode (Menu.java:13)
String input = this.scanner.nextLine();
```

---

### Attributs/Champs
Variables qui stockent les données d'un objet. Chaque objet a sa propre copie de ces variables.  
Utilité : conserver l'état d'un objet entre les appels de méthode.  
*Les attributs sont comme les caractéristiques d'une fiche de personnage : `name`, `attackLevel`, `lifeLevel` sont les informations qui décrivent ton personnage.*

```java
// Déclaration avec initialisation (Character.java:6-10)
private String type = "Settler";
private String name = "Jean Bono";
private int attackLevel = 1;
private int lifeLevel = 2;
private OffensiveEquipment offensiveEquipment = new OffensiveEquipment("Bâton", 2, "weapon");

// Déclaration sans initialisation (Dice.java:5)
private int sides;

// Déclaration avec initialisation (DefensiveEquipment.java:4-5)
private String name = "rock";
private int defenseLevel = 0;
```

---

### Getters et Setters
Méthodes qui permettent respectivement de lire (get) et modifier (set) les valeurs des attributs privés.  
**Utilité** : Contrôler l'accès aux données (encapsulation) et valider les modifications.  
*Les getters sont comme demander "Quel est ton niveau d'attaque ?" et les setters comme dire "Mets ton niveau d'attaque à 10". Au lieu d'accéder directement à la donnée, on passe par ces méthodes pour plus de sécurité.*

```java
// Getter (Character.java:30-32)
public String getType() {
    return type;
}

// Setter (Character.java:51-53)
public void setType(String newType) {
    this.type = newType;
}

// Getter pour un objet complexe (Character.java:46-48)
public OffensiveEquipment getOffensiveEquipment() {
    return offensiveEquipment;
}
```

---

### @Override
Annotation qui indique qu'une méthode redéfinit (remplace) une méthode héritée de la classe parente.  
**Utilité** : Personnaliser le comportement hérité et rendre le code plus lisible en signalant explicitement la redéfinition.  
*C'est comme dire "Je prends la recette de base pour faire un gâteau, mais je la modifie à ma manière". Le compilateur vérifie que tu redéfinis bien une méthode qui existe dans la classe parente.*

```java
// Character.java:74-83
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

// OffensiveEquipment.java:48-55
@Override
public String toString() {
    return "OffensiveEquipment { " +
            "name = '" + name + '\'' +
            ", attackLevel = "  + attack +
            ", type = '" + type + '\'' +
            '}';
}
```

---

### Encapsulation
Principe de masquer les détails internes d'une classe et de contrôler l'accès via des méthodes publiques.  
**Utilité** : Protéger les données contre les modifications involontaires, permettre une validation, et faciliter la maintenance.  
**Vulgarisation** : C'est comme une boîte noire : tu peux utiliser les boutons (méthodes publiques) pour interagir avec, mais tu ne peux pas ouvrir la boîte et toucher directement les composants internes (attributs privés).

```java
// Attributs privés (Character.java:6-10)
private String type = "Settler";
private String name = "Jean Bono";

// Accès contrôlé via méthodes publiques
public String getType() { return type; }
public void setType(String newType) { this.type = newType; }
```

---

## 🔄 Contrôle de Flux

### if / else
Structure conditionnelle qui exécute différents blocs de code selon qu'une condition est vraie ou fausse.  
=> permet de prendre des décisions dans le code et exécuter différentes actions selon les situations.  
**Vulgarisation** : Comme un embranchement sur une route : "Si le feu est rouge (condition), alors arrête-toi (bloc if), sinon (else) continue".

```java
// Condition simple (Game.java:16-20)
if (playerInputIntro.equals("1")) {
    characterMenu();
} else {
    System.exit(1);
}

// Condition avec equalsIgnoreCase (Game.java:48-50)
if (playerStart.equalsIgnoreCase("Go")) {
    playGame();
}

// Condition imbriquée (Game.java:37-46)
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
```

---

### while
Boucle qui répète un bloc de code **tant** qu'une condition est vraie.  
Pour exécuter des actions répétitives sans savoir à l'avance combien de fois (ex: tour de jeu).  
*Comme un jeu de société : "Tant que tu n'as pas atteint la case 64 (condition), continue à lancer le dé et avance".*

```java
// Boucle principale du jeu (Game.java:57-78)
while (playerPosition < board.getCells()) {
    Dice dice = new Dice();
    menu.askPlayerRollDice();
    
    playerPosition = playerPosition + dice.rollDice();
    
    if (playerPosition >= board.getCells()) {
        playerPosition = board.getCells();
        System.out.println("Le joueur est sur la case "+ playerPosition +"\nFin de partie !\n");
        // ...
    }
    System.out.println("Le joueur est sur la case " + playerPosition);
}
```

---

### Opérateurs de comparaison
Opérateurs qui comparent deux valeurs et retournent un booléen (vrai/faux).  

```java
// Inférieur (Game.java:57)
while (playerPosition < board.getCells())

// Supérieur ou égal (Game.java:64)
if (playerPosition >= board.getCells())

// isEmpty() pour String (Menu.java:25)
if (input.isEmpty())
```

---

## 🎯 Méthodes

### Méthode main
**Définition** : Méthode statique spéciale qui est le point d'entrée d'exécution d'un programme Java.  
Démarre l'exécution du programme. La JVM l'appelle automatiquement au lancement.  
*C'est la porte d'entrée de ton programme. Quand tu lances ton jeu, Java commence par exécuter le code dans `main()`, comme si tu entrais dans une maison par la porte principale.*

```java
// Main.java:6-11
public static void main(String[] args){
    Game game = new Game();
    game.welcome();
}
```

---

### Méthodes d'instance
Méthodes qui appartiennent à une instance de classe (objet) et opèrent sur ses données.  
=> permet de définir les comportements des objets et manipuler leurs attributs.  
*Les méthodes sont comme les actions qu'un personnage peut faire. `welcome()` c'est l'action "accueillir le joueur", `characterMenu()` c'est "afficher le menu de création de personnage".*

```java
// Déclaration (Game.java:13-21)
public void welcome() {
    String playerInputIntro = menu.askPlayerString("----------------- Bienvenue sur Dungeon Crawler ! -----------------\n...");
    if (playerInputIntro.equals("1")) {
        characterMenu();
    } else {
        System.exit(1);
    }
}

// Appel (Main.java:7-8)
game.welcome();
```

---

### Paramètres de méthode
Les paramètres sont les entrées qu'on déclare entre les parenthèses de la méthode pour que la même méthode puisse travailler sur des valeurs différentes à chaque appel.

*Les paramètres sont comme les ingrédients que tu donnes à une recette. `askPlayerString(String question)` prend en paramètre la question à poser au joueur.*

```java
// Avec un paramètre String (Menu.java:10-18)
public String askPlayerString(String question) {
    System.out.println(question);
    System.out.print("> ");
    String input = this.scanner.nextLine();
    if (input.equalsIgnoreCase("Q")) {
        System.exit(1);
    }
    return input;
}

// Sans paramètre (Menu.java:21-29)
public void askPlayerRollDice() {
    System.out.println("Lancer le dé en tapant sur 'Entrée'");
    System.out.print("[ lancement du dé ]");
    String input = this.scanner.nextLine();
    if (input.isEmpty()) {
        Dice dice = new Dice();
    }
}
```

---

### Retour de valeur
Valeur renvoyée par une méthode à l'endroit où elle a été appelée, via l'instruction `return`.  
=> pour récupérer un résultat après exécution d'une méthode pour l'utiliser ailleurs.  
*C'est comme demander "Quel est ton nom ?" et recevoir la réponse. La méthode `askPlayerString()` retourne (`return`) ce que le joueur a saisi.*

```java
// Retour d'un String (Menu.java:17)
return input;

// Retour d'un int (Dice.java:9-13)
public int rollDice() {
    int resultDice = (int) (Math.random() * sides) + 1;
    System.out.println("Résultat du dé : " + resultDice);
    return resultDice;
}
```

---

### Void
Type de retour qui indique qu'une méthode ne renvoie aucune valeur. Pour déclarer des méthodes qui effectuent une action mais ne produisent pas de résultat utilisable.  
**Vulgarisation** : Une méthode `void` c'est comme une action que tu fais sans attendre de réponse : "Affiche le menu" ou "Lance le dé" - tu fais l'action, mais il n'y a rien à retourner.

```java
// Menu.java:21
public void askPlayerRollDice() { ... }

// Game.java:13
public void welcome() { ... }
```

---

## 📥 Entrées / Sorties

### Scanner
Classe qui permet de lire des données saisies par l'utilisateur via la console.  
Crée une interaction avec l'utilisateur en ligne de commande.  
*`Scanner` est comme un clavier virtuel qui attend que l'utilisateur tape quelque chose. `scanner.nextLine()` lit tout ce que l'utilisateur a tapé jusqu'à appuyer sur Entrée.*

```java
// Déclaration (Menu.java:8)
private final Scanner scanner = new Scanner(System.in);

// Lecture d'une ligne (Menu.java:13)
String input = this.scanner.nextLine();
```

---

### System.exit()
Méthode qui termine immédiatement l'exécution du programme. Permet de quitter proprement l'application.  


```java
// Game.java:19,70
System.exit(1);
```

---

## 🔢 Variables et Types

### Types primitifs
Types de données de base qui stockent directement des valeurs (pas des objets).  
Utilité : représenter des valeurs simples de manière efficace en mémoire.  

- `int` = un nombre entier (1, 5, 10, -3...) comme des points de vie ou une position
- `String` = du texte ("Warrior", "Jean Bono"...) comme un nom de personnage

```java
// int (entier)
private int playerPosition = 0;
private int attackLevel = 1;
private int lifeLevel = 2;
private int sides;

// String (chaîne de caractères)
private String type = "Settler";
private String name = "Jean Bono";
```

---

### Types de référence (reference types)
Types qui sont des classes (références vers des objets créés avec `new`).  
Utilité : Représenter des entités complexes avec des données et des comportements.  
*Un type objet est comme une fiche complète (ex: `Scanner` pour lire l'entrée utilisateur, `Character` pour un personnage). Contrairement aux primitifs, ils ont des méthodes (actions possibles).*

```java
// Scanner (Menu.java:8)
private final Scanner scanner = new Scanner(System.in);

// Classes personnalisées
private OffensiveEquipment offensiveEquipment = new OffensiveEquipment("Bâton", 2, "weapon");
Menu menu = new Menu();
```
> ### Data types are divided into two groups:  
> **Primitive data types** - includes byte, short, int, long, float, double, boolean and char  
**Non-primitive data types** - such as String, Arrays and Classes (you will learn more about these in a later chapter)

Source : https://www.w3schools.com/java/java_data_types.asp

---

### Déclaration et initialisation
La déclaration crée une variable, l'initialisation lui donne une valeur initiale.  
=> pour stocker des données et éventuellement lui donner une valeur par défaut.  


```java
// Déclaration avec initialisation (Game.java:11)
private int playerPosition = 0;

// Déclaration sans initialisation (Dice.java:5)
private int sides;

// Initialisation dans le constructeur (Dice.java:19)
this.sides = 6;
```

---

### Variables locales
Variables déclarées dans une méthode, accessibles uniquement dans cette méthode.  
=> permet de stocker temporairement des données nécessaires à l'exécution d'une méthode.  
*Une variable locale c'est comme une note que tu prends sur un bout de papier pendant une réunion : elle n'existe que pendant cette réunion (méthode) et disparaît après.*

```java
// Dans une méthode (Game.java:25)
Character playerChoice;

// Avec affectation (Game.java:27)
String playerInputType = menu.askPlayerString("Choisissez :\n1 = Wizard\n2 = Warrior...");

// Dans une boucle (Game.java:59)
Dice dice = new Dice();
```

---

## 🔤 Chaînes de Caractères

### Concaténation
Opération qui combine plusieurs chaînes de caractères en une seule. Pour construire des messages dynamiques en combinant texte statique et variables.  

```java
// Avec + (Game.java:55)
"Position initiale du joueur : case " + playerPosition

// Avec + et saut de ligne (Game.java:66)
"Le joueur est sur la case "+ playerPosition +"\nFin de partie !\n"

// Dans toString (Character.java:76-77)
"Character {\n" +
"type='" + type + '\''
```

---

### Échappement
Utilisation de caractères spéciaux (comme `\n`, `\'`) pour représenter des caractères qui ont une signification particulière.  
Permet d'inclure dans une chaîne des caractères qui ne peuvent pas être tapés directement (saut de ligne, guillemet...).  
Par exemple :
- `\n` = saut à la ligne (comme appuyer sur Entrée)
- `\'` = apostrophe ou guillemet simple dans une chaîne entre guillemets simples
- `\"` = guillemet double dans une chaîne

```java
// Saut de ligne (Game.java:15)
"----------------- Bienvenue sur Dungeon Crawler ! -----------------\nFaites votre choix :\n1 = Créer un nouveau personnage\n2 = Quitter le jeu"

// Apostrophe (Character.java:77)
"type='" + type + '\''

// Guillemet simple échappé (Character.java:77)
'\''
```

---

### Méthodes String
Méthodes fournies par la classe String pour manipuler et comparer des chaînes.  

- `equals("texte")` = vérifie si le texte est **exactement** égal (respecte la casse : "A" ≠ "a")
- `equalsIgnoreCase("texte")` = vérifie si égal **sans tenir compte** de majuscules/minuscules ("Go" = "go" = "GO")
- `isEmpty()` = vérifie si la chaîne est vide (longueur 0)

```java
// equals() - comparaison sensible à la casse (Game.java:16)
if (playerInputIntro.equals("1"))

// equalsIgnoreCase() - comparaison insensible à la casse (Game.java:48, Menu.java:14)
if (playerStart.equalsIgnoreCase("Go"))
if (input.equalsIgnoreCase("Q"))

// isEmpty() (Menu.java:25)
if (input.isEmpty())
```

---

## ➕ Opérateurs

### Opérateurs arithmétiques

| Opérateur | Rôle | Exemple |
|-----------|------|----------|
| `+` | Addition | `a + b` |
| `-` | Soustraction | `a - b` |
| `*` | Multiplication | `a * b` |
| `/` | Division | `a / b` |
| `%` | Reste de la division (modulo) | `a % b` |

```java
// Addition
playerPosition = playerPosition + dice.rollDice();

// Nombre aléatoire entre 1 et sides
(int) (Math.random() * sides) + 1;
```

### Opérateurs de comparaison

Renvoient toujours un `boolean` (`true` ou `false`).

| Opérateur | Signification | Exemple |
|-----------|---------------|----------|
| `==` | égal à | `a == b` |
| `!=` | différent de | `a != b` |
| `>` | supérieur à | `a > b` |
| `<` | inférieur à | `a < b` |
| `>=` | supérieur ou égal à | `a >= b` |
| `<=` | inférieur ou égal à | `a <= b` |

```java
if (playerPosition >= 100) {
    System.out.println("Victoire !");
}
```

### Opérateurs logiques

Permettent de combiner plusieurs conditions.

| Opérateur | Signification | Exemple |
|-----------|---------------|----------|
| `&&` | ET | `age >= 18 && hasLicense` |
| `||` | OU | `age < 18 || isStudent` |
| `!` | NON | `!gameOver` |

```java
if (playerPosition >= 100 && !gameOver) {
    gameOver = true;
}
```

### Opérateurs d'affectation

Attribuent une valeur à une variable.

| Opérateur | Équivalent |
|-----------|------------|
| `=` | `a = b` |
| `+=` | `a = a + b` |
| `-=` | `a = a - b` |
| `*=` | `a = a * b` |
| `/=` | `a = a / b` |
| `%=` | `a = a % b` |

```java
score += 10;
lives -= 1;
```

### Incrémentation / décrémentation

| Opérateur | Effet |
|-----------|-------|
| `++` | Ajoute 1 |
| `--` | Retire 1 |

```java
counter++;
lives--;
```

```java
// Addition (Game.java:62)
playerPosition = playerPosition + dice.rollDice();

// Addition avec literal (Dice.java:10)
(int) (Math.random() * sides) + 1
```
---

### Opérateurs d'affectation
Opérateurs qui assignent une valeur à une variable => pr modifier la valeur d'une variable.  
`=` signifie "deviens égal à".  

```java
// Affectation simple (Game.java:62)
playerPosition = playerPosition + dice.rollDice();

// Affectation avec valeur initiale (Game.java:72)
playerPosition = 0; // la variable playerPosition prend maintenant la valeur 0
```
---

### Cast (conversion de type)
Permet de convertir explicitement une valeur d'un type vers un autre type compatible.

```java
// Cast explicite int (Dice.java:10)
int resultDice = (int) (Math.random() * sides) + 1;
```
```java
double nombre = 3.8;
int entier = (int) nombre; // entier vaut 3
```

Ici, `(int)` supprime la partie décimale. C'est notamment utilisé avec `Math.random()`, qui renvoie un `double`, lorsqu'on souhaite obtenir un nombre entier.


---

## 🎲 Fonctions utilitaires

### Math.random()
Méthode statique de la classe Math qui retourne un nombre décimal aléatoire entre 0.0 (inclus) et 1.0 (exclus).  
 
 `Math.random()` c'est comme lancer une pièce qui peut tomber sur n'importe quel nombre entre 0 et 1. En multipliant par `sides` (6 pour un dé standard) et en ajoutant 1, tu obtiens un nombre entre 1 et 6, comme un dé.

```java
// Dice.java:10
int resultDice = (int) (Math.random() * sides) + 1;
// Cette expression renvoie un nombre entier aléatoire compris entre 1 et 6.
```
En multipliant le résultat par une valeur puis en le convertissant en entier avec (int), on obtient un entier dans une plage donnée. Par exemple, pour simuler un dé à 6 faces.

---

## 🔧 Modificateurs d'Accès

### public
Modificateur qui rend une classe, méthode ou variable accessible depuis n'importe quelle autre classe.  
Expose les fonctionnalités qui doivent être accessibles de l'extérieur.  
*`public` c'est comme mettre une porte ouverte : tout le monde peut entrer (accéder). Les classes et méthodes publiques sont la "façade" de ton programme.*

```java
public class Game { ... }
public String getType() { ... }
public void welcome() { ... }
```

---

### private
Modificateur qui restreint l'accès à la classe, méthode ou variable déclarante uniquement.  
Masque les détails d'implémentation et protéger les données contre les modifications externes non contrôlées.  
*`private` c'est comme mettre un cadenas sur une porte : seuls les membres de la classe (les méthodes de la classe) peuvent accéder à ces données. C'est un principe clé de l'encapsulation.*

```java
private int playerPosition = 0;
private String type = "Settler";
private final Scanner scanner = new Scanner(System.in);
```

---

### static
Modificateur qui indique qu'une méthode ou variable appartient à la classe elle-même, et non à ses instances.  
Crée des méthodes/variables partagées par toutes les instances d'une classe, accessibles sans créer d'objet.  
*Une méthode `static` est comme une règle du jeu qui s'applique à tous les joueurs : elle n'appartient pas à un joueur spécifique (instance), mais au jeu lui-même (classe).*

```java
public static void main(String[] args) { ... }
```

---

### final
Modificateur qui indique qu'une variable ne peut être assignée qu'une seule fois.  
Protège une variable contre les modifications accidentelles après initialisation.  
*`final` signifie "définitive". Une fois que tu as assigné une valeur à une variable `final`, tu ne peux plus la changer. C'est comme écrire au marqueur indélébile : impossible d'effacer et réécrire.*

```java
private final Scanner scanner = new Scanner(System.in);
```

---

## 📝 Syntaxe Spécifique


### new
Opérateur qui crée une nouvelle instance d'une classe en mémoire.  
Sert à instancier des objets à partir de leurs classes.  
*`new` c'est le mot magique pour créer un nouvel objet. `new Game()` = "créer un nouveau jeu", `new Dice()` = "créer un nouveau dé". Sans `new`, tu ne peux pas utiliser une classe.*

```java
// Simple (Main.java:7)
Game game = new Game();

// Avec paramètres (Warrior.java:9)
super("Warrior", name, 5, 10, new OffensiveEquipment("Dague", 2, "Weapon"));

// Imbriqué (Game.java:31)
playerChoice = new Wizard(playerName);
```

---

## 🏗️ Structure du Projet

### Hiérarchie des packages
Organisation physique et logique des fichiers source Java.  
Il faut structurer le projet de manière claire et maintenable, séparer les responsabilités.  

- `Character/` = dossier pour tout ce qui concerne les personnages
- `Equipment/` = dossier pour l'équipement
- `Items/` = dossier pour les objets du jeu (dé, plateau...)  
Chaque package regroupe des classes avec des responsabilités similaires.

```
DonjonsDragons/
├── src/
│   └── fr/
│       └── campus/
│           └── dungeoncrawler/
│               ├── Character/
│               │   ├── Character.java
│               │   ├── Warrior.java
│               │   └── Wizard.java
│               ├── Equipment/
│               │   ├── DefensiveEquipment.java
│               │   └── OffensiveEquipment.java
│               ├── Items/
│               │   ├── Board.java
│               │   └── Dice.java
│               ├── Game.java
│               ├── Main.java
│               └── Menu.java
```

---

## 💡 Bonnes Pratiques Observées

1. **Encapsulation** : Toutes les variables sont privées avec des getters/setters → Protège les données et permet un contrôle fin sur leur modification.

2. **@Override** : Utilisation systématique pour les méthodes redéfinies → Rend le code plus lisible et permet au compilateur de vérifier que la méthode existe bien dans la classe parente.

3. **Nommage** : Noms de classes en PascalCase (`Game`, `Character`), variables en camelCase (`playerPosition`, `attackLevel`) → Rend le code plus lisible et conforme aux conventions Java.

4. **Commentaires** : Présence de commentaires explicatifs → Facilite la compréhension et la maintenance du code.

5. **Organisation** : Classes groupées par domaine dans des packages → Structure claire qui reflète l'architecture du programme.

---

## 🎓 Lexique des concepts difficiles

| Concept | Explication Simple |
|---------|-------------------|
| **Classe vs Objet** | La classe est le plan, l'objet est le bâtiment construit à partir de ce plan. |
| **Héritage** | C'est le "est-un" : un Warrior **est un** Character avec des capacités supplémentaires. |
| **Encapsulation** | Cacher les détails et exposer seulement ce qui est nécessaire. |
| **Polymorphisme** | Une même méthode peut avoir un comportement différent selon l'objet qui l'appelle. |
| **Constructeur** | Méthode spéciale appelée quand tu crées un nouvel objet avec `new`. |
| **this** | "Moi-même", l'objet courant. |
| **super** | "Mon parent", la classe parente. |
| **static** | Appartient à la classe, pas à l'objet. |
| **final** | "Ne change plus", valeur immuable après initialisation. |

---


