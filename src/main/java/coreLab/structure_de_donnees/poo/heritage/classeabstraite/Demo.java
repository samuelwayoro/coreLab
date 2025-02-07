package coreLab.structure_de_donnees.poo.heritage.classeabstraite;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo {

    private static final Logger logger = LogManager.getLogger(Demo.class);

    public static void main(String[] args) {


        Animal chien = new Chien("Rex");

        chien.faireDuBruit();
        chien.dormir();

        logger.debug("**** ");

        Animal chat = new Chat("Milou");
        chat.faireDuBruit();
        chat.dormir();


    }
}
