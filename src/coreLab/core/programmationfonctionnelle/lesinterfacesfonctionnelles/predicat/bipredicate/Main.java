package coreLab.core.programmationfonctionnelle.lesinterfacesfonctionnelles.predicat.bipredicate;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		testPredicate(1);
		
		testBiPredicate("Bonjour", "on");
		
		String prenom = "Blaise";
		testBiPredicate(prenom, "Samuel");
	}
	
	/**
	 * verifi si un nombre est paire 
	 * a l'aide d'un Predicate
	 * @param i
	 */
	static void testPredicate(Integer i) {
		Predicate<Integer> estPaire = x -> x%2 == 0;
		
		System.out.println("resultat de testPredicate : "+estPaire.test(i));
	}
	
	/**
	 * verifi si a contient b a l'aide d'un BiPredicate
	 * @param a
	 * @param b
	 */
	static void testBiPredicate(String a , String b) {
		BiPredicate<String, String> bp1 = (String s1 , String s2) -> s1.contains(s2);
		System.out.println("resulat de testBipredicate : "+bp1.test(a, b));
	}

}
