package coreLab.structure_de_donnees.string;

import java.util.HashSet;

public class Main {
	
	public static void main(String[]args) {
		
		/**
		 * immutabilité de la classe String et 
		 * utilisation de la méthode join pour la concaténation ...
		 */
		String[] strings = {"one","two","three"};
		String concat = String.join("", strings);
		//System.out.println(concat);
		//System.out.println(concat.hashCode());
		
		
		/***
		 * egalité entre deux objets 
		 */
		Students alex1 = new Students(1l, "Alex");
		Students alex2 = new Students(1l, "Alex");
		//System.out.println(alex1.equals(alex2));
		//System.out.println(alex1.hashCode());
		//System.out.println(alex2.hashCode());
		
		
		HashSet<Students> etudiants = new HashSet<Students>();
		etudiants.add(alex2);
		etudiants.add(alex1);
		//System.out.println(etudiants.size());
		//System.out.println(etudiants.contains(new Students(1l, "Alex")));
				
	}

}
