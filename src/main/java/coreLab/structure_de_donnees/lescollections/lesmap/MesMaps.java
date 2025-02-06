package coreLab.structure_de_donnees.lescollections.lesmap;

import java.util.HashMap;
import java.util.Map;

public class MesMaps {
    public static void main(String[]args){
        Map<Integer,String> maMap = new HashMap<>();

        maMap.put(75,"Paris");
        maMap.put(50,"Manche");
        maMap.put(59,"Nord");
        maMap.put(33,"Gironde");
        maMap.put(83,"Var");

        System.out.println("le nombre de clé : "+maMap.keySet().size());

        /**
         * ON PARCOURS UNE MAP GRACE A L'INTERFACE (Map.entry<clé,valeur>)


        for (Map.Entry<Integer,String>laMap : maMap.entrySet()){
            System.out.println("clé  :"+laMap.getKey()+"   la valeur:"+laMap.getValue());
        }
         */

        /**
         * depuis java 9 on peux utiliser les Map.of (methode factory) pour construire des maps
         */
        Map<Integer,String> te = Map.of(12,"Test",13,"Val",10,"OK");
        for(Map.Entry<Integer,String> t : te.entrySet()) {
            System.out.println("-->"+t.getValue());
        }

    }
}
