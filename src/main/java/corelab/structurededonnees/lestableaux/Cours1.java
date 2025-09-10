package corelab.structurededonnees.lestableaux;

public class Cours1 {

	public static void main(String[] args) {
		/***
		 * Structure de données utilisée pour stocker des valeurs de même type. Ils ont
		 * une dimension donnée lors de l'initialisation entre le signe [], et se
		 * déclarent en respectant cette syntaxe : type[] nomVariable = new type [dimension];
		 * 
		 * NB : le tableau est constitué de cellules numérotées (indice) de 0 à la
		 * dimension -1 ;
		 */

		// exemple : déclaration d'un tableau d'entier de dimension 3 (indicé de 0 à 2)
		int[] intTab = new int[3];

		// initialisation de ce tableau déclaré :
		intTab[0] = 6;

		// ATTENTION : la réinitialisation d'un tableau entrainne l'écrasement de ses
		// anciennes valeurs de sa première déclaration

		intTab = new int[1]; // le tableau intTab est a présent un tableau de dimension 1

		/**************************************************************************************************/

		// il es aussi possible de déclarer un tableau contenant des objets , ou des
		// références vers des objets :

		// déclaration d'un tableau de StringBuffer de dimension 5 (c'est-à-dire pouvant stocker
		// 5 references d'objets de type StringBuffer)
		StringBuffer[] stringBuffTab = new StringBuffer[5];

		// initialisation a l'aide d'une petite boucle for (INITIALISATION OBLIGATOIRE
		// CAR CE TABLEAU EST SENSE STOCKER DES REFERENCES D'OBJETS QUI SONT
		// ACTUELLEMENT NULL)
		for (int i = 0; i < stringBuffTab.length; i++) {
			stringBuffTab[i] = new StringBuffer();
		}

	}

}
