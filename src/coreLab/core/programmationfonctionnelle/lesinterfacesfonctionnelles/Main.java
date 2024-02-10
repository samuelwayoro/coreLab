package coreLab.core.programmationfonctionnelle.lesinterfacesfonctionnelles;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		testMethodOne();//affichera le nombre 33 est pair : false
		
		exempleStreamAvecInterfaceFonctionnelle();//affichera Alice Alain

	}

	static void testMethodOne() {
		// Utilisation de l'interface fonctionnelle avec une expression lambda :

		/**
		 *  ETAPE 1 : instanciation de l'interface fonctionnelle
		 *  nb : l'instanciation doit se baser sur l'implémentation de la méthode abstraite 
		 *  de l'interface fonctionnelle en question (dans notre cas un Predicat)
		 */
		VerificateurPair verificateurPair = n -> n % 2 == 0;

		// ETAPE 2 : appel de la méthode static a partir de l'instance de l'interface
		// fonctionnelle
		int testNombre = 33;
		System.out.println("le nombre " + testNombre + " est pair : " + verificateurPair.estPair(testNombre));
	}
	
	static void exempleStreamAvecInterfaceFonctionnelle() {
		/***
		 * exemple demo d'utilisation d'interface fonctionnelles sur un stream .
		 * Dans cet exemple : un Predicat est utilisé pour un filtre et un Consumer pour l'affichage dans la console.
		 */
		List<String> names = Arrays.asList("Eline","Alice","Clara","Alain");
		names.stream().filter(n->n.startsWith("A")).forEach(n->System.out.println(n));
	}

}
