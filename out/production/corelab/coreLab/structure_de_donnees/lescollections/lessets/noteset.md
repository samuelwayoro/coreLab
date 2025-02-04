#### <font color=red> LES SETS  </font>

Un Set est une classe d'implémentation de l'interface Set.<font color=red> 
Elles permettent de stocker, des données non ordonnées d'un type données,
MAIS CONTRAIREMENT AUX LISTES NE PEUVENT PAS STOCKER DES VALEURS EN DOUBLE.</font>

🔥 <b>Particularités:</b>

🚀 <font color=red>Ne peut pas de contenir de doublons </font> <b>(car sa méthode add() retourne un booléen qui test si oui ou non la valeur à
rajouter n'existe pas déjà dans la collection set. La comparaison de ces objets est faite sur leur Hashcode()).</b>

<font color=red>NB :</font><b> L'utilisation du Set, pour stocker des objets demandera la définition OBLIGATOIRE des 
méthodes hashcode() et equals() de la classe de ses objets. Cette redefinition permettra de comparer l'égalité entre 
les objets à stocker dans le Set et ne permettra pas de doublons.</b>

🚀 <font color=red>Impose que l'égalité entre objet soit définie</font> (méthode equal() basée sur la méthode hashcode() des objets de classe) 
 
🚀 <font color=red>Les éléments sont non ordonnés par défaut </font> : pas d'ordre respecté dans un Set. <i>"Un set est un four-tout ..."</i>
	
🔥 <b> Utilisations</b>

Cette interface comprend 3 implémentations : 

* Les <font color=gold>Hashsets </font> : ne garde pas l'ordre d'insertion des données  


* Les <font color=gold>LinkedHashset </font> : garde l'ordre d'insertion des données (liste ordonées de données)


* Les <font color=gold> TreeSet </font> : <font color=red> Implémentation de SortedSet lui-même implémentation de Set): 
Permet de trier dans l'ordre croissant des données.</font> 
En gros un TreeSet est un ensemble trié de données . 


<font color=red>NB :</font> Pour l'utilisation d'objets d'une classe dans un TreeSet il faudrais
que cette classe implémente l'interface Comparable<T> afin que le TreeSet effectue le trie (par ordre) de ces objets.   


     