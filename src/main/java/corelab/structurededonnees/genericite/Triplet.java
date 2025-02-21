package corelab.structurededonnees.genericite;

/**
 * TripletTwo est une classe générique fille de la classe générique Couple<K,V>
 * elle contient obligatoirement les deux types génériques de sa classe mère
 * Couple<K,V> en plus du type générique <U>
 * 
 * @param <K>
 * @param <V>
 * @param <U>
 */
public class Triplet<K, V, U> extends Couple<K, V> {

	private U description;

	public Triplet(K clef, V valeur) {
		super(clef, valeur);
		// TODO Auto-generated constructor stub
	}

	public Triplet(K clef, V valeur, U description) {
		super(clef, valeur);
		this.description = description;
	}

	public U getDescription() {
		return description;
	}

	public void setDescription(U description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Triplet [description=" + description + ", getDescription()=" + getDescription() + ", getClef()="
				+ getClef() + ", getValeur()=" + getValeur() + "]";
	}

}
