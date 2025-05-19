package corelab.structurededonnees.programmationfonctionnelle.lesinterfacesfonctionnelles.consumer;

import corelab.structurededonnees.programmationfonctionnelle.lesinterfacesfonctionnelles.consumer.model.Fichier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.function.Consumer;

public class MainConsumer {

    private static final Logger logger = LogManager.getLogger(MainConsumer.class);


    public static void main(String[] args) {


        //Consommer une chaine de caractères
        Consumer<String> print = s -> logger.debug("Texte : {}", s);

        //transformer en majuscule
        Consumer<String> upper = s -> logger.debug(" {}", s.toUpperCase());

        //combinaison des deux consumer ci-dessus à partir de la méthode andThen()
        Consumer<String> combined = print.andThen(upper);

        combined.accept("salut a tout le monde !");


        afficherText("Bonjour à tous , ceci est une utilisation d'un Consumer de String");

        Fichier fichier = new Fichier("petit fichier", "C:/Administrateur/test.txt");
        fichier.affichage(fichier);
    }

    /**
     * Affichage d'un texte dans la sortie standard à partir d'un Consumer
     *
     * @param t
     */
    static void afficherText(String t) {
        Consumer<String> consumer = c -> System.out.println(c);
        consumer.accept(t);
    }

}
