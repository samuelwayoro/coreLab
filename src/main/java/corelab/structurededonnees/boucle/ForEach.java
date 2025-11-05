package corelab.structures_de_donnees.boucle;

public class ForEach {

	public static void main(String[] args) {
		/*
		 * la boucle foreach est une autre forme de boucle qui se différencie de l'autre
		 * syntax for de façon plus simple avec cette syntax :
		 * 
		 * for (type variable:donnees_a_parcourir) {
		 * 
		 * 
		 * //traitement ....
		 * 
		 * 
		 * }
		 * 
		 * il permet d'accéder directement a la ressource (valeur) dans la structure à
		 * parcourir à partir d'une syntax plus simple ... De plus il est plus stable
		 * car utilisable sur plusieurs type de structure de donnée en java :
		 * (List;Tableau;Map).
		 */

		String[] prenoms = { "Ange Jessica", "Jean Raphael", "Yves-Laurent", "Blaise Samuel", "Isaac Kevin" };
		for (String p : prenoms) {
			System.out.println(p);
		}
	}

}
