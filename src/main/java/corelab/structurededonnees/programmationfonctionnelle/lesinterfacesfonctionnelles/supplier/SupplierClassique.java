package corelab.structures_de_donnees.programmationfonctionnelle.lesinterfacesfonctionnelles.supplier;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.function.Supplier;

public class SupplierClassique {

    private static final Logger logger = LogManager.getLogger(SupplierClassique.class);

    public static void main(String[] args) {

        Supplier<String> greet = () -> "Bonjour ! ";

        logger.debug(" {}", greet.get()); // Bonjour !

    }
}
