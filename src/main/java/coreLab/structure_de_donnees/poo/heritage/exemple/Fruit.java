package coreLab.structure_de_donnees.poo.heritage.exemple;

import java.util.Objects;

public class Fruit {

    private String nom;
    private String couleur;
    private String origine;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getOrigine() {
        return origine;
    }

    public void setOrigine(String origine) {
        this.origine = origine;
    }

    public Fruit(String nom, String couleur, String origine) {
        this.nom = nom;
        this.couleur = couleur;
        this.origine = origine;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Fruit fruit = (Fruit) o;
        return Objects.equals(nom, fruit.nom) && Objects.equals(couleur, fruit.couleur) && Objects.equals(origine, fruit.origine);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(nom);
        result = 31 * result + Objects.hashCode(couleur);
        result = 31 * result + Objects.hashCode(origine);
        return result;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "nom='" + nom + '\'' +
                ", couleur='" + couleur + '\'' +
                ", origine='" + origine + '\'' +
                '}';
    }

    public String descriptionFruit() {
        return " Je suis un fruit ";
    }
}
