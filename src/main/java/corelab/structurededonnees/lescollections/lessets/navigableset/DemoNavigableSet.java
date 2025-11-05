package corelab.structures_de_donnees.lescollections.lessets.navigableset;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.NavigableSet;
import java.util.TreeSet;

public class DemoNavigableSet {

    private static final Logger logger = LogManager.getLogger(DemoNavigableSet.class);

    public static void main(String[] args) {

        logger.debug("exemple de NavigableSet");

        NavigableSet<Integer> navigableSet = new TreeSet<>();

        navigableSet.add(10);
        navigableSet.add(20);
        navigableSet.add(30);
        navigableSet.add(40);
        navigableSet.add(50);


        //recherche des éléments proches

        logger.info("*** recherche des élémént proches ***");

        logger.debug(" plus grand element de la collection strictement inférieur 30  avec lower(E e) : {}", navigableSet.lower(30)); // affiche 20
        logger.debug(" plus grand element de la collection inférieur ou égale 30 floor(E e) : {}", navigableSet.floor(30)); // affiche 30
        logger.debug(" plus petit élément supérieur ou égale 30 avec ceiling(E e) : ceiling(E e) : {} ", navigableSet.ceiling(30)); // 30
        logger.debug("plus petit élément strictement supérieur à 30 avec higher(E e) : {}", navigableSet.higher(30)); //40

        //suppression et recupération rapide d'éléments dans une collection

        logger.info("*** suppression et recupération rapide d'éléments dans une collection *** ");

        //.pollFirst() : retire et retourne le premier élément (le plus petit)
        logger.debug(".pollFirst() : retire et retourne le premier élément (le plus petit) {}", navigableSet.pollFirst()); //10

        //.pollLast() : retire retourne le dernier élément (le plus grand)
        logger.debug(".pollLast() : retire retourne le dernier élément (le plus grand) {}", navigableSet.pollLast());//50


        /**
         * TRI inversé avec NavigableSet
         **/
        NavigableSet<Integer> nombres = new TreeSet<Integer>();
        nombres.add(900);
        nombres.add(-8);
        nombres.add(56);
        nombres.add(-82315);
        nombres.add(9);
        nombres.add(1);
        nombres.add(-18320);
        nombres.add(745);

        logger.debug("affichage trié dans l'ordre croissant des éléments : ");
        logger.debug("{}", nombres); //plus petit au plus grand

        logger.debug("affichage trié dans l'ordre inversé des éléments : ");
        logger.debug("{}", nombres.descendingSet()); //plus petits au plus grand

        /**
         * SOUS ENSEMBLE D'UNE COLLECTION
         */

        logger.debug("--- sous ensemble dans une collection ----");
        NavigableSet<Integer> nvs = new TreeSet<>();
        nvs.add(40);
        nvs.add(25);
        nvs.add(18);
        nvs.add(30);
        nvs.add(31);
        nvs.add(38);
        nvs.add(-9);
        nvs.add(20);
        //Sous-ensemble avec options includsive/exclusive
        logger.debug("SubSet(20 à 40,excluant 40) : {} ", nvs.subSet(20, 40));
    }
}
