package corelab.structurededonnees.lescollections.classesutilitaires.arraysetcollections.comparatoretcomparable;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExempleComparable {

    private static final Logger logger = LogManager.getLogger(ExempleComparable.class);

    public static void main(String[] args) {

        List<Personne> personnes = new ArrayList<>();
        personnes.add(new Personne("Charlie", 25));
        personnes.add(new Personne("Alice", 30));
        personnes.add(new Personne("Bob", 20));

        Collections.sort(personnes); //utilisation de compareTo de la classe Personne

        logger.debug(personnes); //[Alice(30), Bob(20), Charlie(25)]

    }

    static class Personne implements Comparable<Personne> {

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
        public int compareTo(Personne o) {
            return this.nom.compareTo(o.getNom());
        }
    }

}
