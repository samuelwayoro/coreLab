package corelab.structurededonnees.programmationfonctionnelle.lesinterfacesfonctionnelles.function;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        testFunction("Hello World");
    }

    /**
     * Renvoyer la longeur d'une chaine de caractère (une phrase) 0 l'aide d'un
     * Function<String>
     */
    static void testFunction(String s) {
        Function<String, Integer> f1 = x -> x.length();
        System.out.println("resultat de testFunction : " + f1.apply(s));
    }

}
