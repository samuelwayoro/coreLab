package corelab.structurededonnees.lescollections.classesutilitaires.arraysetcollections.arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.List;

public class DemoArrays {

    public static final Logger logger = LogManager.getLogger(DemoArrays.class);

    public static void main(String[] args) {

        int[] numbers = {5, 3, 8, 1};

        logger.debug("tableau pas encore trié {}", numbers);

        //tri d'un tableau avec Arrays.sort()
        Arrays.sort(numbers);

        logger.debug("Tableau trié : {}", numbers);

        //recherche binaire (renvoyer l'index d'une valeur contenu dans le tableau)
        int index = Arrays.binarySearch(numbers, 5);
        logger.debug("l'index de 5 dans le tableau (après trie) est {}", index);

        //conversion en list : Arrays.asList retourne une liste fixe (non redimensionnable).
        List<String> noms = Arrays.asList("Jessica", "Raphael", "Arnold", "Samuel", "Isaac");
        logger.debug("Liste : {}", noms.getClass().getName());

    }
}
