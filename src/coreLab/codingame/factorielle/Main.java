package coreLab.codingame.factorielle;

import java.util.Scanner;

/**
 * ECRIRE UN ALGO QUI PERMET DE CALCULER LE FACTORIEL D'UN NOMBRE DONNEE : en
 * Math le factoriel d'un entier naturel n est le produit des nombres entiers
 * strictement positifs inférieur ou égaux à n .
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("entrer le nombre pour avoir son factorielle");
		int nombre = sc.nextInt();
		System.out.println("factorielle de " + nombre + " est  " + factorielRecursif(nombre));
		System.out.println("restultat avec le factorielle itératif  " + factorielIteratif(nombre));

	}

	/**
	 * le principe est d'utiliser la recursivité pour calculer le factoriel d'un
	 * nombre.
	 * 
	 * @param nb
	 * @return
	 */
	public static int factorielRecursif(int nb) {
		// condition d'arrêt nb = 0 : retourner 1
		if (nb == 0 || nb == 1) {
			return 1;
		} else { // sinon utiliser la meme fonction pour calculer le factorielle (en modifiant la
					// valeur prise en paramètre : incrémentation ou décrémentation)
			return (nb * factorielRecursif(nb - 1));
		}
	}

	/**
	 * prendre un nombre et calculer une multiplication successive de tous les
	 * nombres inférieure a ce nombre jusqu'a 2
	 * 
	 * @param nbre
	 * @return
	 */
	public static int factorielIteratif(int nbre) {
		int accumulateur = 1;
		for (int i = 2; i <= nbre; i++) {
			accumulateur *= i;
		}
		return accumulateur;
	}

}
