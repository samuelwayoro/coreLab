package corelab.structurededonnees.genericite;

import java.io.Serializable;
/**
 * ProduitLiquide est une classe fille de la classe Produit
 * et qui implémente les deux interfaces Serializable et Cloneable
 */
public class ProduitLiquide extends Produit implements Serializable , Cloneable  {

	private static final long serialVersionUID = 1L;
	private double quantite;

	public ProduitLiquide(Long id, String nom, String description) {
		super(id, nom, description);
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
