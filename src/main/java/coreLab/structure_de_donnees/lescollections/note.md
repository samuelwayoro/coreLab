#### <font color=red> LES COLLECTIONS EN JAVA  </font>


En java, Une collection est un ensemble d'objets (éléments) qui permet de stocker, manipuler et parcourir des données
de manière efficace.

Elle fait partie du framework Java <i>Collections(java.util.Collection)</i> et offre différentes structures adaptées
aux besoins (List,Set,Queue,etc).

Les collections simplifient la gestion des données et offrent des performances optimisées. Pour en tirer parti il faut 
choisir une structure adaptée au besoin (performance,tri,accès rapide).

#### 🎯 <font color=red>Quand utiliser une collection : </font>

* Pour gérer un ensemble d'objets sans taille fixe.
* Pour parcourir, filtrer et manipuler facilement des données 



#### 🔥 <font color=red> Caractéristiques des collections </font>

✅ <font color=red>Stockage dynamique</font> : taille ajustable dynamiquement

✅ <font color=red>Manipulation facilitée </font> : Ajout, Suppression, tri, recherche.

✅ <font color=red> Différentes structures selon l'usage </font> : List, Set, Queue...

✅ <font color=red> Opérations avancées :</font> Parcours(Iterator), tri(Collections.sort()), filtrage(Streams API).

#### 🔥 <font color=red>Hierarchies des collections </font>

L'interface Collections<E> est la racine des structures suivantes :

* <font color=red> List </font>(les éléments sont ordonnées, duplication autorisée) 

    * ArrayList : (tableau dynamique rapide)
    * LinkedList : (Liste chainée efficace en insertion/suppression) 
    * Vector : (obsolète, synchronisé)
  
  
* <font color=red> Set : </font>(Pas de doublons, non ordonné sauf SortedSet)

    * HashSet : (rapide, non ordonné)
    * LinkedHashSet : (ordre d'insertion conservé)
    * TreeSet : (Trié naturellement, basé sur NavigableSet et SortedSet)

* <font color=red>Queue :</font> (Gestion de fil d'attente)

    * PriorityQueue (Trié selon priorité)
    * ArrayQueue (Double-ended queue rapide)

* <font color=red>Map : </font> (Pas une collection, mais souvent associé)

    * HashMap, LinkedHashMap, TreeMap (clé-valeur)


#### 🚀 <font color=red>Créer des collections préremplies </font>

Il existe 2 manières possibles de créer des collections pré-remplies d'éléments (objets ou non) : 

1 - <b> méthode factory qui s'appelle : Arrays.asList(...)</b>

      List<String> strings = Arrays.asList("one","two","three");

2- <b> les Méthodes : List.of(...) ; Set.of(...) depuis java 9</b>

* List.of() retourne une Liste 
* Set.of () retourne un Set qui n'accepte pas de doublons



<font color=red>NB : </font> ces méthodes factories retournent des listes immutables.
C'est-à-dire qu'on ne peut ni leur rajouter des éléments, ni en supprimer : <font color=red>impossible d'utiliser la
méthode add/remove </font>. 

Seule la méthode. "replace()" est autorisée pour remplacer ses éléments.

