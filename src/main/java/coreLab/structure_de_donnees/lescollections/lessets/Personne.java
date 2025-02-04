package coreLab.structure_de_donnees.lescollections.lessets;

import java.util.Objects;

public class Personne {
    private int id;
    private String nom;
    private String prenoms;

    public Personne(int id, String nom, String prenoms) {
        this.id = id;
        this.nom = nom;
        this.prenoms = prenoms;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenoms() {
        return prenoms;
    }

    public void setPrenoms(String prenoms) {
        this.prenoms = prenoms;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Personne personne = (Personne) o;
        return Objects.equals(id, personne.id) && Objects.equals(nom, personne.nom) && Objects.equals(prenoms, personne.prenoms);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(id);
        result = 31 * result + Objects.hashCode(nom);
        result = 31 * result + Objects.hashCode(prenoms);
        return result;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenoms='" + prenoms + '\'' +
                '}';
    }
}
