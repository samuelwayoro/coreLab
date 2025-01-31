package coreLab.codingame.tridetableaudentiers;

public class SommeDesValeursDunTableau {

    /***
     * somme de toutes les valeurs d'un tableau
     * @param tab
     * @return
     */
    static Integer somme1(int[]tab){
        int i =0;
        int som = 0;
        while (i< tab.length){
            som = som+tab[i];
            i++;
        }
        return som;
    }

    /**
     * somme des valeurs allant de à n
     * @param n
     * @return
     */
    static Integer sommeUnaN(int n) {
        int i =0 , somme = 0;
        while (i <=n){
            somme = somme +i;
            i++;
        }
        return  somme;
    }

    static Integer sommeUneaUnOptimisee (int n){
        int s = n*(n+1);
        s = s/2;
        return s;
    }




    public static void main(String[]args){
        System.out.println("somme de 0 jusqua 3  ="+sommeUnaN(3));
        System.out.println("somme de 0 jusqua 3 optimisée  = "+sommeUneaUnOptimisee(3));
    }
}
