package coreLab.structure_de_donnees.genericite;

import java.io.Serializable;
/**
 * TraitementDeux est une classe générique mais pas n'importe laquelle ...
 * elle accepte uniquement a l'instantiation une classe T
 * - fille de la classe Produit
 * - et qui implémente l'interface Serializable
 * - et qui implemente l'interface Cloneable 
 * @param <T>
 */
public class TraitementDeux<T extends Produit & Serializable & Cloneable> {
	
	private String detail;

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public TraitementDeux(String detail) {
		super();
		this.detail = detail;
	}

	@Override
	public String toString() {
		return "TraitementDeux [detail=" + detail + "]";
	}
	
	

}
