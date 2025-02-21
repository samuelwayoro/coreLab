package coreLab.structure_de_donnees.poo.heritage.interfaces.model;

public class Chien implements Animal {
    @Override
    public void faireDuBruit() {
        logger.debug("wouf wouf ");
    }
}
