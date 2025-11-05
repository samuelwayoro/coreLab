package corelab.structures_de_donnees.programmationfonctionnelle.lesinterfacesfonctionnelles.supplier;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.function.DoubleSupplier;

public class DoubleSupplierExample {

    private static final Logger logger = LogManager.getLogger(DoubleSupplierExample.class);

    public static void main(String[] args) {

        DoubleSupplier random = () -> Math.random() * 100;

        logger.debug("{}", random.getAsDouble());
    }
}
