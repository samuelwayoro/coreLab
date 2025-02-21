package corelab.structurededonnees.programmationfonctionnelle.lesreferencesdemethode.referenceaunemethodedinstancedunobjetparticulierexistant;

import corelab.structurededonnees.programmationfonctionnelle.lesreferencesdemethode.model.Person;

/****
 * 		EXEMPLE D'UTILISATION D'UNE REFERENCE A UNE METHODE D'INSTANCE 
 * 		D'UN OBJET PARTICULIER EXISTANT
 * 
 * 		NomInstance::nomMethode
 */
public class Main {

	public static void main(String[] args) {
		testMethod();
	}
	
	static void testMethod() {
		Person p = new Person("Sam");
		
		//ici la méthode printName est appelé directement sur l'objet p (objet existant)
		Runnable printSam = p::printName; 
		printSam.toString();
	}

}
