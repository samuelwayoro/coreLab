package corelab.structures_de_donnees.programmationfonctionnelle.lesinterfacesfonctionnelles.predicat.bipredicate;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.function.BiPredicate;

public class Main {

    private static Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        testBiPredicate("Bonjour", "on");


        String prenom = "Blaise";
        testBiPredicate(prenom, "Samuel");


        /**
         * Vérifier si un mot contient un caractère
         */
        verifCaractere("Bonjour", 'x');
    }


    /**
     * verifi si a contient b a l'aide d'un BiPredicate
     *
     * @param a
     * @param b
     */
    static void testBiPredicate(String a, String b) {
        BiPredicate<String, String> bp1 = (String s1, String s2) -> s1.contains(s2);
        System.out.println("resulat de testBipredicate : " + bp1.test(a, b));
    }

    /**
     * Vérifie si un caractère est présent dans un mot donné
     *
     * @param word
     * @param c
     */
    static void verifCaractere(String word, Character c) {

        //pour ne pas avoir de soucis liés à la casse
        String mots = word.toLowerCase();

        //converti le mot donné en tableau de caractère
        char[] characters = mots.toCharArray();

        //reponse de test
        boolean response = false;

        //Définir un biPredicate permettant de verifier la présence d'un caractère dans un tableau de caractère
        BiPredicate<Character, Character> characterPresence = (a, b) -> a.equals(b);

        for (int i = 0; i < characters.length; i++) {
            response = characterPresence.test(characters[i], c);
            if (response)
                break;
        }

        if (response)
            logger.debug(" {}   le mot  {} contient le caractère {} ", response, word, c);
        else
            logger.debug("{} le mot {} ne contient pas le caractère {} ", response, word, c);
    }

}
