package corelab.structures_de_donnees.lescollections.lessets.lessortedset;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExemple {

    private final static Logger logger = LogManager.getLogger(SortedSetExemple.class);

    public static void main(String[] args) {

        SortedSet<Integer> sortedSet = new TreeSet<>();

        //ajout d'éléments
        sortedSet.add(30);
        sortedSet.add(10);
        sortedSet.add(50);
        sortedSet.add(20);

        //parcours : affiche les éléments trié automatiquement dans l'ordre croissant (du plus petit au plus grand)
        for (Integer i : sortedSet) {
            logger.debug("{}", i); //10 - 20 - 30 - 50
        }

        //facilité de recup du premier élémént (dans l'ordre trié croissant)
        logger.debug("premier élémént {}", sortedSet.first());

        //facilité de recup du dernier élément (dans l'ordre trié croissant)
        logger.debug("dernier élémént {}", sortedSet.last());

        //sous ensemble : exemple entre >15 et <40
        logger.debug("sous ensemble de nombre compris entre 15 et 40  = {}", sortedSet.subSet(15, 40));


        /**
         * Utilisation d'un comparator personnalisé
         */
        logger.info("--- Utilisation d'un comparator personnalisé ---");
        SortedSet<Integer> sortedSet1 = new TreeSet<>(Comparator.reverseOrder());

        //ajout d'éléménts
        sortedSet1.addAll(Arrays.asList(-5, 8, 80, 658, 1, 1000, 57, 2, -100, 10000000, 69));

        //affichage direct des éléménts : affiche les éléments dans l'ordre inverse (décroissant) imposé par le comparator
        sortedSet1.forEach(s -> logger.debug("{}", s));

        SortedSet sortedSet2 = new TreeSet(Comparator.reverseOrder());

        sortedSet2.add("Alice");
        sortedSet2.add("Bob");
        sortedSet2.add("Charlie");
        sortedSet2.add("Xavier");

        logger.debug("-> {}", sortedSet2); // [Xavier,Charlie,Bob,Alice]

    }
}
