package corelab.structures_de_donnees.genericite;

import java.io.Serializable;

/**
 * TraitementDeux est une classe générique acceptant uniquement une classe T :
 * fille de la classe Produit
 * implémentant les interfaces Serializable et Cloneable
 *
 * @param <T>
 */
public class TraitementDeux<T extends Produit & Serializable & Cloneable> {

    private T detail;

    public TraitementDeux(T detail) {
        this.detail = detail;
    }

    public T getDetail() {
        return detail;
    }

    public void setDetail(T detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "TraitementDeux instancié à partir d'un " + detail.getClass() + " dans la propriété details avec :  id =" + detail.getId() + " nom =" + detail.getNom() + " description=" + detail.getDescription();
    }


}
