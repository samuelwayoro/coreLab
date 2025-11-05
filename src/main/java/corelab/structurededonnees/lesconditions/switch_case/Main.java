package corelab.structures_de_donnees.lesconditions.switch_case;

public class Main {

	public static void main(String[] args) {
		/*
		 * La structure de condition switch case est utilisée pour controller les flux
		 * d'informations dont on connaît les valeurs probables
		 * 
		 * la syntax est :
		 * 
		 * switch (valeur_a_vérifier) {
		 * 
		 * case_valeurPossible1 : //instruction break;
		 * 
		 * case_valeurPossible2 : //instruction break ;
		 * 
		 * ...
		 * 
		 * default }
		 * 
		 */

		// EXEMPLE :
		ancienne_structure();

		nouvelle_structure();

	}

	public static void ancienne_structure() {
		int[] tabVal = new int[3];

		switch (tabVal.length) {
		case 0: {
			System.out.println("contient 0 valeurs ");
			break;
		}
		case 1: {
			System.out.println("contient une seul valeur");
			break;
		}
		case 2: {
			System.out.println("contient deux valeurs ...");
			break;
		}
		case 3: {
			System.out.println("contient trois valeurs ...");
			break;
		}
		default: // instruction exécutée si ni 0 ; 1 ou 2 valeurs dans la variable args ...
			throw new IllegalArgumentException("Unexpected value: " + tabVal.length);
		}
	}

	public static void nouvelle_structure() {
		int[] tabVal = new int[5];

		/*
		 * Random random = new Random();
		 * 
		 * 
		 * for (int i = 0; i < tabVal.length; i++) {
		 * 
		 * 
		 * tabVal[i] = random.nextInt(10); // genère un nombre dans l'intervalle [0;10[
		 * 
		 * }
		 * 
		 */

		switch (tabVal.length) {
		case 1 -> System.out.println("le tableau tabVal contient 1 seul valeur...");
		case 2 -> System.out.println("le tableau tabVal contient 2 valeurs...");
		case 3 -> System.out.println("le tableau tabVal contient 3 valeurs...");
		case 4 -> System.out.println("le tableau tabVal contient 4 valeurs ...");
		case 5 -> System.out.println("le tableau tabVal contient 5 valeurs ...");
		default -> throw new IllegalArgumentException("Unexpected value: " + tabVal);
		}
	}

}
