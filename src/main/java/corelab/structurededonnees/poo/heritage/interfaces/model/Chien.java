package corelab.structurededonnees.poo.heritage.interfaces.model;

public class Chien implements Animal {
    @Override
    public void faireDuBruit() {
        logger.debug("wouf wouf ");
    }
}
