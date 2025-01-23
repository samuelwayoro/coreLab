package coreLab.structure_de_donnees.poo.heritage;

/*
 * la surchage est un procedé en poo dont l'objectif est de réecrire une méthode
 * sous différentes forme à partir des paramètres...
 * 
 */

public class SurchageDeMethode {

	public static void main(String[] args) {

		maMethode(40);

	}

	public static void maMethode(int param) {
		System.out.println("version de la méthode prenant un entier en paramètre... = " + param);
	}

	public static void maMethode(String param) {
		System.out.println("version de la méthode prenant en paramètre un string...=" + param);
	}

	public static void maMethode(Boolean param) {
		System.out.println("version de la méthode prenant en paramètre un booléen... = " + param);
	}

}
