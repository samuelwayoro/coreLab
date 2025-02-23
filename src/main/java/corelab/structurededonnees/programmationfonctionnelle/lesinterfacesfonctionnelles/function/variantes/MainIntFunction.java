package corelab.structurededonnees.programmationfonctionnelle.lesinterfacesfonctionnelles.function.variantes;

import java.util.function.IntFunction;

public class MainIntFunction {

    public static void main(String[] args) {

        IntFunction<String> intToString = i -> "Numéro " + i;

        System.out.println(intToString.apply(7));

    }


}
