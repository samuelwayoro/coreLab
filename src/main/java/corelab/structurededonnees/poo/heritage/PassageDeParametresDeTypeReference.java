package corelab.structures_de_donnees.poo.heritage;

public class PassageDeParametresDeTypeReference {

	static class Structure {
		int a;
		int b;
	}

	public static void main(String[] args) {

		/***********************************************************************************************/
		/** passage de paramètre de type primitifs **/
		/***********************************************************************************************/
		int a = 5;
		int b = 6;

		// verif avant passage :
		System.out.println("a vaut : " + a + " , b vaut :" + b);
		System.out.println("execution de l'échange avec les paramètres primitifs  .... ");
		echange(a, b);
		System.out.println("a vaut : " + a + ", b vaut : " + b);

		echange(a, b);

		/**********************************************************************************************/
		/** passage de paramètre de type reference **/
		/**********************************************************************************************/
		Structure s1 = new Structure();
		s1.a = 1;
		s1.b = 2;

		// verification du contenu avant echange...
		System.out.println("s1 contient s1.a =" + s1.a + ",  s1.b =" + s1.b);

		System.out.println("execution de l'échange avec les paramètres par reference ...");
		echange(s1);

		// verification après échange ...
		System.out.println("s1 contient s1.a =" + s1.a + ",  s1.b =" + s1.b);

		/*
		 * CONCLUSION : en java le passage de paramètre de type objet sont toujours
		 * passé par référence... c'est-à-dire que les traitements effectués sur eux ont
		 * un impact direct sur les valeurs.
		 * 
		 * Par contre, le passage de paramètres de type primitifs sont passés par
		 * valeurs...
		 * Autrement dit les traitements effectués sur eux n'ont aucun n'impact sur
		 * leurs valeurs de départ, car ils sont copiés localement dans les méthodes ou
		 * elles sont passés.
		 */

	}

	public static void echange(Structure s) {
		int temp = s.a;
		s.a = s.b;
		s.b = temp;
	}

	public static void echange(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

}
