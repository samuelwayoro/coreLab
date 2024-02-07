package coreLab.core.lescollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestCollection {

	public static void main(String[] args) {
		
		/***
		 * il existe trois classes appartenant à la famille des 
		 * collections , ce sont : les List<E> , les Queue<E>,les Set<E>
		 * Elles servent à traiter une quantité de données le plus simplement possible 
		 * par rapport au tableau .
		 * */
		
		//testList() function test 
		//testList();
		
		//testSet() function test 
		testSet(); //affichera 2 car ne conmptera pas la valeur en double "Sam"

	}
	
	static void testList() {
		/**
		 * les objets de type list peuvent stocker des données d'un type bien donné
		 * et même des valeurs en double et Null. 
		 */
		List<String> maListe = new ArrayList<>();
		maListe.add("Samuel");
		maListe.add("Wayoro");
		maListe.add("Samuel");
		maListe.add("");
		maListe.add(null);
		
		//parcours :
		 maListe.forEach(m->System.out.println(m));
		
	
	}
	
	static void testSet() {
		/**
		 * les sets stockent eux aussi des données d'un type données , mais contrairement aux listes 
		 * ne peuvent pas stocker des valeurs en double 
		 */
		Set<String> monSet = new HashSet<>();
		monSet.add("Sam");
		monSet.add("Dobré");
		monSet.add("Sam");
		System.out.println(monSet.size());
	}

}
