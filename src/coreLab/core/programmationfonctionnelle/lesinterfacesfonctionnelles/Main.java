package coreLab.core.programmationfonctionnelle.lesinterfacesfonctionnelles;

public class Main {

	public static void main(String[] args) {
		
		testMethodOne();

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

}
