package coreLab.structure_de_donnees.programmationfonctionnelle.lesinterfacesfonctionnelles.function.bifunction;

import java.util.function.BiFunction;

public class MainBiFunction {

	public static void main(String[] args) {
		
		positionDeCaractere("savoureusement", "t");
		
		nombreDeCaractereDansUnText("anticonstitutionnelle", 'i');		

		
	}
	
	/**
	 * Ecrire une méthode qui retourne le numéro de position d'une chaine de caractère 
	 * dans une chaine de caractère donnée avec un BiFunction
	 * @param chaine
	 * @param caractere
	 */
	static void positionDeCaractere(String chaine , String caractere) {
		
		BiFunction<String, String, Integer> bf1 = (s1,s2)->s1.indexOf(s2);
		
		System.out.println(" "+caractere+" se trouve a la "+bf1.apply(chaine, caractere)+" ième position dans "+chaine);
		
	}
	
	/**
	 * fonction qui retourne le nombre de fois qu'on a un 
	 * caractère dans une chaine de caractère avec un BiFunction
	 * @param chaine
	 * @param caractere
	 */
	static void nombreDeCaractereDansUnText(String chaine,Character caractere) {
	
		BiFunction<String, Character, Integer> bf = (string,c)->{
			char[] characteres = string.toCharArray();
			int compteur =0 ;

			for (char d : characteres) {
				if(d==caractere) {
					compteur ++;
				}
			}
			
			return compteur;
		};
		
		System.out.println(" il y a "+bf.apply(chaine, caractere)+" fois la lettre  "+caractere+" dans "+chaine);
	}

}
