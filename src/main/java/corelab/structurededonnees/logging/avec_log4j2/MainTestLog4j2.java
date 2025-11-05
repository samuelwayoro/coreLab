package corelab.structures_de_donnees.logging.avec_log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainTestLog4j2 {
    private static final Logger logger = LogManager.getLogger(MainTestLog4j2.class);

    public static void main(String[] args) {

            logger.info("***");

        try {
            var resultat = 10 / 0; //causes an exception
        } catch (ArithmeticException e) {
            logger.error("Erreur : Division par zéro,", e); // affiche l'exception et sa stack trace dans la console avec le level Error
        }
        logger.warn("Ceci est une mise en garde");
        logger.debug("Message de débogage");
        logger.info("L'application est terminée.");
    }
}
