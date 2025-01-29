package coreLab.structure_de_donnees.lesexceptions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        logger.info("*** program start **** ");

        try {
            int dividByZero = 5 / 0;
            logger.info("division result ");
            logger.info("fin de la division...");

        } catch (ArithmeticException e) {
            logger.debug("trace de la printStackTrace() *** ");
            // e.printStackTrace();//affiche le printstacktrace en ROUGE :)
            logger.debug("trace de getMessage() de l'objet exception ");
            logger.error(e.getMessage());
        } finally {
            logger.warn("Ceci est une mise en garde");
            logger.debug("instruction dans le bloc finally");
            logger.info("L'application est terminée.");
        }
        logger.debug("*** program end *** ");
    }

}
