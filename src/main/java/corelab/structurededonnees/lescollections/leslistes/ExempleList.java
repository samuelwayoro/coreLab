package corelab.structures_de_donnees.lescollections.leslistes;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ExempleList {

    private static final Logger logger = LogManager.getLogger(ExempleList.class);

    public static void main(String[] args) {

        logger.debug("*** UTILISATION DE ARRAYLIST ***");

        List<String> fruits = new ArrayList<>();

        fruits.add("Pomme");
        fruits.add("Banane");
        fruits.add("Orange");
        fruits.add("Pomme"); // doublon autorisé

        logger.debug("{}", fruits.get(0)); //affiche : Pomme

        logger.debug("Parcours de la liste fruits : ");

        //parcourir la liste
        for (String fruit : fruits) {
            logger.debug(fruit); //affiche Pomme,Banane,Orange,Pomme
        }


        //supprimer le premier élémént (Pomme) rencontré dans la liste
        fruits.remove("Pomme");

        logger.debug("----------------");

        for (String fruit : fruits) {
            logger.debug(fruit); //affiche Banane,Orange,Pomme
        }

        //afficher la taille de la List :
        logger.debug(" taille de la liste : {}", fruits.size()); //affiche 3


        logger.debug("*** UTILISATION DE LinkedList (meilleure pour les modifs fréquentes : ***");
        LinkedList<Integer> nombres = new LinkedList<>();
        //ajout d'éléments
        nombres.add(10);
        nombres.add(20);
        nombres.add(30);

        //ajouter un élément au début (LinkedList optimisé pour cela)
        nombres.addFirst(5);

        //supprimer le prémier élément
        nombres.removeFirst();

        //afficher la taille
        logger.debug("taille de notre LinkedList : {} ", nombres.size());//affiche 3

        //modifier un élément dans un list
        nombres.set(0, 9);//remplace 10 par 9

        logger.debug("{}", nombres.get(0)); //affiche maintenant 9


        //Utilisation de Iterator pour parcourir les Liste TOUJOURS AVEC UNE BOUCLE WHILE()
        logger.info("UTILISATION DE ITERATOR SUR UNE LIST");
        List<String> prenoms = new ArrayList<>();
        prenoms.add("Ange");
        prenoms.add("Logan");
        prenoms.add("yves");
        prenoms.add("Samuel");
        prenoms.add("Isaac");
        Iterator<String> iterator = prenoms.iterator();
        while (iterator.hasNext()) {
            logger.debug("{}", iterator.next()); //affichera bien tous les prénoms en gardant l'ordre d'insertion
        }

    }
}
