package corelab.structurededonnees.poo.heritage.les_classes_scellees.models;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainTest {
    private static final Logger logger = LogManager.getLogger(MainTest.class);

    public static void main(String[] args) {
        Animal rex = new Chien("Chien");


        //vérification de l'animal
        logger.info(" RESULTAT : Notre animal est  {} ", verification(rex));


    }

    static String verification(Animal animal) {
        String result = switch (animal.getNom()) {
            case "Chien":
                logger.debug("** l'animal est un chien ** ");
                yield "un chien";
            case "Chat":
                logger.debug(" ** l'animal est un chat ** ");
                yield "un chat";
            case "Oiseau":
                logger.debug(" ** l'animal est un oiseau ** ");
                yield "un oiseau";
            default:
                throw new IllegalStateException("Unexpected value: " + animal.getNom());
        };
        return result;
    }
}
