#### <font color=red> LES COLLECTIONS EN JAVA  </font>


En java, Une collection est un ensemble d'objets (éléments) qui permet de stocker, manipuler et parcourir des données
de manière efficace.

Elle fait partie du framework Java <i>Collections(java.util.Collection)</i> et offre différentes structures adaptées
aux besoins (List,Set,Queue,etc).

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