package corelab.structurededonnees.programmationfonctionnelle.lesreferencesdemethode.referenceaunemethodedinstancedunobjetarbitraire;

import corelab.structurededonnees.programmationfonctionnelle.lesreferencesdemethode.model.Person;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		testMethod();

	}
	
	/*
	 * utilisation de la methode printName sur des objets d'un stream 
	 * ici la méthode printName est appelé directement sur la classe Person
	 * et non pas sur les instances d'objet comme dans l'exemple du package : 
	 * "referenceaunemethodedinstancedunobjetparticulierexistant".
	 * 
	 * 
	 */
	static void testMethod() {
		List<Person> people = Arrays.asList(new Person("Arnold"),new Person("Logan"),new Person("Jessica"));
		people.stream().forEach(Person::printName);
	}

}
