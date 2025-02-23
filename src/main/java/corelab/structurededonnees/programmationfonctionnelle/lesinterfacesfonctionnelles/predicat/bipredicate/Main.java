package corelab.structurededonnees.programmationfonctionnelle.lesinterfacesfonctionnelles.predicat.bipredicate;

import java.util.function.BiPredicate;

public class Main {

    public static void main(String[] args) {

        testBiPredicate("Bonjour", "on");

        String prenom = "Blaise";
        testBiPredicate(prenom, "Samuel");
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

}
