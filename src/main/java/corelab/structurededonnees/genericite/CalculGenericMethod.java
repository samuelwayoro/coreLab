package corelab.structures_de_donnees.genericite;
/**
 * La classe CalculGenericMethod ne contient qu'une seule méthode générique
 * sans être une classe générique
 */
public class CalculGenericMethod {
	
	public <T> boolean compare(T a , T b ) {
		return a.equals(b);
	}
}
