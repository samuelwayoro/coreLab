package coreLab.structure_de_donnees.programmationfonctionnelle.lesinterfacesfonctionnelles.consumer;

import coreLab.structure_de_donnees.programmationfonctionnelle.lesinterfacesfonctionnelles.consumer.model.Fichier;

import java.util.function.Consumer;

public class MainConsumer {

	public static void main(String[] args) {
		afficherText("Bonjour à tous , ceci est une utilisation d'un Consumer de String");

		Fichier fichier = new Fichier("petit fichier", "C:/Administrateur/test.txt");
		fichier.affichage(fichier);
	}

	/**
	 * affichage d'un texte dans la sortie standart a partir d'un Consumer
	 * 
	 * @param t
	 */
	static void afficherText(String t) {
		Consumer<String> consumer = c -> System.out.println(c);
		consumer.accept(t);
	}

}
