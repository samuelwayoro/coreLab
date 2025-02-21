package corelab.structurededonnees.programmationfonctionnelle.lesinterfacesfonctionnelles.predicat;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MainPredicat {

	public static void main(String[] args) {

		// estPaire(21);

		// nombrePremier(9);

		System.out.println(testRechercheNoms(Arrays.asList("Wayoro", "Badobré", "Blaise", "Samuel"), "Samuel"));

	}

	/**
	 * verifier si un nombre est paire avec un Predicate<Integer>
	 * 
	 * @param nombre
	 */
	static void estPaire(Integer nombre) {
		Predicate<Integer> predicate = i -> i % 2 == 0;
		System.out.println("le nombre est il paire ? " + predicate.test(nombre));
	}

	/**
	 * verifier si un nombre est un nombre PREMIER
	 * 
	 * un nombre premier est un nombre supérieur a 1 divisible uniquement par lui
	 * même et par 1 . les premiers sont ainsi : 2,3,5,7,11,13,17,19,23,29 etc..
	 * 
	 * @param i
	 */
	static void nombrePremier(Integer i) {

	}

	/**
	 * fonction anyMatch() pour vérifier si un élément de la liste satisfait à une
	 * condition donnée
	 * 
	 * @param noms
	 * @param nom
	 * @return
	 */
	static boolean testRechercheNoms(List<String> noms, String nom) {
		// noms.stream().forEach(n -> System.out.println(n.equalsIgnoreCase(nom)));
		return noms.stream().anyMatch(n -> n.equalsIgnoreCase(nom));
	}
}
