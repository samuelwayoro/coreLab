package corelab.structurededonnees.lescollections.lesmap.sortedMap.aveccomparable;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        Document document1 = new Document(1, "CNI", "22/02/2025");
        Document document2 = new Document(2, "Passeport", "15/02/2022");

        logger.debug("le document le plus ancien est {} ", document1.compareTo(document2) > 0 ? document1.getName() : document2.getName());

    }
}
