package coreLab.structure_de_donnees.programmationfonctionnelle.lesinterfacesfonctionnelles.function.bifunction.binaryoperator;

import java.util.function.BinaryOperator;

public class MainBinaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		concatenationDeChaines("Hello", "world");
		
		add(15,20);
	}
	
	/**
	 * concatener deux chaines de caractères à
	 * l'aide d'un BinaryOperator<String>
	 * @param s1
	 * @param s2
	 */
	static void concatenationDeChaines(String s1 , String s2) {
		BinaryOperator<String> concat = (x1,x2)->x1+x2;
		System.out.println(" "+s1+" + "+s2+" = "+concat.apply(s1, s2));
	}
	
	/**
	 * retourner la somme de deux entiers 
	 * pris en paramètres 
	 * @param i1
	 * @param i2
	 */
	static void add(Integer i1 , Integer i2) {
		BinaryOperator<Integer> somme = (x1,x2)->x1+x2;
		System.out.println(" "+i1+"+"+i2+" = "+somme.apply(i1, i2));
	}

}
