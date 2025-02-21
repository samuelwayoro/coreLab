package corelab.structurededonnees.genericite;
/***
 * Couplet est une classe générique fille de la classe Couple.
 * elle utilise ici les paramètres K et V car nous n'avons pas donné de type
 * défini aux paramètres K,V de Couple.
 * @param <K>
 * @param <V>
 */
public class Couplet<K,V> extends Couple<K, V> {

	public Couplet(K clef, V valeur) {
		super(clef, valeur);
		// TODO Auto-generated constructor stub
	}
}
