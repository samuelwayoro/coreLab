#### <font color=red> SORTEDSET : sous interface de SET </font>

<b>Un SortedSet est une extension de Set qui stockent les éléments dans un ordre trié</b>. Contrairement à un simple Set,
<b>un SortedSet garantit que les éléments sont toujours organisés dans un ordre naturel ou selon un comparateur personnalisé</b>.


#### 🎯 <font color=gold> Quand utiliser SortedSet ? </font>

✅ Quand on veut stocker des éléments triés automatiquement 

✅ Quand on veut accéder facilement aux plus petits ou plus grand élément de la collection.

✅ Quand on a besoins d'extraire des sous-ensembles (subSet(),headSet(),tailSet()).

- <font color=red> <i> Si l'ordre n'est pas important, alors un HashSet serait plus rapide ( O(1) pour add(),contains(), remove() au lieu de O(log n)). </i> </font>




##### <font color=red> Principales caractéristiques d'un SortedSet : </font>

✅ <font color=red> Trie automatique : </font>
Les éléments sont toujours triés dans l'ordre croissant (ordre naturel ou selon un comparateur).

✅ <font color=red> Pas de doublons : </font>
Comme un Set, il n'accepte pas de doublons.

✅ <font color=red>Accès aux premiers et derniers éléments facilement : </font> grâce aux méthodes <b>First()</b> et <b>Last()</b>.

✅ <font color=red> Accès facile à des sous-ensembles :</font> Permet d'extraire une partie du Set en fonction de bornes
<b> .subSet()</b>.


##### <font color=red> Implémentation principale de SortedSet  : </font>

<b>SortedSet est une Interface</b> et sa principale implémentation est <b>TreeSet</b>, qui est basé sur un arbre rouge-noir
(Red-Black Tree).
Cela garantie que toutes les opérations (ajout,suppression,recherche) sont réalisées en O(log n).


##### <font color=red> Exemple d'utilisation : </font>

Voir classe SortedSetExemple.java


#####  🔥 Utilisation d'un comparator sur les TreeSet de SortedSet : 

<font color=red>Il est possible de trier les éléments de notre ensemble, dans un ordre propre à nous</font> (exemple : décroissant) <font color=red> en utilisant 
un comparator</font>. 

exemple : Voir SortedSetExemple.java.


<font color=red>Différence entre Set et SortedSet(TreeSet) </font>

| Type          | Trié? | Ordre d'insertion conservé | Complexité add/remove |
|---------------|-------|----------------------------|-----------------------|
| HashSet       | ❌     | ❌                          | O(1) très rapide      |
| LinkedHashSet | ❌     | ✅                          | O(1)                  |
| TreeSet       | ✅     | ✅                          | O(Log n)              | 


🏁 <b> CONCLUSION </b>

* Si tu as besoin d'un <font color=red> ensemble trié automatiquement, utilise un SortedSet (via TreeSet).</font>
* Si tu veux juste <font color=red> éviter les doublons sans tri, un hashSet est plus performant.</font>

