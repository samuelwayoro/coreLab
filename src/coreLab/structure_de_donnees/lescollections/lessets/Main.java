package coreLab.structure_de_donnees.lescollections.lessets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		Set<String> monSet = new HashSet<>();
		monSet.add("Sam");
		monSet.add("Dobré");
		monSet.add("Sam");

		// parcourirSetAvecLambda(monSet);
		// System.out.println("******");

		Set<String> leSet = new TreeSet<String>();
		leSet.add("d");
		leSet.add("x");
		leSet.add("a");
		leSet.add("c");

		// parcourirSetAvecLambda(leSet);
		// System.out.println("******");

		copierUnSetAunAutre(monSet, leSet);

		Set<Integer> unSet = new TreeSet<Integer>();
		unSet.add(15);
		unSet.add(100000);
		unSet.add(-5);
		unSet.add(0);
		unSet.add(2);
		unSet.add(1);
		unSet.add(9);
		unSet.add(-6);
		// parcourirSetAvecLambda(unSet);
		// System.out.println("******");

	}

	static <E> void parcourirSetAvecLambda(Set<E> leSet) {
		leSet.forEach(e -> System.out.println(e));
	}

	static <T> void parcourAvecForEach(Set<T> set) {
		for (T t : set) {
			System.out.println(t);
		}
	}

	static <T> void parcoursAvecBoucle(Set<T> set) {
		for (int i = 0; i < set.size(); i++) {
			// System.out.println(set.get(i));
		}
	}

	static <E> void parcoursAvecIterateur(Set<E> set) { // attention <E> pareil que <T>
		Iterator<E> ite = set.iterator();
		while (ite.hasNext()) {
			System.out.println(ite);
		}
	}

	static <T> void copierUnSetAunAutre(Set<T> setOne, Set<T> setTwo) {
		System.out.println("premier set : ");
		setOne.forEach(x -> System.out.println(x));

		System.out.println("deuxième set ");
		setTwo.forEach(c -> System.out.println(c));

		System.out.println("copie ---- ");
		setTwo.addAll(setTwo);
		System.out.println("fin de copie ----");
		setTwo.forEach(c -> System.out.println(c));

	}

}
