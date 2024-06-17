package coreLab.codingame.problemes;

import java.util.Scanner;

public class ObtenirLaMonnaie {

    public static int []  retourneMonnaie(Integer mtn){

        int dixEuros,deuxEuros,unEuro = 0;
        int[]res = new int[1];

        if(mtn > 0){
            res = new int[3];
            //recup des coupures de 10 eu
            dixEuros = mtn / 10 ;
            res[0] = dixEuros;
            //recup des coupures de 2 euros et 1 euro
            deuxEuros = mtn % 10;

            if ((deuxEuros %2) == 0){ //si le reste est paire
               // System.out.println("rest "+deuxEuros+"   c paire...");

                deuxEuros = deuxEuros / 2;
                res[1] =deuxEuros;
                unEuro = 0;
                res[2] =unEuro;

            }else { //si il est impaire ...
               // System.out.println("rest "+deuxEuros+"  c impaire...");

                int valdeuxEuros = deuxEuros / 2;
                res[1] =valdeuxEuros;
                unEuro = deuxEuros % 2;
               // System.out.println("valeur de 1 euroe  "+unEuro);
                res[2] =unEuro;
            }

        }else {
            res[0] = 0;
        }

        return res;
    }

    public static void main(String[]args){

        int montant = 0 ;
        int[] monnaie = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("entrer le montant pour en obtenir la monnaie");
        montant = sc.nextInt();
        monnaie = retourneMonnaie(montant);
        System.out.println("il y a "+monnaie[0]+"  billet de 10 euros  ");
        System.out.println(" "+monnaie[1]+"  pièces de 2 euros");
        System.out.println("et "+monnaie[2]+"  pièces de 1 euros dans "+montant+" euros...");

/*
        System.out.println(5%2);

         */




    }

}
