package coreLab.structure_de_donnees.poo.heritage.interfaces.model;

import java.util.Objects;

public class Femme implements Humain {

    private String nom;
    private int age;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Femme(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Femme femme)) return false;

        return age == femme.age && Objects.equals(nom, femme.nom);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(nom);
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Femme{" +
                "nom='" + nom + '\'' +
                ", age=" + age +
                '}';
    }
}
