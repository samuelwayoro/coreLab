package corelab.structurededonnees.programmationfonctionnelle.lesreferencesdemethode.referencedemethodestatique;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/****
 * EXEMPLE D'UTILISATION D'UNE  
 * REFERENCE DE METHODE STATIQUES
 * 
 * NomClasse::nomMethode
 *
 */

public class Main {

	public static void main(String[] args) {
		
		testMethod();
	}
	
	static void testMethod() {
		//Conversion en Entier (Integer) de données String
		//à partir de la méthode statique de la classes Integer :
		
		List<String> numberAsString = Arrays.asList("1","2","3");		
		List<Integer> numberAsInteger = numberAsString.stream().map(Integer::parseInt).collect(Collectors.toList()); 
		System.out.println(numberAsInteger);
	}

}
