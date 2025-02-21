package corelab.structurededonnees.lescollections.model;

import java.util.*;

public class MainCollectionsTest {
	public static void main(String[] args) {

		/****
		 * utilisation d'implement de de SET
		 */
		System.out.println("*****utilisation d'implement de de SET*********");
		SortedSet<Integer> st = new TreeSet<>();
		st.add(100);
		st.add(-15);
		st.add(55);
		st.add(100);// ne vas pas ajouter 100 car n'accepte pas le doublon (treeSet = implementation
					// de SortedSet = implementation de Set)
		st.add(20);


		for (Integer i : st) {
			System.out.println(i);
		}

		/**
		 * utilisation de la classe utiliaire java :Collections pour ordonner des objets
		 * dans une collection(List, Map et autres ...)
		 */
		System.out.println("************UTILISATION DES LIST****************");
		List<Carre> listeDeCarres = new ArrayList<>();
		listeDeCarres.add(new Carre(201));
		listeDeCarres.add(new Carre(20));
		listeDeCarres.add(new Carre(101));
		listeDeCarres.add(new Carre(21));
		listeDeCarres.add(new Carre(50));

		for (Carre c : listeDeCarres) {
			System.out.println(c.getCote());
		}

		System.out.println("****suppression d'elements dans une liste, grace a itarator ********");
		// supprimer des données dans une collection : passer obligatoirement par un
		// itarator ...
		Iterator<Carre> it = listeDeCarres.iterator();
		while (it.hasNext()) {
			Carre c = it.next();
			if (c.getCote() < 100) {
				it.remove();
			}
		}
		for (Carre car : listeDeCarres) {
			System.out.println(car.getCote());
		}

		/**
		 * trie par ordre croissant des données de la liste avec la classe Collections
		 * 
		 * Collections.sort(listeDeCarres); listeDeCarres.stream().map(ca ->
		 * ca.getCote()).forEach(System.out::println);
		 */

		/**
		 * trie sur les Set : Les Set ordonne les elements contenu , naturellement par
		 * ordre croissant
		 * 
		 * Set<Carre> setDeCarre = new TreeSet<>(); setDeCarre.add(new Carre(5000));
		 * setDeCarre.add(new Carre(-5)); setDeCarre.add(new Carre(15));
		 * setDeCarre.add(new Carre(50)); setDeCarre.add(new Carre(5));
		 * 
		 * for (Carre c:setDeCarre ) { System.out.println(c.getCote()); }
		 */

		/**
		 * apprendre a trier sur une map : le trie d'ordre s'opère tjrs sur les clés de
		 * façon croissante... dans notre cas de façon croissante car la clé implémente
		 * l'interface Comparable ET que nous utilisons l'implémentation de TreeMap


		System.out.println("***********UTILISATION DES MAPS*****************");
		Map<Carre, Voiture> map = new TreeMap<>();
		map.put(new Carre(-205), new Voiture("Opel", "Rouge"));
		map.put(new Carre(100), new Voiture("Citroen", "Gris"));
		map.put(new Carre(1), new Voiture("BMW", "Vert"));
		map.put(new Carre(2023), new Voiture("Peugeot", "Violet"));

		for (Map.Entry<Carre, Voiture> myEntry : map.entrySet()) {
			System.out.println("clé:  " + myEntry.getKey().getCote() + "   valeur:" + myEntry.getValue().getMarque());
		}
		 */
	}
}
