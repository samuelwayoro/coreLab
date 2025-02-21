package coreLab.structure_de_donnees.poo.heritage.interfaces.model;

public class Chat implements Animal {
    @Override
    public void faireDuBruit() {
        logger.debug("mioawou miawou");
    }
}
