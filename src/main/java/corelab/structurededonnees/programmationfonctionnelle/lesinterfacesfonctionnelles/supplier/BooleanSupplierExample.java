package corelab.structurededonnees.programmationfonctionnelle.lesinterfacesfonctionnelles.supplier;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.function.BooleanSupplier;

public class BooleanSupplierExample {

    private static final Logger logger = LogManager.getLogger(BooleanSupplierExample.class);

    public static void main(String[] args) {

        /**
         * Retournera un boolean suite à son opération
         */

        BooleanSupplier bs = () -> System.currentTimeMillis() % 2 == 0;
        logger.debug("{} ", bs.getAsBoolean()); //True ou False selon le moment
    }

}
