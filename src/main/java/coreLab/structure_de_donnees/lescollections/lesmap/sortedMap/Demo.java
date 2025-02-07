package coreLab.structure_de_donnees.lescollections.lesmap.sortedMap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class Demo {

    private static final Logger logger = LogManager.getLogger(Demo.class);

    public static void main(String[] args) {

        //création d'une sortedMap
        SortedMap<Integer, String> sortedMap = new TreeMap<>();

        //Ajout d'éléments
        sortedMap.put(3, "Charlie");
        sortedMap.put(1, "Alice");
        sortedMap.put(2, "Bob");
        sortedMap.put(5, "Eve");
        sortedMap.put(4, "David");

        //affichage trié automatiquement par clé
        logger.debug("contenue de sortedMap {}", sortedMap); // affiche : contenue de sortedMap {1=Alice, 2=Bob, 3=Charlie, 4=David, 5=Eve}

        //accès aux clés extremes
        logger.debug("première clé  {}", sortedMap.firstKey()); // première clé 1
        logger.debug("dernière clé {}", sortedMap.lastKey()); // dernière clé 5


        // Sous-ensemble triés
        logger.debug("Sous-map (2 à 4) : {} ", sortedMap.subMap(2, 5));// {2=Bob,3=Charlie,4=David}
        logger.debug("Elements avant 3 : {}", sortedMap.headMap(3)); // {1=Alice,2=Bob}
        logger.debug("Elements après 3  {}", sortedMap.tailMap(3)); // {3=Charlie,4=David,5=Eve}

        /**
         * Trie personnalisé avec un comparator
         */

        SortedMap<Integer, String> villes = new TreeMap<>(Comparator.reverseOrder());

        villes.put(75, "Paris");
        villes.put(50, "Manche");
        villes.put(59, "Nord");
        villes.put(33, "Gironde");
        villes.put(83, "Var");

        logger.debug("la map par ordre inversé des clé : du plus grand au plus petit {}", villes);

        //sans comparator

        SortedMap<Integer, String> newVilles = new TreeMap<>();

        newVilles.put(75, "Paris");
        newVilles.put(50, "Manche");
        newVilles.put(59, "Nord");
        newVilles.put(33, "Gironde");
        newVilles.put(83, "Var");

        logger.debug("sortedMap sans comparator :  {} ",newVilles); // affiche dans l'ordre croissant des clés

    }
}
