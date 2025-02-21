package corelab.structurededonnees.laclassestring;

public class Main {

	public static void main(String[] args) {

		/*
		 * La classe String est conçue de telle manière, qu'une fois un objet String
		 * construit, il n'est plus possible de modifier son contenu (tableau de
		 * caractères). On dit que la classe String est immutable , ce qui signifie que
		 * la donnée qu'elle contient est en "lecture seule".
		 * 
		 * Elle suit en cela un design pattern qui porte ce nom. Entre autres choses,
		 * cela permet deux optimisations, sur la méthode hashCode() et la méthode
		 * equals() que nous verrons en détails.
		 * 
		 */

		String s1 = "Bonjour le monde !";

		String s11 = "Bonjour le monde !";

		String s2 = new String("Bonjour le monde !");

		/*
		 * Ces deux façons ne sont pas rigoureusement équivalentes, et la différence
		 * entre les deux est assez subtile. Effectivement, si l'on évalue (s1 == s11),
		 * on se rend compte que la valeur retournée est true.
		 * 
		 * Ce qui signifie que la machine Java n'a en fait créé qu'un seul objet,
		 * qu'elle a affecté aux deux variables s1 et s11.
		 * 
		 * C'est une optimisation parfaitement valide : comme il n'est pas possible de
		 * changer la chaîne de caractères portée par l'objet créé par la JVM, on peut
		 * parfaitement n'en créer qu'un au lieu de deux. En revanche, si l'on évalue
		 * (s1 == s2), là le résultat est false, on a forcé la création d'un nouvelle
		 * chaîne de caractères par un appel explicite au new
		 */

		/*
		 * Concaténation d'une liste de String en utilisant String.join():
		 * 
		 * Apparue avec le jdk 8 la méthode join() de la classe String dans l'exemple
		 * suivant, permet de concatener les chaines de caractère du tableau foruni en y
		 * ajoutant un délimiteur ... très pratique pour un traitement en flux ...
		 */

		String[] strings = { "one", "two", "three" };
		String res = String.join("-", strings);
		System.out.println(res);

	}

}
