package coreLab.structure_de_donnees.lescollections.lessets;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        logger.debug("**** exemple de HashSet<> ****");

        Set<String> monSet = new HashSet<>();
        monSet.add("Sam");
        monSet.add("Dobré");
        monSet.add("Sam"); //n'est pas rajouté, car ne permet pas de doublons

        // parcoursAvecIterateur(monSet);

        //  parcourAvecForEach(monSet);

        Personne personne1 = new Personne(1, "Wayoro", "Samuel");
        Personne personne2 = new Personne(2, "Wayoro", "Isaac");
        Personne personne3 = new Personne(1, "Wayoro", "Samuel"); //ne séra pas rajouté (car doublon)
        Personne personne4 = new Personne(3, "Wayoro", "Samuel");//sera rajouté, car id différent
        Set<Personne> peopleSet = new HashSet<>();
        peopleSet.add(personne1);
        peopleSet.add(personne2);
        peopleSet.add(personne3);
        peopleSet.add(personne4);

        parcoursAvecIterateur(peopleSet);


        logger.debug("**** exemple de TreeSet<> : Ensemble de donnée ordonnées****");

        Set<String> leSet = new TreeSet<String>();
        //le TreeSet ordonnera les données qui lui sont ajoutées
        leSet.add("z");
        leSet.add("d");
        leSet.add("x");
        leSet.add("a");
        leSet.add("c");
        leSet.add("h");

        parcourAvecForEach(leSet);


        //copierUnSetAunAutre(monSet, leSet);

        Set<Integer> unSet = new TreeSet<Integer>();
        unSet.add(15);
        unSet.add(100000);
        unSet.add(-5);
        unSet.add(0);
        unSet.add(2);
        unSet.add(1);
        unSet.add(9);
        unSet.add(-6);

    }

    static <E> void parcourirSetAvecLambda(Set<E> leSet) {
        leSet.forEach(e -> System.out.println(e));
    }

    static <T> void parcourAvecForEach(Set<T> set) {
        logger.debug("--- parcours avec une boucle forEach() ---");
        for (T t : set) {
            logger.debug("{}", t);
        }
    }

    static <T> void parcoursAvecBoucle(Set<T> set) {
        logger.debug("Methode : parcourAvecBoucle() ");

        for (int i = 0; i < set.size(); i++) {
            logger.debug("{}", i);
        }
    }

    static <E> void parcoursAvecIterateur(Set<E> set) { // attention <E> pareil que <T>
        logger.debug("*** parcours avec Itérateur ***");
        Iterator<E> ite = set.iterator();
        while (ite.hasNext()) {
            logger.debug("{}", ite.next());
        }
    }

    static <T> void copierUnSetAunAutre(Set<T> setOne, Set<T> setTwo) {
        System.out.println("premier set : ");
        setOne.forEach(x -> System.out.println(x));

        System.out.println("deuxième set ");
        setTwo.forEach(c -> System.out.println(c));

        System.out.println("copie ---- ");
        setTwo.addAll(setTwo);
        System.out.println("fin de copie ----");
        setTwo.forEach(c -> System.out.println(c));

    }

}
