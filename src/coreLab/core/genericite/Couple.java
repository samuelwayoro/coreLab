package coreLab.core.genericite;

/**
 * utilisation de type générique T1 et T2 emplacé après le nom de la class pour
 * dire qu'il s'agit des type utilisés pour les propriétés de la classe ...
 * 
 * @param <T1>
 * @param <T2>
 */
public class Couple<K, V> {

	private K clef;
	private V valeur;
	
	public Couple(K clef, V valeur) {
		this.clef = clef;
		this.valeur = valeur;
	}

	public K getClef() {
		return clef;
	}

	public void setClef(K clef) {
		this.clef = clef;
	}

	public V getValeur() {
		return valeur;
	}

	public void setValeur(V valeur) {
		this.valeur = valeur;
	}
	
	
	
}
