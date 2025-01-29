package coreLab.structure_de_donnees.enums;

import coreLab.structure_de_donnees.enums.lesenums.Jour;
import coreLab.structure_de_donnees.enums.lesenums.PointsCardinaux;
import coreLab.structure_de_donnees.enums.lesenums.Sexe;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {


    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        /*
         * Les enums sont des structures de données qui permettent de stoker des valeurs
         * fixent et qui sont utilisables sans une instanciation.
         * Ci-dessous des exemples d'utilisation...
         */
        logger.debug("*** program start *** ");

        System.out.println(Sexe.MASCULIN);

        PointsCardinaux p = PointsCardinaux.NORTH;

        System.out.println(p.getLabel());//affiche son label

        System.out.println(Jour.MARDI.ordinal());//affiche la position de Mardi dans la liste de valeur de l'enum Jour

        //affiche la liste de toutes les valeurs de l'enum Jour
        logger.warn("Enum values list");
        Jour[] jours = Jour.values();
        for (Jour j : jours) {
            System.out.println(j.ordinal() + " " + j);
        }

        logger.debug("*** program end ***");

    }

}
