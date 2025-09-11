package corelab.codingame.jeudemorpion;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    /***
     * le jeu consiste à remplir le damier par les signes 'x' pour le joueur 1 et 'o' pour le joueur 2.
     * Chaque joueur a droit à un tour de jeu pour la saisie de son signe.
     * Le gagnant est le premier à remplir en premier :
     *** les cellules dans le sens des diagonales allant de droite ou de gauche ou
     *** toutes les cellules d'une même ligne
     *** toutes les cellules d'une même colonne.
     *
     * @param args
     */

    public static void main(String[] args) throws MorpionException {

        //instanciation du jeu pour l'exécuter
        var game = new Morpion();
        var player = Player.FIRST;
        final var players = initPlayers();

        //afficher le jeu (les cellules à remplir)
        logger.info("{}", game);

        //lancer une boucle infinie qui est le cœur du programme : permet d'exécuter les parties du jeu
        while (true) {

            //Demander le numéro de cellule que le joueur voudtrais remplir
            logger.info("{} / saisissez un nombre entre 1 à 9 : ", players.get(player));

            try {
                //je récupère la saisie du joueur et je la vérifie (elle doit être compris entre 1 et 9 et ne doit pas être une lettre)
                final Integer playerInput;
                playerInput = scanInput();
                game.processInput(player, playerInput);

                //j'affiche l'état du jeu en cours
                logger.info("{}", game);

                //verification de victoire du joueur en cours
                if (game.winCheck()) {

                    logger.info("{}", game);
                    //afficher un message de victoire
                    logger.info("*** BRAVO JOUEUR {} - VOUS AVEZ GAGNER LA PARTIE ", players.get(player));
                    //mettre une fin au jeu en sortant de la boucle infinie
                    break;
                }

                //vérification de match null
                if (game.checkDraw()) {
                    logger.info("{}", game);
                    logger.info("--- MATCH NULL / AUCUN GAGNANT ---");
                    break;
                }

                //si pas de victoire et de match null alors passe le tour au joueur suivant
                player = nextPlayer(player);
            } catch (MorpionException e) {
                logger.info("seul un nombre compris entre 1 et 9 peut être rempli");
            } catch (NumberFormatException e) {
                logger.info("Attention vous ne devez pas saisir de lettre !!!");
            }


        }


    }

    /**
     * Permet de vérifier la saisie des joueurs
     * lève une exception si ceux-ci entre des chiffres non conformes ou des lettres.
     *
     * @return
     * @throws MorpionException
     */
    private static Integer scanInput() throws MorpionException {
        System.out.println("int scaninput");
        final var scanner = new Scanner(System.in);
        final var input = scanner.nextLine();
        if (input.equals("exit") || input.equals("quit")) {
            logger.info("vous quittez la partie");
            System.exit(0);
        }
        final var inputInt = Integer.parseInt(input);
        if (inputInt < 0 || inputInt > 10)
            throw new MorpionException();
        return inputInt;
    }


    /***
     * permet d'initialiser les joueurs : donné un nom à chaque joueur.
     * @return
     */
    private static HashMap<Player, String> initPlayers() {
        var players = new HashMap<Player, String>();
        final var scanner = new Scanner(System.in);

        do {
            logger.info("Nom du joueur 1 ");
            players.put(Player.FIRST, scanner.nextLine());
        } while (players.get(Player.FIRST).equals(StringConstants.BLANK));

        do {
            logger.info("Nom du joueur 2");
            players.put(Player.SECOND, scanner.nextLine());
        } while (players.get(Player.SECOND).equals(StringConstants.BLANK));

        return players;
    }

    /**
     * Passe d'un joueur à un autre pendant la partie de jeu.
     *
     * @param player
     * @return
     */
    private static Player nextPlayer(Player player) {
        if (player.equals(Player.FIRST))
            return Player.SECOND;
        else
            return Player.FIRST;
    }
}
