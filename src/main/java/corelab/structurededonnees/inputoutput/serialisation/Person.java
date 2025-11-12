package corelab.structurededonnees.inputoutput.serialisation;

import java.io.Serializable;

public class Person implements Serializable {

    private String nom;
    private int age;

    public Person() {
        super();
    }

    public Person(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public String toString() {
        return ("Nom:" + this.nom + " , âge :" + this.age);
    }

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
}
