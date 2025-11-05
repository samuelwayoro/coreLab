package corelab.structures_de_donnees.programmationfonctionnelle.lesinterfacesfonctionnelles.consumer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.function.IntConsumer;

public class IntConsumerExample {

    private static final Logger logger = LogManager.getLogger(IntConsumerExample.class);

    public static void main(String[] args) {
        IntConsumer square = n -> logger.debug("le carré de {} est {}", n, n * n);
        square.accept(4);
    }

}
