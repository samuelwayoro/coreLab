package coreLab.codingame.doublondansuntableau;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

/***
 * ECRIRE UN ALGO QUI PERMET DE RECHERCHE UN NOMBRE QUI SERAIT EN DOUBLE DANS UN
 * TABLEAU
 */
public class Main {

	public static void main(String[] args) {

		Integer[] tableau = new Integer[] { 15, 22, 55, 986, 99, 10, 45, 75, 96, 53, 1 };

		System.out.println(" -verif avec rechercherDoublonAvecStream le tableau contient un nombre en double ?   "
				+ rechercherDoublonAvecStream(tableau));

		System.out.println(" -verif avec rechercherDoublonAvecUnSet ; le tableau contient un nombre en double ?  "
				+ rechercherDoublonAvecUnSet(tableau));

	}

	/**
	 * En java 8 nous pouvons utiliser les flux pour compter les éléments distincts
	 * présents dans un Array . si le nombre distinct n'est pas le même que la
	 * longeur du array , le array contient alors un doublon .
	 * 
	 * @param <T>
	 * @param tab
	 * @return
	 */
	static boolean rechercherDoublonAvecStream(Integer[] tab) {

		// recup le nombre total de données distinct dans le tableau
		Long distinctCount = Stream.of(tab).distinct().count();

		// comparer ce nombre au
		System.out.println("taille du tableau : " + tab.length + "  nombre de données distinct  "
				+ Long.valueOf(distinctCount).intValue());
		return tab.length != distinctCount;

	}

	static boolean rechercherDoublonAvecUnSet(Integer[] tab) {

		// creée un ensemble vide
		Set<Integer> set = new HashSet<>();

		// parcourir les elements du tableau pour remplir progressivement le set
		for (Integer i : tab) {

			// si l'element en cours est déjà dans le set arreté la boucle
			if (set.contains(i))
				return true;

			if (i != null)
				set.add(i);
		}

		// retourné faux si aucun element recherché n'a été trouvé dans le set
		return false;
	}

}
