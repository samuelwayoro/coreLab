package coreLab.structure_de_donnees.programmationfonctionnelle.lesreferencesdemethode.referenceaunconstructeur;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Main {

	/****
	 * exemple d'utilisation de référence a un constructeur permettant de créer de nouvelle 
	 * instance de List .
	 * @param args
	 */
	public static void main(String[] args) {
		Supplier<List<String>> supplier = ArrayList::new;
		List<String> uneListeDeString = supplier.get();
	}

}
