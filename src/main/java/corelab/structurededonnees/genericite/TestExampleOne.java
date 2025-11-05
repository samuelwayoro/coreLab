package corelab.structures_de_donnees.genericite;

public class TestExampleOne {

	public static void main(String[] args) {

		// utilisation de la classe generique Container

		// instantiation avec le type Integer
		ExempleOne<Integer> cInt = new ExempleOne<>(3);
		// instantiation avec un type String
		ExempleOne<String> cString = new ExempleOne<>("Titi");

		System.out.println("avant :" + cInt.lire() + " et " + cString.lire());
		cInt.affecter(7);
		cString.affecter("Rominet");
		System.out.println("après :" + cInt.lire() + " et " + cString.lire());

	}

}
