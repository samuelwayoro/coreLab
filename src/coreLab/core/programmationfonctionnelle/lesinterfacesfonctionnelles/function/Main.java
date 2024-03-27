package coreLab.core.programmationfonctionnelle.lesinterfacesfonctionnelles.function;

import java.util.function.Function;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		testFunction("Hello World");
	}
	
	/**
	 * renvoyer la longeur d'une chaine de caractère a l'aide 
	 * d'un Function<String>
	 * @param s
	 */
	static void testFunction(String s) {
		Function<String, Integer> f1 = x -> x.length();
		
		System.out.println("resultat de testFunction : "+f1.apply(s));
	}

	
	

}
