package corelab.structurededonnees.convertions;

/***
 * permet de demontrer que la convertion d'un type objet String en un autre type
 * objet ou primaire donné il faut passer par la methode :
 * parseNomClasseVoulue() ou NomClasseVoulue() est la classe distinataire .
 * Exemple dns la méthode Main :
 */
public class WrapperTypes {

	public static void main(String[] args) {

		// convertion d'une chaine d'un string en Short en utilisant la méthode
		// Short.parseShort()
		Short test = Short.parseShort("24");
		System.out.println(test);

		// conversion d'un string en type primitif int en utilisant la méthode
		// Integer.parseInt()
		int données = Integer.parseInt("25");
		System.out.println(données);

	}

}
