package corelab.codingame.jeubingo;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * JEU BINGO : ecrire un algo qui permet de rechercher un nombre saisi par
 * l'utilisateur dans un ensemble 25 nombres compris entre 0 et 100. Si le
 * nombre saisi par l'utilisateur se trouve au moins 1 fois dans l'ensemble de
 * nombre , le joueur gagne la partie (afficher : "BINGO" ) dans la sortie
 * standard , sinon le joueur perd : afficher "Game Over" .
 */
public class Main {

	private static Logger log = Logger.getLogger(Main.class.getName());

	private static Random rand;

	static {
		try {
			rand = new Random();
		} catch (Exception e) {
			log.log(Level.INFO, "Exception:{}", e.getMessage());
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		log.info("saisie le nombre que vous voulez rechercher : ");
		int n = sc.nextInt();
		bingo(n);
	}

	static void bingo(int nombreRecherche) {
		log.info("*********************DEBUT DU JEU BINGO **********************");
		ArrayList<Integer> nombres = new ArrayList<>();

		// remplir la liste : nombres avec 25 nombres tirés au hasard
		for (int i = 0; i < 25; i++) {
			// génère un nombre compris entre 0 et 100
			nombres.add(rand.nextInt(101));
		}

		int score = 0;
		for (Integer nbreEncours : nombres) {
			if (nbreEncours == nombreRecherche)
				score++;
		}

		// verif pour arrêt de la partie ou sa fin
		if (score >= 1) {
			log.info("*************BINGO , VOUS AVEZ GAGNE***********");
		} else {
			log.info("**********   GAME OVER :(   **********************");
		}
		log.info("****************** FIN DU JEU ****************************");
	}

}
