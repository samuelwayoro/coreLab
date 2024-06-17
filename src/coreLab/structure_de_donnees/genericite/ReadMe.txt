LA GENERICITE EN JAVA :
---------------------

la généricté est une mécanique dans le developpement qui permet de parametrer une classe en Java . 

Elle permet : 
d'Indiquer le paramètre générique formel entre < et > (entre cheuvrons) de sorte a permettre une substitution de ce paramètre 
par un type donné à l'instantition de l'objet de la classe . 
le paramètre est nommé selon une convention : 

-E : éléments , très utilisé dans le framework Collections en java 
-K : clef , utilisé comme dans les Map 
-N : nombre 
-T : type (seulement les type objets pas de type primitif)
-V : valeur 

Exemple : utilisation de la classe ExampleOne() dans la classe TestExampleOne()
-------
la classe ExampleOne() est déclarée avec un type générique <T> , dont le type sera défini a l'instanciation (obligatoirement un type
Objet ExampleOne<Integer> / ExampleOne<String> / ExampleOne<Date> ...).

Il est aussi possible d'avoir une classe générique qui étend (classe fille de... ) une classe générique . 
Ce genre doit obligatoirement être générique et avoir les types parametrés de sa classe mère . 

*Exemple 1 : la classe Couplet<K,V> extend Couple<K,V>
-----------

*Exemple 2 : la classe Triplet<K,V,U> extend Couple<K,V>
-----------

LA GENERICITE DELIMITEE :
-------------------------
la généricité délimitée est le faite que le type utilisé dans le paramètre <> soit extends ou super d'un autre type .
*exemple : voir les classes Traitement<T extend Produit> ; TraitementDeux<T extends Produit & Serializable & Cloneable> 
utilisées dans la classe TestTraitement()

LES METHODES GENERIQUES : 
-------------------------
Il est aussi possible de créer des méthodes générique qui ont des paramètres génériques et qui retourne en resultats ou non 
des objets de type générique . Elles sont très utilisées dans les interfaces...
Elles peuvent être déclarées dans une classe non générique ou même dans une interface générique ou non .  

Exemple 1 : La méthode <K,V> boolean Comparateur() de la classe TestCouple() . 
----------	elle retourne un objet de type générique <K,V>

Exemple 2 : La méthode <T> T getElementAleatoire(T[] valeurs) de la classe TestMethodeGenerique().
----------  elle prend en paramètre un tableau générique (T[] valeurs) et retourne un objet de type T.

Exemple 3 : test sur les méthodes générique des classes CalculGenericMethod et CalculGenericMethodWithProperty dans la classe 
			TestMethodeGenerique
 
LES INTERFACES GENERIQUE : 
-------------------------
Dans une projet informatique (comme dans les framework) , souvent on manipule plusieurs interfaces qui ont la même structure 
mais manipulant des types différents.
 
par exemple on peut être contraint a créer : 
-une interface pour gerer les catégories 
-une interface pour gerer les produits 
-une interface pour gerer les fournisseurs 

Pour éviter de créer plusieurs interfaces,il es plus pratique de créer une interface génrique qui prend en paramètre les types 
manipulés . 
NB : Cette pratique est aussi valable dans l'utilisation de classe générique . 

Exemple : l'interface IMetier<T,U>

 