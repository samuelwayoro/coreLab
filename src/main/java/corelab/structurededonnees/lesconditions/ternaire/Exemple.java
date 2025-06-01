package corelab.structurededonnees.lesconditions.ternaire;

import java.util.Scanner;

public class Exemple {
    /**
     * Contrairement à if et switch , l'opérateur ternaire est une expression. Comme tous les opérateurs,
     * son résultat est assignable dans une variable. Donc ce n'est pas exactement une structure de contrôle, mais son
     * utilisation est très similaire à l'utilisation d'un if/else.
     * <p>
     * Sa syntaxe est :
     * TypeVariable nomVariable = condition ? valeurRetournee1 : valeurRetournee2 ;
     */

    public static void main(String[] args) {

        var saisieUtilisateur = new Scanner(System.in);

        System.out.println("Veuillez entrer votre âge ");
        int userAge = saisieUtilisateur.nextInt();

        System.out.println("*** execution avec la méthode codeAvecIfElse ***");
        codeAvecIfElse(userAge);

        System.out.println("*** execution avec la méthode opTernaire ***");
        opTernaire(userAge);

    }


    public static void codeAvecIfElse(Integer age) {
        if (age >= 18)
            System.out.println("Vous êtes majeur ...");
        else
            System.out.println("Vous êtes mineur");
    }

    public static void opTernaire(Integer age) {
        var isMajeurOrMineur = age >= 18 ? "Vous êtes Majeur" : "Vous êtes Mineur";
        System.out.println(isMajeurOrMineur);
    }
}
