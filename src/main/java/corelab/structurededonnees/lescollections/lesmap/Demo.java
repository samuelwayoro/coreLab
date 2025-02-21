package corelab.structurededonnees.lescollections.lesmap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public class Demo {
    private static final Logger logger = LogManager.getLogger(Demo.class);

    public static void main(String[] args) {

        //création d'une table de hachage
        Map<String, Integer> ageMap = new HashMap<>();

        //ajout de données
        ageMap.put("Alice", 25);
        ageMap.put("Bob", 30);
        ageMap.put("Charlie", 28);

        //accès rapide à une valeur via sa clé
        logger.debug("Age de Bob = {} ans", ageMap.get("Bob")); // affiche Age de Bob = 30 ans

        //vérif de l'existance d'une clé
        logger.debug("Alice est elle présente ? {}", ageMap.containsKey("Alice")); //affiche true

        //parcours de la hashMap avec le pattern de Map.entry
        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
            logger.debug("clé : {}  valeur : {}", entry.getKey(), entry.getValue());
        }

        /***
         * exemple avec une deuxième Map (table de hachage)
         */

        Map<Integer, String> departements = new HashMap<>();
        departements.put(75, "Paris");
        departements.put(50, "Manche");
        departements.put(59, "Nord");
        departements.put(33, "Gironde");
        departements.put(83, "Var");

        departements.put(59,"nord"); // écrase la valeur Nord par nord

        departements.putIfAbsent(59,"Nord");// ajoutera seulement si la clé 59 est absente ou si présente, mais à une valeur null

        departements.replace(75,"paris"); // remplace Paris par paris

        departements.remove(33);//supprime la valeur "Gironde" de la map

        departements.containsKey(50);//vérifie la présence de "Manche" --> retourne true

        departements.containsValue("Manche"); // vérifie la présence de la valeur "Manche"




    }
}
