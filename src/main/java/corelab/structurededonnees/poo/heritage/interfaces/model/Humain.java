package corelab.structurededonnees.poo.heritage.interfaces.model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public interface Humain {

    Logger logger = LogManager.getLogger(Humain.class);

    static final String RACE = "Humaine";

    static String enVie() {
        return "je respire";
    }

    static String decede() {
        return "je ne respire plus";
    }

    default void identite() {
        logger.debug("Je suis un humain");
    }

}
