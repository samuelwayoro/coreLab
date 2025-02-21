package corelab.structurededonnees.lescollections.leslistes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<String> maListe = new ArrayList<>();
		maListe.add("Samuel");
		maListe.add("Wayoro");
		maListe.add("Samuel");
		maListe.add("");
		maListe.add(null);

		LinkedList<Integer> mesInt = new LinkedList<Integer>();
		mesInt.add(1);
		mesInt.add(2);
		mesInt.add(3);
		
		
		parcoursAvecLambda(mesInt);

		// il est aussi possible de convertir une liste en tableau :
		String[] tabString = new String[maListe.size()];
		maListe.toArray(tabString);
	}

	static <T> void parcourAvecForEach(List<T> laListe) {
		for (T t : laListe) {
			System.out.println(t);
		}
	}

	static <T> void parcoursAvecBoucle(List<T> liste) {
		for (int i = 0; i < liste.size(); i++) {
			System.out.println(liste.get(i));
		}
	}

	static <E> void parcoursAvecIterateur(List<E> list) { // attention <E> pareil que <T>
		Iterator<E> ite = list.iterator();
		while (ite.hasNext()) {
			System.out.println(ite);
		}
	}

	static <T> void parcoursAvecLambda(List<T> liste) {
		liste.forEach(m -> System.out.println(m));
	}

}
