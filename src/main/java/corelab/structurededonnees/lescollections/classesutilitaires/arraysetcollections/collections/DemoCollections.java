package corelab.structurededonnees.lescollections.classesutilitaires.arraysetcollections.collections;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DemoCollections {

    private static final Logger logger = LogManager.getLogger(DemoCollections.class);

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 3, 8, 1));

        //tri : par ordre croissant
        Collections.sort(numbers);

        logger.debug("Liste triée : {}", numbers);

        //Mélange des données
        Collections.shuffle(numbers);

        logger.debug("Liste mélangée {}", numbers);

        //Liste immuable
        List<String> noms = Collections.unmodifiableList(Arrays.asList("Badobré", "Blaise", "Samuel"));
        noms.add("SamArvyne"); //lève une exception unchecked
        logger.debug("noms : {}", noms);
    }
}
