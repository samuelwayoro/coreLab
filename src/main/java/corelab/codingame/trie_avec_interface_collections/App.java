package corelab.codingame.trie_avec_interface_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		List<String> langages = new ArrayList<>();
		langages.add("visual basic");
		langages.add("c");
		langages.add("python");
		langages.add("java");
		langages.add("c++");

		List<Integer> nombres = new ArrayList<>();
		nombres.add(1);
		nombres.add(-100);
		nombres.add(18);
		nombres.add(5);
		nombres.add(-1);
		nombres.add(3);

		Collections.sort(nombres, new Comparator<>() {
			@Override
			public int compare(Integer n1, Integer n2) {
				return n1.compareTo(n2);
			}
		});
		System.out.println("affichage de la liste des nombres ...");
		nombres.forEach(System.out::println);

		// utilisation de l'interface comparator pour la comparaison de donnees
		/*
		 * Collections.sort(langages, new Comparator<String>() {
		 * 
		 * @Override public int compare(String o1, String o2) { return
		 * o1.compareToIgnoreCase(o2); } });
		 */
		/*
		 * langages.sort(new Comparator<String>() {
		 * 
		 * @Override public int compare(String o1, String o2) { return
		 * o1.compareToIgnoreCase(o2); } });
		 */

		langages.sort((s1, s2) -> {
			return s1.compareToIgnoreCase(s2);
		});

		System.out.println("**********affichage de la liste des string ...**********");
		// utilisation d'inférence de méthode
		langages.forEach(System.out::println);

	}
}
