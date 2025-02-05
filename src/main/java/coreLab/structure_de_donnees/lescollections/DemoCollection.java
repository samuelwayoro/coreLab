package coreLab.structure_de_donnees.lescollections;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Collection;

public class DemoCollection {

    private static final Logger logger = LogManager.getLogger(DemoCollection.class);

    public static void main(String[] args) {

        //créer une collection de type List
        Collection<String> prenoms = new ArrayList<String>();

        //ajout d'éléments
        prenoms.add("Alice");
        prenoms.add("Bob");
        prenoms.add("Charlie");

        //Affichage de la collection
        logger.debug(prenoms); //affiche dans l'ordre d'insertion : alice,bob,charlie

        //suppresion d'un élément
        prenoms.remove("Bob");

        //vérif de la présence d'un élément
        logger.debug("{}", prenoms.contains("Bob")); //false, puisque préalablement supprimé

        //parcours de la boucle
        for (String prenom : prenoms) {
            logger.debug("---> {}", prenom); // affiche ---> Alice , ----> Charlie
        }


    }
}
