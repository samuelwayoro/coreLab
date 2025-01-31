package coreLab.codingame.problemes;

import java.util.Scanner;

public class ValeurAsciiDunCaracter {

    public static void main(String[]args){

        int chr = 'X';
        char value ;
        Scanner sc = new Scanner(System.in);
        System.out.println("saisir une lette de l'alphabet ");
        value = sc.next().charAt(0);
        sc.nextDouble();
        chr= value;

        System.out.println("la valeur ascii de chr est "+chr);
    }

}
