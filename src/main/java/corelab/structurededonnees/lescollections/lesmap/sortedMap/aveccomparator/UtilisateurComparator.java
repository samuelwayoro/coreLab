package corelab.structures_de_donnees.lescollections.lesmap.sortedMap.aveccomparator;

import java.util.Comparator;

public class UtilisateurComparator implements Comparator<Utilisateur> {
    @Override
    public int compare(Utilisateur o1, Utilisateur o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
