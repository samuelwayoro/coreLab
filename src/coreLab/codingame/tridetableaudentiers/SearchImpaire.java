package coreLab.codingame.tridetableaudentiers;

public class SearchImpaire {

    public static void main(String[] args){
        int[] tableau = new int[]{2,10,18,11,20,12,100};
        boolean res = searchImpaire(tableau);
        System.out.println("resultat de la méthode  : "+res);
    }

    /**
     * recherche une valeur impaire dans le tableau
     */
    static boolean searchImpaire(int[]tab){
        int i = 0;
        while (i < tab.length){
            if (tab[i]%2 == 1){
                System.out.println("indice trouvé   "+i);
                return true;
            }
            i++;
        }
        return false;
    }
}
