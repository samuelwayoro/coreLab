package corelab.structurededonnees.lescollections.classesutilitaires.arraysetcollections.comparatoretcomparable;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExempleComparator {

    private static final Logger logger = LogManager.getLogger(ExempleComparable.class);

    public static void main(String[] args) {

        List<Personne> personList = new ArrayList<>();

        personList.add(new Personne("Sam", 36));
        personList.add(new Personne("Jessica", 42));
        personList.add(new Personne("Isaac", 32));
        personList.add(new Personne("Logan", 38));
        personList.add(new Personne("Arnold", 37));

        //trie croissant à partir des ages des éléments de la liste en utilisant l'interface Comparator
        Comparator<Personne> ageComparison = (Personne p1, Personne p2) -> p1.getAge() - p2.getAge();

        Collections.sort(personList, ageComparison);

        logger.debug("{}", personList); //[Isaac(32), Sam(36), Arnold(37), Logan(38), Jessica(42)]

    }

}
