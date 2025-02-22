package corelab.structurededonnees.lescollections.classesutilitaires.arraysetcollections.comparatoretcomparable;

public class Personne implements Comparable<ExempleComparable.Personne> {


    private String nom;
    private int age;

    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
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

    @Override
    public String toString() {
        return nom + "(" + age + ")";
    }

    /**
     * Implémentation de la méthode compareTo : comparaison sur la base du nom
     *
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(ExempleComparable.Personne o) {
        return this.nom.compareTo(o.getNom());
    }
}

