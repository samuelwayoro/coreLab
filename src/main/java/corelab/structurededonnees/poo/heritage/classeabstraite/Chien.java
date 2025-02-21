package corelab.structurededonnees.poo.heritage.classeabstraite;

public class Chien extends Animal {

    public Chien(String nom) {
        super(nom);
    }

    @Override
    void faireDuBruit() {
        logger.info("{} aboie : woof woof", nom);
    }
}
