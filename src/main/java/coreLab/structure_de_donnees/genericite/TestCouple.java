package coreLab.structure_de_donnees.genericite;

public class TestCouple {

	public static void main(String[] args) {
		
		Couple<Integer, String> ed1 = new Couple<Integer, String>(1, "Titi");
		Couple<Integer, String> ed2 = new Couple<Integer, String>(1, "Grand-mère");
		Couple<Integer, String> ed3 = new Couple<Integer, String>(3, "Rominet");

		System.out.println("ed1 = ed2 " + TestCouple.comparateur(ed1, ed2));
		System.out.println("ed1 = ed3 " + TestCouple.comparateur(ed1, ed3));
	}

	/***
	 * la classe TestCouple expose une méthode "comparateur" qui retourne un booleén
	 * après avoir comparé deux objets de type générique . On peux remarquer ici
	 * l'emplacement des symboles de la généricité <K,V> avant le type de retour
	 * (boolean) de la méthode... il s'agit ici des types des paramètres de la
	 * méthode et non du type de retour de la méthode .
	 */
	public static <K, V> boolean comparateur(Couple<K, V> e1, Couple<K, V> e2) {
		return e1.getClef().equals(e2.getClef());
	}

}
