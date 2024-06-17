les classes de l'interface Set stockent eux aussi des données non ordonnés d'un type données ,
MAIS CONTRAIREMENT AUX LISTES NE PEUVENT PAS STOCKER DES VALEURS EN DOUBLE .
Ces particularités sont :
	1- ne permet pas de contenir les doublons (car sa méthode add() retourne un booléen qui test si oui ou non la valeur à 
rajouter n'existe pas déjà dans la collection set. La comparaison de ces objets est faite sur leur Hascode())

*NB : l'utilisation des set<T> pour stocker des objets demendera la définition OBLIGATOIRE des méthodes hashcode() et equals() de la 
classe de ses objets. Cette redefinition permettra de comparer l'égalité entre les objets a stocker dans le set et ne permettra pas 
de doublons.

	2- impose que l'égalité entre objet soit définie (méthode equal() basée sur la méthode hashcode() des objets de classe) 
	3- les éléments sont non ordonnés par défaut 
	
	Cette interface comprend 3 implémentations : 
	
	*les Hashsets : ne garde pas l'ordre d'insertion des données  
	
	*les LinkedHashset : garde l'ordre d'insertion des données (liste ordonées de données)
    
    *les TreeSet (implémentation de SortedSet lui même implémentation de Set) : Permet de trier dans l'ordre 
	croissant ses données. En gros un TreeSet est un ensemble trié de données .
	NB :  pour l'utilisation d'objets d'une classe dans un TreeSet il faudrais
	 que cette classe implémente l'interface Comparable<T> afin que le TreeSet effectue le trie (par ordre) de ces objets.   
	
 
		 