package corelab.codingame.tridetableaudentiers;

import java.util.Scanner;

public class TableauIntelligent {

    public static int[] remplireTableau(int taille , int[] tab){
        int i  = 0 ;
        int val = 0;
        Scanner sc = new Scanner(System.in);
        while ( i < taille){
            System.out.println("entrer un nombre ");
            val = sc.nextInt();
            tab[i]  = val;
            i++;
        }
        return  tab;
    }

    public static int plusGrandeValeur(int[]tab){
        int max = tab[0];
        for (int i =0 ; i <tab.length;i++){
            if(max < tab[i])
                max = tab[i];
        }

        return max;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int taille = 0;
        int[] leTableau = new int[0];
        System.out.println("la taille du tableau a creer...");
        taille = sc.nextInt();
        leTableau = remplireTableau(taille,new int[taille]);

        //afficher le contenu du tableau
        /*
        System.out.println("le contenu du tableau : ");
        for (int x = 0 ;x < leTableau.length;x++){
            System.out.println(leTableau[x]);
        }

         */
        System.out.println("****************");

        System.out.println("la plus grande valeure du tableau est  :"+plusGrandeValeur(leTableau));

    }

}
