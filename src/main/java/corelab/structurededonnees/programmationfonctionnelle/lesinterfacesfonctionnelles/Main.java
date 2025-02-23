package corelab.structurededonnees.programmationfonctionnelle.lesinterfacesfonctionnelles;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		testMethodOne();//affichera le nombre 33 est pair : false
		
		exempleStreamAvecInterfaceFonctionnelle();//affichera Alice Alain

	}

	static void testMethodOne() {
		/**
		 * L'utilisation d'une interface fonctionnelle respecte ces trois étapes : 
		 * 
		 * 1- DEFINITION :
		 *  la définition de cette interface fonctionnelle : étape au cours de laquelle le dev écrit une interface 
		 *  portant ou non l'annotation @FontionnalInterface et comportant obligatoirement une et une seule méthode abstraite
		 *  et/ou non des méthodes statiques et par défaut.
		 * 
		 * 2- INSTANCIATION :
		 *    L'instanciation de cette interface fonctionnelle : l'utilisation de l'interface fonctionnelle définie plus haut
		 * 	  à partir d'une instanciation de celle-ci. Il s'agit de l'instancier comme on le ferait avec un objet de classe
		 * 	  MAIS EN PRENANT SOINS D'IMPLEMENTER SA METHODE ABSTRAITE : lui donner une logique.
		 * 
		 * 3- L'UTILISATION : il s'agit d'utiliser cette instance de l'interface fonctionnelle en faisant un appel à sa methode
		 * 	  autrefois abstraite que nous avons implémenté.
		 */

		VerificateurPair verificateurPair = n -> n % 2 == 0;

		/**
		 * ETAPE 2 : appel de la méthode static
		 * à partir de l'instance de l'interface fonctionnelle
		 **/
		int testNombre = 33;
		System.out.println("le nombre " + testNombre + " est pair : " + verificateurPair.estPair(testNombre));
	}
	
	static void exempleStreamAvecInterfaceFonctionnelle() {
		/***
		 * exemple demo d'utilisation d'interface fonctionnelles sur un stream .
		 * Dans cet exemple : un Predicat est utilisé pour un filtre et un Consumer pour l'affichage dans la console.
		 */
		List<String> names = Arrays.asList("Eline","Alice","Clara","Alain");
		names.stream().filter(n->n.startsWith("A")).forEach(System.out::println);
	}

}
