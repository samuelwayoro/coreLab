package coreLab.structure_de_donnees.poo.heritage.interfaces;

import coreLab.structure_de_donnees.poo.heritage.interfaces.model.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo {

    static final Logger logger = LogManager.getLogger(Demo.class);

    public static void main(String[] args) {

        Animal monChien = new Chien();
        Animal monChat = new Chat();

        monChien.faireDuBruit();
        monChat.faireDuBruit();

        //utilisation de méthode statique et méthode par default d'interface (depuis java 8)

        Humain unHomme = new Homme("Wayoro", 36);

        //cas d'une méthode par défaut
        unHomme.identite();

        //cas d'une méthode statique
        logger.debug("{}", Humain.enVie());

        //cas de constante
        logger.debug(" Race : {} ", Humain.RACE);


    }

}
