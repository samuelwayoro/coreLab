package corelab.structurededonnees.programmationfonctionnelle.lesinterfacesfonctionnelles.consumer.model;

import java.util.function.Consumer;

public class Fichier {

	private String nom;
	private String chemin;

	public Fichier() {
	}

	public Fichier(String nom, String chemin) {
		super();
		this.nom = nom;
		this.chemin = chemin;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getChemin() {
		return chemin;
	}

	public void setChemin(String chemin) {
		this.chemin = chemin;
	}

	/***
	 * méthode affichage() permettant d'afficher la propriété nom d'un objet de type
	 * Fichier
	 * 
	 * @param infos
	 */
	public void affichage(Fichier infos) {
		System.out.println("utilisation de la méthode affichage()  prenant en paramètre un Fichier : ");
		Consumer<Fichier> consumer = f -> System.out.println(f);
		consumer.accept(infos);
	}

	/***
	 * methode affichageDeChemin() permettant d'afficher la propriété chemin d'un
	 * objet de type Fichier
	 * 
	 * @param cheminDuFichier
	 */
	public void affichageDeChemin(Consumer<String> cheminDuFichier) {
		System.out.println("utilisation de la méthode affichageDeChemin() prenant en paramètre un Consumer :");
		cheminDuFichier.accept(this.chemin);
	}

}
