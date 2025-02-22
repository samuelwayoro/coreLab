package corelab.structurededonnees.genericite;
/**
 * La classe CalculGenericMethod ne contient qu'une seule méthode générique
 * sans qu'elle ne sois elle-même une classe générique
 */
public class CalculGenericMethod {
	
	public <T> boolean compare(T a , T b ) {
		return a.equals(b);
	}
}
