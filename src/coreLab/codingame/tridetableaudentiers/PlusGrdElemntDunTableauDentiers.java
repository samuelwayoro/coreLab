package coreLab.codingame.tridetableaudentiers;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.logging.Logger;

public class PlusGrdElemntDunTableauDentiers {

    /**
     *Écrivez une méthode qui renvoie le plus grand entier dans un tableau.
     *
     * Vous pouvez supposer que le tableau contient au moins un élément.
     */


    public static void main(String[]args){

        Integer[] tableauEntier = {1,2,9,15,-5,1000,0,-1};

        List<Integer> listeDentier =  Arrays.asList(tableauEntier);

        listeDentier.sort((o1, o2) -> o1.compareTo(o2));


        int min = listeDentier.get(0);

        int max = listeDentier.get(listeDentier.size()-1);

        System.out.println("le plus petit nombre "+min);
        System.out.println("le plus grand nombre  "+max);


    }

}
