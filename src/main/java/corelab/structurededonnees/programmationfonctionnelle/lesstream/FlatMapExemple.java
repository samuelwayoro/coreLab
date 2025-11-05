package corelab.structures_de_donnees.programmationfonctionnelle.lesstream;

import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapExemple {

    /**
     * FlatMap() sert à aplatir un Stream de sous-éléments (souvent des éléments de collections) en un
     * Stream plat d'éléments uniques.
     * Autrement, dit-il permet de transformer une sous-collection de données d'un stream en un seul stream.
     *
     * - QUAND L'UTILISER :
     * FlatMap s'utilise lorsque chaque élément d'un stream contient une collection (fréquemment une liste, ou une liste de liste)
     * et qu'on aimerait extraire comme une seule séquence continue, c'est-à-dire en un seul Stream.
     */


    /**
     * Exemple 1 : Imprimer une collection de Collection d'objets (liste de liste dans cet exemple)
     */
    static void sansFlatMap(List<List<String>> listeDeListe) {

        //sans FlatMap
        Stream<List<String>> stream1 = listeDeListe.stream();
        stream1.forEach(System.out::println); //affiche les deux listes distinctement : [One,two] [three,Four]

    }

    /**
     * Exemple 2 : Imprimer une collection de collection d'objets (liste de liste) directement avec FlatMap
     *
     * @param listOfLists
     */
    private static void avecFlatMap(List<List<String>> listOfLists) {

        Stream<List<String>> stream1 = listOfLists.stream();
        stream1.flatMap(Collection::stream).forEach(System.out::println); //affiche toutes les listes dans un seul stream
    }

    /**
     * Récupérer tous les emails uniques d'une collection de User (ayant au préalable chacun une liste d'emails)
     * les trie et les affiche dans la console.
     * NB : utilise distinct pour supprimer les doublons
     *
     */
    private static void exercice(List<User> userList) {

        userList.stream()
                .flatMap(u -> u.getEmails().stream())
                .distinct()
                .sorted()
                .forEach(System.out::println);

    }


    public static void main(String[] args) {

        //déclarons une liste de liste contenant des chaines de caractères
        List<List<String>> listOfLists;
        listOfLists = List.of(
                List.of("One", "Two"),
                List.of("three", "Four")
        );

        List<User> users = List.of(
                new User("Alice", List.of("alice@gmail.com", "alice@outlook.com")),
                new User("Bob", List.of("bob@gmail.com", "alice@outlook.com")),
                new User("Charly", List.of("charly@gmail.com", "charly@outlook.com", "alice@outlook.com"))
        );


        sansFlatMap(listOfLists);

        System.out.println("*******");

        avecFlatMap(listOfLists);

        System.out.println("*******");
        exercice(users); //affiche alice@gmail.com alice@outlook.com bob@gmail.com charly@gmail.com charly@outlook.com
    }


}
