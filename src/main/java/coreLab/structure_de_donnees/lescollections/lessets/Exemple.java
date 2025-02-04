package coreLab.structure_de_donnees.lescollections.lessets;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashSet;
import java.util.Set;

public class Exemple {

    private static final Logger logger = LogManager.getLogger(Exemple.class);

    public static void main(String[] args) {


        Set<String> fruits = new HashSet<>();

        fruits.add("Pomme");
        fruits.add("Banane");
        fruits.add("Orange");
        fruits.add("Pomme");//Dupliqué, ne sera pas ajouté...

        //affichage des éléments du Set fruits

        logger.debug(fruits); //affiche : [Banane,Pomme,Orange] (ordre non garanti)

        //vérifier si un élément est dans le Set
        logger.debug(fruits.contains("Banane")); // affiche : true

        //supprimer l'élément Orange
        fruits.remove("Orange");

        //Taille du set
        logger.debug("{}", fruits.size());// affiche 2
    }

}
