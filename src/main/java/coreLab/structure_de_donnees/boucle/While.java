package coreLab.structure_de_donnees.boucle;

public class While {

	public static void main(String[] args) {
		/*
		 * la boucle while() équivaut à la boucle tant que () en algo ... elle permet
		 * d'effectuer un nombre précis d'instruction conditionné par le conteneur d'une
		 * variable conteur
		 * 
		 * syntaxe :
		 * 
		 * 
		 * initialisation compteur ou structure de données objet;
		 * 
		 * 
		 * while (condition sur compteur/objet est vrai) {
		 * 
		 * //instruction executée ...
		 * 
		 * //incrémentation ou décrémentation du compteur ...
		 * 
		 * }
		 * 
		 */

		testWhile();

	}

	public static void testWhile() {
		int j = 5;
		while (j >= 1) {
			System.out.println("le compteur j est supérieur a 1 , sa valeur est  " + j);
			j--; // attention a cette instruction ... si pas correcte on obtient un boucle
					// infinie
		}
	}

}
