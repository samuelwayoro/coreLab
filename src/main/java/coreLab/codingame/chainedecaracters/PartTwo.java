package coreLab.codingame.chainedecaracters;

public class PartTwo {

    /**
     * Écrivez une méthode qui inverse une chaîne.
     */

    public static String reverse(String str){
        //on le realise avec un objet StringBuilder
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }


    public static void main(String[]args){

        String rev = reverse("WayToLearnX");
        System.out.print(rev);

    }



}
