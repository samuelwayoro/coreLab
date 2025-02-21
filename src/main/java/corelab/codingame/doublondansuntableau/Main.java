package corelab.codingame.doublondansuntableau;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

/***
 * ECRIRE UN ALGO QUI PERMET DE RECHERCHE UN NOMBRE QUI SERAIT EN DOUBLE DANS UN
 * TABLEAU
 */
public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        if (logger.isInfoEnabled()) {
            logger.info("***");
        }

        Integer[] tableau = new Integer[]{15, 22, 55, 986, 99, 10, 45, 75, 96, 53, 1};

        logger.debug("-verif avec rechercherDoublonAvecStream le tableau contient un nombre en double ? ");

        logger.info(rechercherDoublonAvecStream(tableau));


        logger.debug("-verif avec rechercherDoublonAvecUnSet ; le tableau contient un nombre en double ? ");

        logger.info(rechercherDoublonAvecUnSet(tableau));

    }

    /**
     * En java 8 nous pouvons utiliser les flux pour compter les éléments distincts
     * présents dans un Array . si le nombre distinct n'est pas le même que la
     * longeur du array , le array contient alors un doublon .
     *
     * @param <T>
     * @param tab
     * @return
     */
    static boolean rechercherDoublonAvecStream(Integer[] tab) {

        // recup le nombre total de données distinct dans le tableau
        Long distinctCount = Stream.of(tab).distinct().count();

        logger.debug("taille du tableau {} , nombre de données distinct ", tab.length, Long.valueOf(distinctCount).intValue());

        // comparer ce nombre au
        return tab.length != distinctCount;

    }

    static boolean rechercherDoublonAvecUnSet(Integer[] tab) {

        // creée un ensemble vide
        Set<Integer> set = new HashSet<>();

        // parcourir les elements du tableau pour remplir progressivement le set
        for (Integer i : tab) {

            // si l'element en cours est déjà dans le set arreté la boucle
            if (set.contains(i))
                return true;

            if (i != null)
                set.add(i);
        }

        // retourné faux si aucun element recherché n'a été trouvé dans le set
        return false;
    }

}
