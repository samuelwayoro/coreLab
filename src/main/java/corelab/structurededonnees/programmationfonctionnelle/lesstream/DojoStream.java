package corelab.structurededonnees.programmationfonctionnelle.lesstream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DojoStream {

    public static void main(String... args) {
        List<Integer> numbers = Arrays.asList(-1, 3, 5, 7, 9, 2, 4, 6, 8);
        List<String> names = Arrays.asList("Java", "PHP", "Javascript", "Python", "Scalla", "Go", "C", "Cobol");

        //creer un stream a partir d'un tableau grâce a la classe utilitaire Arrays
        String[] mots = {"one", "three", "two"};
        Arrays.stream(mots);


        //MAP
        List<Integer> mappedNumbersList = numbers.stream().map(x -> x * x).collect(Collectors.toList());
        // System.out.println("mappedNumberList "+mappedNumbersList);
        List<String> mappedNamesList = names.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
        // System.out.println("mappedNamesList "+mappedNamesList);

        //COLLECT
        List<Integer> squaredNumber = numbers.stream().map(x -> x * x).collect(Collectors.toList());
        //  System.out.println("squaredNumber "+squaredNumber);

        //SORTED
        List<Integer> sortedNumber = numbers.stream().sorted().collect(Collectors.toList());
        //  System.out.println("sortedNumber "+sortedNumber);
        List<String> sortedNames = names.stream().sorted().collect(Collectors.toList());
        //   System.out.println("sortedNames "+sortedNames);
        //SORTED DESC : decroissant
        System.out.println("*********************");
        List<Integer> descSortedNumber = numbers.stream().sorted(
                (n1, n2) -> {
                    System.out.printf("sort: %s; %s\n", n1, n2);
                    return n2.compareTo(n1);
                }).collect(Collectors.toList());
        System.out.println("*********************");

        System.out.println("descSortedNumbers " + descSortedNumber);
        List<String> descSortedNames = names.stream().sorted((n1, n2) -> {
            return n2.compareToIgnoreCase(n1);
        }).collect(Collectors.toList());
        //  System.out.println("descSortedNames "+descSortedNames);


        nfoisUnMot(10, "Bonjour");
    }


    /**
     * Retourne un mot passé en paramètre le nombre de fois voulu
     * gràce à la classe utilitaire IntStream
     *
     * @param n
     * @param mots
     */
    static void nfoisUnMot(int n, String mots) {
        IntStream.range(0, n).mapToObj(x -> mots).forEach(System.out::println);
    }


}
