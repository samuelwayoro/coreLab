package corelab.structurededonnees.poo.heritage.classeabstraite;

public class Chat extends Animal {

    public Chat(String nom) {
        super(nom);
    }

    @Override
    void faireDuBruit() {
        logger.info("{} miaul : miaou miaou", nom);
    }
}
