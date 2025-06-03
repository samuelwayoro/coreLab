package corelab.structurededonnees.programmationfonctionnelle.lesstream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class GenererDynamiquement {

    /***
     * On peut générer dynamiquement des données les streams , sans passer par une collection existante
     */

    /**
     * Génère un stream infini basé sur une fonction qui fourni une valeur a chaque appel
     * Dans cet exemple : Générer 5 nombres aléatoires et les affiche dans la sortie standard
     * Attention : sans limits , ce stream ne s'arrête jamais !
     */
    static void avecStremGenerate() {
        System.out.println("*** générer 5 nombres aléatoires et les afficher .... ***");
        Stream.generate(Math::random).limit(5).forEach(System.out::println);
    }

    /**
     * Créer un stream en partant d'une valeur initiale (seed), puis une fonction pour générer les suivantes.
     * Exemple : Générer les 10 premiers multiples de 2
     */
    static void avecIterate() {
        System.out.println("*** génerer les 10 premier multiples de 2 ***");
        Stream.iterate(2, n -> n + 2).limit(10).forEach(System.out::println);
    }

    /**
     * Attention le code ci-dessous n'est possible que depuis java 9
     */
    static void iterateAvecCondition() {
        System.out.println("*** générer les 10 premier chiffres ***");
        Stream.iterate(0, x -> x < 10, x -> x + 1).forEach(System.out::println);
    }

    /***
     * Générer des chiffres allant d'un chiffre x à un autre z (non inclus)
     * exemple ici : de 1 à 5
     */
    static void avecIntStream() {
        System.out.println("--- générer des chiffres allant de 1 à 5 --- ");
        IntStream.range(1, 6).forEach(System.out::println);
    }


    /**
     * Génerer un stream de données quelconques (String, Int)
     * à partir de Stream.of()
     */
    static void avecStreamOf() {
        System.out.println("*** Générer un stream de données *** ");
        Stream.of("java", "Python", "Go", "php", ".Net").forEach(System.out::println);
    }

    /**
     * Récupérer le contenu d'un fichier
     * et l'afficher dans la sortie standard
     *
     * @param filePath
     */
    static void avecFileLines(String filePath) {
        System.out.println("Afficher le contenu du fichier : ");
        try {
            Files.lines(Path.of(filePath)).forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) {

        avecStremGenerate();
        System.out.println("xxxxx");

        avecIterate();
        System.out.println("xxxxx");

        iterateAvecCondition();
        System.out.println("xxxxx");

        avecIntStream();
        System.out.println("xxxxx");

        avecStreamOf();
        System.out.println("XXXXXX");

        avecFileLines("D:\\IntelliJJavaProject\\coreLab\\src\\main\\java\\corelab\\structurededonnees\\programmationfonctionnelle\\lesstream\\fichier.txt");

    }
}
