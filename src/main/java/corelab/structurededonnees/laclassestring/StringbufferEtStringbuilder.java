package corelab.structures_de_donnees.laclassestring;

public class StringbufferEtStringbuilder {

	public static void main(String[] args) {
		/*
		 * les classes Stringbuffer et Stringbuilder sont différentes de la classe
		 * String car elles sont mutables ... elle permettent une modification des
		 * caractères qu'elles contienent sans en créer d'autres chaînes de caractères a
		 * proprement parler .
		 * 
		 * Elles sont alors plus appropriées pour la modification des chaines de
		 * caractères en gagnant du temps et en mémoire heap.
		 * 
		 * 
		 * 
		 */

		// non mutable
		String str = "";
		Long departString = System.currentTimeMillis();

		for (int i = 0; i < 10000; i++) {
			str += 'c';
		}

		Long finString = System.currentTimeMillis();
		System.out.println("temps mis par la classe String : " + (finString - departString));

		// mutable et synchronisé (utile dans un env multi threading: lors de
		// l'utilisation par plusieurs ressources...)
		StringBuffer strBuff = new StringBuffer();
		Long departStringBuffer = System.currentTimeMillis();

		for (int i = 0; i < 10000; i++) {
			strBuff.append('c');
		}

		Long finStringBuff = System.currentTimeMillis();
		System.out.println("temps mis par la classe StringBuffer : " + (departStringBuffer - finStringBuff));

		// mutable non synchronisé
		StringBuilder strBuild = new StringBuilder();
		Long departStringBuilder = System.currentTimeMillis();

		for (int i = 0; i < 10000; i++) {
			strBuild.append('c');
		}

		Long finStringBuilder = System.currentTimeMillis();
		System.out.println("temps mis par la classe StringBuilder : " + (departStringBuilder - finStringBuilder));
	}

	/*
	 * conclusion en java , pour traiter une chaine de caractère modifiable , il
	 * faudrais surtout pas utiliser la classe String , mais plûtot StringBuffer ou
	 * StringBuilder ... surtout StringBuilder (plus récommendé)
	 */

}
