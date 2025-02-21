package coreLab.structure_de_donnees.poo.heritage.classeabstraite;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Animal {

    public static Logger logger = LogManager.getLogger("Animal");
    String nom;

    //contructeur
    public Animal(String nom) {
        this.nom = nom;
    }

    //Méthode abstraite, à implémenter obligatoirement dans les sous-classes
    abstract void faireDuBruit();

    //Méthode concrète déjà implémentée
    public void dormir() {
        logger.info("{} dort...", nom);
    }



}
