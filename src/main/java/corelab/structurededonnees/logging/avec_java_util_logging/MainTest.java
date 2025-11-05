package corelab.structures_de_donnees.logging.avec_java_util_logging;

import java.util.logging.Level;
import java.util.logging.Logger;

/***
 * - Déclaration d'une propriété Logger : utilisée pour générer les messages
 * - Niveaux de log :
 *      - .INFO() : Message général pour informer l'utilisateur
 *      - .WARNING() : mise en garde (exemple, risque de problème)
 *      - .SEVERE() : Erreurs graves qui nécessitent une attention immédiate
 *
 * - Exception : utilisation de Level.SEVERE() : pour enregistrer une exception avec son stack trace .
 */

public class MainTest {

    private static final Logger logger = Logger.getLogger(MainTest.class.getName());

    public static void main(String[] args) {

        logger.info("Application démarré ");

        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            logger.log(Level.SEVERE, "Une erreur s'est produite : Division par 0 ", e);
        }
        logger.warning("Ceci est un message de mise en garde");
        logger.info("Application terminée.");
    }
}