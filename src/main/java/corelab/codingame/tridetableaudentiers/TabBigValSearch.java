package corelab.codingame.tridetableaudentiers;

/***
 * ecrire un algorithme qui recherche une valeur dans un tableau et retourne son indice une fois
 * la valeur trouvee
 */
public class TabBigValSearch {

    public static void main(String[] args){

    int valeur = 700;
    int[] monTableau = new int[] {15,20,50,100,550,276,158,700};
     int v =   search(monTableau,valeur);
        System.out.println("resultat de l'algo   "+v);
    }

    public static int search(int [] t , int val){
        int i =0 ,indice = -1;
        while (i < t.length && indice == -1){
           // System.out.println(t[i]);
            if(t[i] == val){
                indice = i;
            }
            i++;
        }
        return indice;
    }
}
