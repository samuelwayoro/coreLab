package coreLab.core.lescollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Vector;

public class TestCollection {

	public static void main(String[] args) {
		
		/***
		 * il existe 3 classes appartenant à la famille des 
		 * collections , ce sont : les List<E> , les Queue<E>,les Set<E>
		 * Elles servent à traiter une quantité de données le plus simplement possible 
		 * par rapport au tableau .
		 * */
		
		//testList() function test 
		//testList();
		 
		//testSet(); //affichera 2 car ne conmptera pas la valeur en double "Sam"
		
		testQueue();

	}
	
	static void testList() {
		/**
		 * les classes qui implémentent l'interface List<E> peuvent stocker des données 
		 * d'un type bien donné
		 * et même des valeurs en double et Null. Ils ne sont pas Thread-safe .
		 * Les deux implémentations les plus répendus sont : 
		 * 
		 * - les LinkedList<E> : Se base sur le concept de liste individuellement ou doublement liée.
		 * 						A utiliser de préference pour les actions d'insertion/suppresion 
		 * 
		 * - les ArrayList<E> : se base sur le concept de tableau redimensionnable dynamiquement .A utiliser 
		 * 						de préférence pour les parcours , accès directe et manipulations courantes ...
		 */
		List<String> maListe = new ArrayList<>();
		maListe.add("Samuel");
		maListe.add("Wayoro");
		maListe.add("Samuel");
		maListe.add("");
		maListe.add(null);
		
		//parcours :
		// maListe.forEach(m->System.out.println(m));
		 
		 LinkedList<Integer> mesInt = new LinkedList<Integer>();
		 mesInt.add(1);
		 mesInt.add(2);
		 mesInt.add(3);
		 
		 //peux être parcourus sous différentes manis :
		 //1-directement dans une boucle : 
		 for (Integer integer : mesInt) {
			//System.out.println(integer);
		}
		 
		 //2-soit suite à une recuperation dans un Iterator
		 Iterator<Integer> it = mesInt.iterator();
		 while (it.hasNext()) {
			System.out.println(it.next());
			
		}
	
	}
	
	static void testSet() {
		/**
		 * les classes de l'interface Set stockent eux aussi des données non ordonnés d'un type données ,
		 * mais contrairement aux listes ne peuvent pas stocker des valeurs en double . Ces particularités sont :
		 * - ne permet pas de contenir les doublons 
		 * - impose que l'égalité entre objet soit définie 
		 * - non ordonnée par défaut 
		 *   Cette interface comprend 3 implémentations : 
		 *   		*les Hashset : ne garde pas l'ordre d'insertion des données  
		 *   		*les LinkedHashset : garde l'ordre d'insertion des données (liste ordonées de données)
		 *   		*et les TreeSet
		 */
		
		//exemple d'utilisation d'un HashSet<> 
		Set<String> monSet = new HashSet<>();
		monSet.add("Sam");
		monSet.add("Dobré");
		monSet.add("Sam");
		System.out.println(monSet.size());
	}
	
	static void testQueue() {
		Queue<Integer> tq = new PriorityQueue<Integer>();
		tq.add(1000);
		tq.add(-1);
		tq.add(0);
		tq.add(69);
		tq.add(-900);
		tq.add(258);
		
		for (Integer integer : tq) {
			System.out.println(integer);
		}
	}
	
	

}
