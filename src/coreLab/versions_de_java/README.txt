Ce package permet de lister les apports majeurs des différentes version de java .Très util pour les préparations de tests technique.
les versions de java evoluent selon les avancées des travaux sur les JSR . 
les versons LTS en sont les principales a connaitres car sont plus pricées pour les version de code utilisées en prod.

***********************************************************************************************************************************
VERSION           *	FONCTIONNALITE CLES															    * DATE DE SORTIE
				  *																					*
***********************************************************************************************************************************
J2SE 5.0          *	---> For Loop améliorée - Enums - Autoboxing/Unboxing							* Septembre 2004
				  * 																				*
				  *	//ancienne méthode itérateur :													*
				  * for(Iterator<String> i = names.iterator(); i.hasNext(); ){						*
				  *		String name = i.next();														*
				  *		System.out.println(name);													*
				  *	}																				*
				  *																					*
				  *	//nouvelle méthode avec for améliorée :											*
				  *	for(String name : names){														*
				  *		System.out.println(name);													*
				  *	}																				*
				  *																					*
				  *	---> Apparution des Enums  qui fournissent un moyen typé de stocker un ensemble *
				  *	de constantes : 																*
				  *	enum Couleur{																	*
				  *		ROUGE;VERT;BLEU																*
				  *	}																				*
				  *																					*
				  *	---> Le Autoboxing et le Unboxing : simplification des conversions de type      *
				  *	   primitif vers le type objet .												*
				  *	Autoboxing : conversion d'une valeur de son type primitif vers son type Objet 	*
				  *				 correspondant .													*
				  *	//Autoboxing 																	*
				  *	Integer a = 10;																	*
				  *																					*
				  *	Unboxing : conversion d'une valeur de sont type primitif vers son type Objet 	*
				  *			   correspondant . 														*
				  *	//Unboxing																		*
				  *	int b = a;																		*
				  *																					*
*************************************************************************************************************************************
JAVA SE 8 LTS	  																						Mars 2014
					---> LES INTERFACES FONCTIONNELLE :
					     -----------------------------
						Une interface fonctionnelle est une interface qui possède une seule méthode
						abstraite . ELle peut avoir plusieurs méthodes par défaut ou plusieurs méthodes
						statiques . Mais la caractéristique principale est cette méthode abstraite .
						Elle est généralement annotée @FunctionnalInterface pour signaler au compilateur 
						de vérifier sa validité . 
						
						exemple : 
						@FunctionalInterface
						Public interface MyInterface(){
							void myMethod();
						}

					---> LES METHODES PAR DEFAUT DANS LES INTERFACES FONCTIONNELLE  :                 	
						exemple : la méthode sort de l'interface List
						
						default void sort(Comparator<? super E> c {
							Collections.sort(this,c);
						}
											
					---> LA PROGRAMMATION FONCTIONNELLE (Lambda,Stream)																	
				  																					
				   		//Utilisation de stream dans une expression lambda								
				   		names.stream().filter(n->n.startsWith("A")).forEach(System.out::println);		
				  																					
				   	--->LES METHODE STATIQUES DANS LES INTERFACES :									
				          Permettant de définir des méthodes d'assistance  réutilisable dans les 	
				        interfaces .																
				    																				
				         interface Outil {																
				    	    static void methodExample(){												
				    		//Implémentation de la methode											
				    	   }																			
				         }																				
				  																					
************************************************************************************************************************************
JAVA 9			   	---> MODULARISATION (Java Platform Modul System) : servant à mieux structurer 	    Septembre 2017			   
				  	   les applications en modules interconnectées . En gros un module est un package 								 
				  	  qui contient d'autres packages avec un fichier module-info.java a sa racine. 
				  
				  	  module mon.mondule{															 	
				  	   	requires java.sql;											 				 
				  	   	exports com.monapp.domaine;											 		 
				  	  }											 									 
				  	  											 									 
				  	  NB: LE JDK A ETE REORGANISE EN MODULE AMELIORANT LA GESTION DES DEPENDANCES	
				  		   DANS LE CLASSPATH													
				  	  NB: pour utiliser les modules il faut créer un fichier nommer : 
				  		  module-info.java a la racine du package principale et y mettre toutes les 
				  		  infos descriptives du module. En somme un
				  
				  
				   															        			 	
				  	---> l'API STREAM A ETE ETENDU 											 	     
				  	   											 									 
				    ---> METHODES PRIVEE DANS LES INTERFACES:										 
				   		interface ExempleInterface{											 	 
				     		 private void methodePrivee(){											 
				     			//implémentation de la methode 										 
				     		  }											 							 
				    	} 											 								 
				  	   											 									 
**************************************************************************************************************************************				  
JAVA SE 10		  	 ---> INFERENCE DE TYPE LOCALE AVEC : VAR 										    Mars 2018
				  		 Réduis la verbosité du code sans sacrifier la clarté.			             	
				       
				 	    //avant java 10 : on spécifie le type de la variable explicitement 
				 	 	List<String>myList = new ArrayList<>();
				 	 
				 	 	//avec java 10 : on peut utiliser le mot clé 'var' pour demander au 
				 	 	//compilateur de déduire le type :
				 	 	//le compilateur infère que myList est de type List<String>
				 	 	var myList = new ArrayList<String>() 
*************************************************************************************************************************************
JAVA SE 14			---> LES EXPRESSIONS SWITCH (en preview dans java 12 et 13)							Mars 2020
						amélioration de la syntaxe des instructiond switch en permettant plusieurs 
						valeurs par cas , surtout en eliminant le besoin de break .
						
						exemple :
						String monday = "MONDAY"
						String typeOfDay = switch(day){
							case "MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY"->"Weekday",
							case "SATURDAY","SUNDAY"->"Weekend";
							default ->"Invalid day";
						};
						System.out.println(typeOfDay);
*************************************************************************************************************************************
JAVA SE 15 			---> LES TEXT BLOCS (En preview dans java 13 et 14)									Septembre 2020
						 Rend la manipulation de chaîne de caractère multiligne beaucoup plus 
						 simple . Simplifiant l'écriture de texte tel que : sql , html , json ...
						 exemple :
						
						 String text = """
						 				Un nouveau contenu de test 
									   """;
						 System.out.println(text);

***********************************************************************************************************************************
JAVA SE 16			---> Record classes																	Mars 2021
						 Permettant de creer de type de données immuables sans code superflu .
						 exemple :
						 	record Person(String name,int age){}
						 
						 nb : les record ont faciliter la création de classe immuable avec le minimum 
						 de code possible . 
***********************************************************************************************************************************
JAVA SE 17 			---> Sealed classes :
						 * les classes scellés servent a avoir un contrôle précis de l'héritage  		Septembre 2021
						 * utilisation de "sealed" classe X permits listes de classes autorisées à 
						 étendre la classe X . 
						 * "sealed" est un mot-clé réservé (un mot clé contextuel)
						 * Exemple : Création d'une classe scellée , UserAccount permettant uniquement 
						 aux classes PersonnalAccount et BusinessAccount de pouvoir l'étendre. 
						   
						 public sealed class UserAccount permits PersonnalAccount , BusinessAccount {
						 	//code ...
						 } 	 	 