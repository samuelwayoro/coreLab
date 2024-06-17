package coreLab.structure_de_donnees.genericite;
/**
 * la classe CalculGenericMethod ne contient qu'une seule méthode générique sans qu'elle ne soit elle même une classe 
 * générique . 
 */
public class CalculGenericMethod {
	
	public <T> boolean compare(T a , T b ) {
		return a.equals(b);
	}
}
