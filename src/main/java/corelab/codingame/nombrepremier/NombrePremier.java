package corelab.codingame.nombrepremier;
/**
 * ECRIRE UN ALGO QUI PERMET DE VERIFIER SI UN NOMBRE EST PREMIER 
 * rappel : un nombre premier est un nombre qui a seulement deux 
 * diviseurs , lui même et 1.
 * 
 * l'objectif est donc d'écrire un algorithme qui permet de verifier 
 * si le reste de la division successive entre ce nombre une serie 
 * strictement inférieur a lui est égal a 0 .
 * 
 * -si OUI il n'est pas premier 
 * -si NON il est premier    
 * 
 */
public class NombrePremier {

	public static void main(String[] args) {
		int n = 7;
		
		if(checkNombre(n))
			System.out.println(" "+n+" est un nombre premier ");
		else 
			System.out.println(" "+n+" n'est pas un nombre premier ");
	}

	/**
	 * verifi si un nombre entré est un nombre premier en verifiant si le modulo
	 * (reste de la division entière) entre ce nombre et successivement ceux dans
	 * l'ensemble :[2;n-1] est égale a 0
	 * 
	 * @param n
	 * @return
	 */
	static boolean checkNombre(int n) {
		boolean estUnNombrePremier = true;

		for (int i = n - 1; i > 1; i--) {
			if (n % i == 0) {
				estUnNombrePremier = false;
				break;
			}
		}

		return estUnNombrePremier;
	}

}
