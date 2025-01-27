package coreLab.structure_de_donnees.enums;

import coreLab.structure_de_donnees.enums.lesenums.Couleurs;
import coreLab.structure_de_donnees.enums.lesenums.Jour;
import coreLab.structure_de_donnees.enums.lesenums.PointsCardinaux;
import coreLab.structure_de_donnees.enums.lesenums.Sexe;

public class Main {

    public static void main(String[] args) {
        /*
         * Les enums sont des structures de données qui permettent de stoker des valeurs
         * fixent et qui sont utilisables sans une instanciation.
         * Ci-dessous des exemples d'utilisation...
         */

        System.out.println(Sexe.MASCULIN);

        PointsCardinaux p = PointsCardinaux.NORTH;

        System.out.println(p.getLabel());//affiche son label

        System.out.println(Jour.MARDI.ordinal());//affiche la position de Mardi dans la liste de valeur de l'enum Jour

        //affiche la liste de toutes les valeurs de l'enum Jour
        System.out.println("liste des valeurs de l'enum Jour");
        Jour[] jours = Jour.values();
        for (Jour j : jours) {
            System.out.println(j.ordinal() + " " + j);
        }
    }

}
