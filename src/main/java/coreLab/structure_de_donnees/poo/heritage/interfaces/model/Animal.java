package coreLab.structure_de_donnees.poo.heritage.interfaces.model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public interface Animal {

    static Logger logger = LogManager.getLogger(Animal.class);

    void faireDuBruit();
}
