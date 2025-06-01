package corelab.structurededonnees.programmationfonctionnelle.lesinterfacesfonctionnelles.function;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class MainFunction {

    private static final Logger logger = LogManager.getLogger(MainFunction.class);

    public static void main(String[] args) {

        /**
         * Imaginez qu'on veuille renvoyer, la longeur d'une chaîne de caractère ?
         */
        Function<String, Integer> stringLength = s -> s.length();

        logger.debug("le mot : Merci à  {}  lettres  ", stringLength.apply("Merci"));

        /***
         * Exemple avec chaînage
         ***/

        UnaryOperator<Integer> doubleInt = n -> n * 2;

        //chaînage : Longeur, puis multiplication par 2
        Function<String, Integer> combined = stringLength.andThen(doubleInt);

        logger.debug("{}", combined.apply("Merci")); //affiche 10

    }


}
