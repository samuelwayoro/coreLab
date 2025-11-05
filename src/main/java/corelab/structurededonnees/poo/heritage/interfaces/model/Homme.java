package corelab.structures_de_donnees.poo.heritage.interfaces.model;

import java.util.Objects;

public class Homme implements Humain {
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

    public Homme(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Homme homme)) return false;

        return age == homme.age && Objects.equals(nom, homme.nom);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(nom);
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Homme{" +
                "nom='" + nom + '\'' +
                ", age=" + age +
                '}';
    }
}
