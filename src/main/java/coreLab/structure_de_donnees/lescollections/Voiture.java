package coreLab.structure_de_donnees.lescollections;

public class Voiture {

    private String marque;
    private String couleur;

    public Voiture(String marque, String couleur) {
        this.marque = marque;
        this.couleur = couleur;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
}
