package coreLab.core.genericite;

public class TestContainer {

	public static void main(String[] args) {

		// utilisation de la classe generique Container

		// instantiation avec le type Integer
		Container<Integer> cInt = new Container<Integer>(3);
		// instantiation avec un type String
		Container<String> cString = new Container<String>("Titi");

		System.out.println("avant :" + cInt.lire() + " et " + cString.lire());
		cInt.affecter(7);
		cString.affecter("Rominet");
		System.out.println("après :" + cInt.lire() + " et " + cString.lire());

	}

}
