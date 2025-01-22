package coreLab.structure_de_donnees.poo.heritage;

public class Personne {

	String nom;

	public Personne(String nom) {
		super();
		this.nom = nom;
	}

	String affiche() {
		return this.nom;
	}

	// méthode static non redefinisable dans les classes filles a Personne
	final String identification() {
		return nom;
	}

}
