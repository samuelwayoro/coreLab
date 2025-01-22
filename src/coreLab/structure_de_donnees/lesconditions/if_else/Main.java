package coreLab.structure_de_donnees.lesconditions.if_else;

public class Main {

	public static void main(String[] args) {
		/*
		 * en java comme dans plusieurs autres langage de prog on utilise les conditions
		 * pour controller le flux d'information ... Cela se fait avec la structure
		 * conditionnelle if ; avec la syntaxe ci dessous :
		 * 
		 * if(expression booléenne) {
		 * 
		 * //traiement }
		 * 
		 * else { //autre traitement ...
		 * 
		 * }
		 * 
		 */

		// exemple :
		if (args.length > 3) {
			// traitement si args est de dimension > 3
		} else if (args.length == 3) {
			// traitement exécuté si le tableau args est exactement de dimension = 3
		} else {
			// traitement exécuté si le tableau args n'est ni de dimension supérieur a trois
			// ni exactement égal a trois ...
		}

		// il parait clair que cette syntax de if else est a utiliser avec parcimonie
		// car souvent trop verbeuse et difficile a maintenir...

	}

}
