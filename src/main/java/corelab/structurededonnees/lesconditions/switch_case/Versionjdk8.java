package corelab.structurededonnees.lesconditions.switch_case;

public class Versionjdk8 {

    public static void main(String[] args) {
        var chiffre = 8;

        switch (chiffre) {
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("Invalide");
                break;
            default:
                System.out.println("aucune valeur"); //s'affichera
        }
    }
}
