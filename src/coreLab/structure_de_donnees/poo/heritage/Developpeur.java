package coreLab.structure_de_donnees.poo.heritage;

public class Developpeur extends Personne {

	String langage;

	public Developpeur(String nom, String langage) {
		super(nom);
		this.langage = langage;
	}

	@Override
	public String affiche() { // méthode redefinie de la classe Personne
		return nom + "  travail en " + this.langage;
	}

}
