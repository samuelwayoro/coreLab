package coreLab.structure_de_donnees.programmationfonctionnelle.lesstream;

import java.util.Arrays;

public class FilterWords {

    public static String[] filterWords(String[]words,String letters){

        String[] ws = Arrays.stream(words).filter(s->s.contains(letters)).toArray(String[]::new);

        return  ws;
    }

    public static void main(String[]args){

       /* String[] w = {"she", "was", "the", "queen", "of", "land"};
        w  = filterWords(w,"w");
        Arrays.stream(w).forEach(System.out::println);*/

        String word = "bones";
        System.out.println(word.contains("ba"));

    }
}
