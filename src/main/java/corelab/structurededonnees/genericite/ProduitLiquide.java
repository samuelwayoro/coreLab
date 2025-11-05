package corelab.structures_de_donnees.genericite;

import java.io.Serializable;

/**
 * ProduitLiquide est une classe fille de la classe Produit
 * et qui implémente les deux interfaces Serializable et Cloneable
 */
public class ProduitLiquide extends Produit implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;
    private double quantite;

    public ProduitLiquide(Long id, String nom, String description) {
        super(id, nom, description);
    }

    public ProduitLiquide(Long id, String nom, String description, double qte) {
        super(id, nom, description);
        this.quantite = qte;
    }

    public double getQuantite() {
        return quantite;
    }

    public void setQuantite(double quantite) {
        this.quantite = quantite;
    }

    @Override
    public String toString() {
        return "ProduitLiquide{" +
                "quantite=" + quantite +
                '}';
    }
}
