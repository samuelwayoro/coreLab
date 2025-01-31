package coreLab.structure_de_donnees.boucle;

public class For {

	public static void main(String[] args) {

		/*
		 * for (déclaration et initialisation de compteur ; condition de continiuté ;
		 * incrémentation ou décrémentation) { //instruction exécutée }
		 * 
		 * 
		 * Il s'agit d'une syntaxe en java permettant d'effectuer un nombre précis
		 * d'instructions égale a la valeur d'un compteur .
		 */

		testBoucleFor();

	}

	public static void testBoucleFor() {

		// avec for : qui permet d'effectuer une boucle à partir d'un compteur ...
		// souvent liée a la dimension de la structure de données a parcourir ...

		for (int i = 0; i < 5; i++) {
			System.out.println("--->" + i);
		}

		// attention structure utilisée pour savoir la valeur contenu dans l'indice
		// (pratique pour le debug) ...
		int x;
		for (x = 0; x < 5; x++) {
			System.out.println("--->" + x);
		}
		System.out.println("le compteur contient : " + x);

	}

}
