package corelab.structures_de_donnees.programmationfonctionnelle.lesinterfacesfonctionnelles.function.variantes;

import java.util.Arrays;
import java.util.function.IntFunction;

public class MainIntFunction {

    public static void main(String[] args) {

        IntFunction<String> intToString = i -> "Numéro " + i;

        System.out.println(intToString.apply(7));

        //avoir le carré des 10 premiers chiffres
        System.out.println(" *** le carré des chiffres allant de 1 à 10 *** ");
        Integer[] carrees = nPremierCarreParfait(10);
        Arrays.stream(carrees).forEach(System.out::println);
    }


    /***
     * retourne le carré des n nombres (0 jusqu'à n) passés en paramètres
     * @param n
     * @return
     *
     * 1. Instancie un IntFunction permettant de transformer un nombre donné en son carré
     * 2. déclare un tableau qui va contenir les n carrés attendu (tableau de taille n)
     * 3. executer dans une bouble n fois notre IntFunction
     */
    private static Integer[] nPremierCarreParfait(int n) {

        IntFunction<Integer> square = i -> i * i;

        Integer[] squares = new Integer[n];

        for (int i = 0; i < n; i++) {
            squares[i] = square.apply(i + 1);
        }

        return squares;
    }


}
