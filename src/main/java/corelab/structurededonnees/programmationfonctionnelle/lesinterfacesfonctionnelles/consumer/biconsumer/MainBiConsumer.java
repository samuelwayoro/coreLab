package corelab.structurededonnees.programmationfonctionnelle.lesinterfacesfonctionnelles.consumer.biconsumer;

import java.util.function.BiConsumer;

public class MainBiConsumer {

	public static void main(String[] args) {
		
		ajoutDeTextAfficherDansLaConsole("je vous salue","Marie");

	}

	static void ajoutDeTextAfficherDansLaConsole(String text1,String text2 ) {
		BiConsumer<String, String> biConsumer = (t1,t2)->System.out.println(t1+" "+t2);
		biConsumer.accept(text1, text2);
	}

}
