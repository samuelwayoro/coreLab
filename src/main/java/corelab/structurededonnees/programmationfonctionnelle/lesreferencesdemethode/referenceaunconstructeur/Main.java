package corelab.structurededonnees.programmationfonctionnelle.lesreferencesdemethode.referenceaunconstructeur;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Main {

	/****
	 * exemple d'utilisation de référence a un constructeur permettant de créer de nouvelle  instance de la classe User
	 * @param args
	 */
	public static void main(String[] args) {

		Stream<String> users = Stream.of("user1","user2","user3","user4","user5","user6");

		//sans méthode de référence 
		users.map(e -> new User(e)).forEach(System.out::println);

		//avec une méthode de référence pour évoquer le constructeur de User  
		users.map(User::new).forEach(System.out::println);
	}

	class User{
		private String name;

		public User (String name){
			this.name = name;
		}

		public Stirng getName(){
			return this.name;
		}

		public void setName(String name){
			this.name = name;
		}
		
	}

}
