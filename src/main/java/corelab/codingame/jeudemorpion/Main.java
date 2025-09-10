package corelab.codingame.jeudemorpion;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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

    public static void main(String[] args) {

        //utiliser la classe Scanner pour la saisie des joueurs
        var scanner = new Scanner(System.in);

        //instanciation du jeu pour l'exécuter
        var game = new Morpion();

        var player = Player.FIRST;

        //lancer une boucle infinie qui est le cœur du programme : permet d'exécuter les parties du jeu
        while (true) {

            //afficher le jeu (les cellules à remplir)
            logger.info("{}", game);

            //Demander le numéro de cellule que le joueur voudtrais remplir
            logger.info("{} / saisissez un nombre entre 1 à 9 : ", player);

            //exécuter la partie du joueur en cours (la saisie du joueur en cours)
            final var inputUser = scanner.nextInt();

            game.processInput(player, inputUser);

            //verification de victoire du joueur en cours
            if (game.winCheck()) {

                logger.info("{}", game);
                //afficher un message de victoire
                logger.info("*** BRAVO JOUEUR {} - VOUS AVEZ GAGNER LA PARTIE ", player);
                //mettre une fin au jeu en sortant de la boucle infinie
                break;
            }

            if(game.checkDraw()){
                logger.info("{}",game);
                logger.info("--- MATCH NULL / AUCUN GAGNANT ---");
                break;
            }

            //passer le tour au joueur suivant
            player = nextPlayer(player);

        }


    }

    private static Player nextPlayer(Player player) {
        if (player.equals(Player.FIRST))
            return Player.SECOND;
        else
            return Player.FIRST;
    }
}
