package corelab.structures_de_donnees.programmationfonctionnelle.lesinterfacesfonctionnelles.predicat;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class MainPredicat {

    private static Logger logger = LogManager.getLogger(MainPredicat.class);

    public static void main(String[] args) {


        /**
         * Déclarer un prédicate qui vérifie que
         * la longeure d'une chaine de caractère est plus grand que 5
         */
        Predicate<String> isLong = s -> s.length() > 5;

        /**
         * Vérifie si une chaine de caractère commence par la lettre "A"
         */
        Predicate<String> startWithA = s -> s.startsWith("A");

        /**
         * Déclarer un Predicate qui combine les deux ci-dessus
         * qui vérifie la longeur d'une chaine de caractère et aussi qui commence par la lettre "A"
         */

        Predicate<String> combined = isLong.and(startWithA);

        logger.debug(" le mot Applejuice commence par la lettre A et contient + de 6 lettres : {}", combined.test("Applejuince"));

        logger.debug("Le mot Apple commence il par la lettre A et contient + de lettres : {}", combined.test("Apple"));


        /**
         *  Exemple d'utilisation de IntPredicate pour éviter l'autoboxing
         */
        IntPredicate isPositive = n -> n > 0;

        logger.debug("le chiffre 10 est il positif : {}", isPositive.test(10));

        logger.debug("le chiffre -5  est il positif ? : {} ", isPositive.test(-5));


        /**
         * Negate, un Predicate inverser une condition
         */

        Predicate<Integer> estPaire;
        estPaire = n -> n % 2 == 0;

        Predicate<Integer> estImpaire = estPaire.negate();

        logger.debug("le chiffre 10 est il impaire ? {}", estImpaire.test(10));

        // estPaire(21);

        // nombrePremier(9);

        System.out.println(testRechercheNoms(Arrays.asList("Wayoro", "Badobré", "Blaise", "Samuel"), "Samuel"));


    }

    /**
     * verifier si un nombre est paire avec un Predicate<Integer>
     *
     * @param nombre
     */
    static void estPaire(Integer nombre) {
        Predicate<Integer> predicate = i -> i % 2 == 0;
        System.out.println("le nombre est il paire ? " + predicate.test(nombre));
    }

    /**
     * Vérifie si un nombre est un nombre PREMIER
     * <p>
     * Un nombre premier est un nombre supérieur à 1 divisible uniquement par lui-même et par 1.
     * Sont ainsi : 2,3,5,7,11,13,17,19,23,29 etc..
     *
     * @param i
     */
    static void nombrePremier(Integer i) {

    }

    /**
     * Vérifier si un élément de la liste satisfait à une
     * condition donnée
     *
     * @param noms
     * @param nom
     * @return
     */
    static boolean testRechercheNoms(List<String> noms, String nom) {
        // noms.stream().forEach(n -> System.out.println(n.equalsIgnoreCase(nom))); //debugging
        return noms.stream().anyMatch(n -> n.equalsIgnoreCase(nom));
    }
}
