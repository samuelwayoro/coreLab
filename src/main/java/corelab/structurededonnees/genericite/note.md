#### <font color=red> LA GENERICITE EN JAVA  </font>

La généricité est une mécanique dans le développement qui permet de paramétrer une classe en Java.

<b> Elle permet :</b>

D'Indiquer le paramètre générique formel entre < et > (entre chevrons) de sorte à permettre une substitution de ce 
paramètre par un type donné à l'instantiation de l'objet de la classe .
Le paramètre est nommé selon une convention :

- <font color=red>E</font> : éléments, très utilisé dans le framework Collections en java
- <font color=red>K</font> : clef, utilisé comme dans les Map
- <font color=red>N</font> : nombre
- <font color=red>T</font> : type (seulement les type objets pas de type primitif)
- <font color=red>V</font> : valeur

<b>Exemple </b> : Utilisation de la classe ExampleOne() dans la 
classe TestExampleOne() :
La classe ExampleOne() est déclarée avec un type générique <T>, dont le type sera défini a l'instanciation (obligatoirement un type
Objet ExampleOne<Integer> / ExampleOne<String> / ExampleOne<Date> ...).

Il est aussi possible d'avoir une classe générique qui étend (classe fille de... ) une classe générique .
Ce genre doit obligatoirement être générique et avoir les types parametrés de sa classe mère .


<b>Exemple 1 :</b> la classe Couplet<K,V> extend Couple<K,V>

<b>Exemple 2 :</b> la classe Triplet<K,V,U> extend Couple<K,V>



#### 🔥 <font color=red>La généricité délimitée </font>

La généricité délimitée est le faite que le type utilisé dans le paramètre <> soit extends ou super d'un autre type .

* <b>Exemple</b> : voir les classes Traitement<T extend Produit> ; TraitementDeux<T extends Produit & Serializable & Cloneable>
utilisées dans la classe TestTraitement().

#### 🔥 <font color=red>Les méthodes génériques </font>

Il est aussi possible de créer des méthodes génériques qui ont des paramètres génériques et qui retourne 
en résultats ou non des objets de type générique. 
Elles sont très utilisées dans les interfaces...
Elles peuvent être déclarées dans une classe non générique ou même dans une interface générique ou non .

* EXEMPLE 1 : La méthode <K,V> boolean Comparateur() de la classe TestCouple() .
elle retourne un objet de type générique <K,V>.


* EXEMPLE 2 : La méthode <T> T getElementAleatoire(T[] valeurs) de la classe TestMethodeGenerique().
elle prend en paramètre un tableau générique (T[] valeurs) et retourne un objet de type T.


* EXEMPLE 3 : test sur les méthodes génériques des classes CalculGenericMethod et CalculGenericMethodWithProperty dans la classe
TestMethodeGenerique.

#### 🔥 <font color=red>Les interfaces génériques </font>

Dans un projet informatique (comme dans les frameworks), souvent l'on manipule plusieurs interfaces qui ont la même structure,
mais qui manipulant des types différents.

Par exemple, on peut être contraint de créer:

- une interface pour gérer les catégories
- une interface pour gérer les produits
- une interface pour gérer les fournisseurs

Pour éviter de créer plusieurs interfaces, il est plus pratique de créer une interface générique qui prend en paramètre les types
manipulés.

NB : Cette pratique est aussi valable dans l'utilisation de classe générique.

Exemple : l'interface IMetier<T,U>