package corelab.structures_de_donnees.genericite;
/**
 * la classe CoupletDeux quand a elle est une classe 
 * fille de la classe générique Couple . 
 * elle n'a pas de type parametré car nous avons 
 * ici bien défini les deux paramètres de la classe 
 * Couple<Integer,String>
 */
public class CoupletDeux extends Couple<Integer, String> {

	public CoupletDeux(Integer clef, String valeur) {
		super(clef, valeur);
		// TODO Auto-generated constructor stub
	}

}
