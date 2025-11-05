package corelab.structures_de_donnees.lescollections.lesmap.sortedMap.aveccomparator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        Utilisateur utilisateur1 = new Utilisateur(1, "Samuel", 36);
        Utilisateur utilisateur2 = new Utilisateur(2, "Christelle", 29);
        UtilisateurComparator uc = new UtilisateurComparator();
        logger.debug(" le plus agé de {} et {} est {}", utilisateur1.getName(), utilisateur2.getName(), comparateur(uc, utilisateur1, utilisateur2));

    }

    public static String comparateur(UtilisateurComparator uc, Utilisateur u1, Utilisateur u2) {
        int res = uc.compare(u1, u2);
        return (res > 0) ? u1.getName() : u2.getName();
    }

}
