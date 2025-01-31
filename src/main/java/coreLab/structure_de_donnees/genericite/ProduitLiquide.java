package coreLab.structure_de_donnees.genericite;

import java.io.Serializable;
/**
 * ProduitLiquide est une classe fille de la classe produit
 * et qui implémente les deux interfaces Serializable et Clonaeble
 */
public class ProduitLiquide extends Produit implements Serializable , Cloneable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double quantite;

	public ProduitLiquide(Long id, String nom, String description) {
		super(id, nom, description);
		// TODO Auto-generated constructor stub
	}

	public ProduitLiquide(Long id, String nom, String description, double quantite) {
		super(id, nom, description);
		this.quantite = quantite;
	}

	public double getQuantite() {
		return quantite;
	}

	public void setQuantite(double quantite) {
		this.quantite = quantite;
	}
	
	

}
