#### <font color=red> LES MAP/ tables de hachage  </font>

<b>Une table de hachage </b> est une structure de données qui stocke des paires clé-valeur en utilisant <b> une fonction 
de hachage </b> pour un accès rapide.
En java, <b> les tables de hachage </b> sont principalement représentés par la classe <font color=red> HashMap</font>, 
ainsi que par <font color=red>HashTable</font>(ancienne version synchronisée).

#### 🎯 <font color=red>Pourquoi utiliser une table de Hashage ou Map en Java: </font>

✅ <font color=red> Accès rapide :  </font> Temps d'accès O(1) en moyenne grâce a la fonction de hachage.

✅ <font color=red>Stockage clé-valeur : </font> Recherche efficace via clé.

✅ <font color=red>Aucune duplication de clé : </font> Chaque clé est unique.

✅ <font color=red>Bonne performance : </font> pour les grandes quantités de données.


#### 🎯 <font color=red>Principale implémentation en Java :  </font>

- <font color=red> HashMap </font> Rapide / non synchronisé / ordre garanti
- <font color=red>LinkedHashMap<K,V> </font> Conserve l'ordre d'insertion 
- <font color=red>TreeMap<K,V> </font> Trie selon l'ordre naturel des clés (basé sur NavigableMap)
- <font color=red>HashTable<K,V> </font> Ancienne version synchronisée de HashMap (moins performante)


<b>Exemple : voir classe Demo.java </b>


#### 🎯 <font color=red>Quand utiliser une table de hachage en java :  </font>




#### 🔥 <font color=red> Comment fonctionne une HashMap en interne ? </font>

1. Une fonction de hashage transforme la clé en indice d'un tableau de "buckets"
2. les entrées sont stockés sous forme de Map.Entry<K,V> dans ces "buckets."
3. En cas de collisions (même index pour plusieurs clés), java utilise une liste chainée (et un arbre TreeNode si trop d'éléments)
4. Depuis java 8, une HashMap convertit les longues listes en arbres (TreeMap) pour accélérer les recherches.