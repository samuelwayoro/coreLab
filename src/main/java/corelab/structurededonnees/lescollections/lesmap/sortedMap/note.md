#### <font color=red> SORTEDMAP  </font>

#### 🎯 <font color=red>QU'EST CE QU'UNE SortedMap ?</font>

<font color=red> SortedMap  </font> est une interface du framework java Collections qui represente une 
<font color=red> Map trié selon l'ordre naturel des clés ou un comparator personnalisé </font>.


#### 🚀 Quand utiliser SortedMap (TreeMap) ?

* <b>Pour utiliser une Map avec un tri automatique des clés</b>
* <b>Pour recuperer rapidement les premières/dernières clés </b>
* <b>Pour travailler avec des sous-maps dynamiques : subMap;headMap;tailMap </b>

<font color=red> NB : </font> Si l'ordre des clés ne t'importe pas, HashMap est plus rapide.


#### 🥇 <font color=red> IMPLEMENTATION PRINCIPALE  : </font> TreeMap<K,V>

Contrairement à <b>HashMap</b>, qui ne garantie pas d'ordre, <b>SortedMap range toujours les clés dans un ordre déterminé.</b>


#### 💎 <font color=red> CARACTERISTIQUES DE SortedMap  : </font> TreeMap<K,V>

✔ <font color=red> Tri automatique des clés </font> : ordre naturel ou personnalisé 

✔ <font color=red> Accès rapide aux clés extrêmes : </font> firstKey() ; lastKey()

✔ <font color=red> Sous-maps dynamiques : </font> subMap() ; headMap() ; tailMap() 

✔ <font color=red> Basé sur une structure de données : </font> <b>Red-Black Tree (via TreeMap), garantissant une complexité 
O(Log n) pour les opérations.


#### ⭐ <font color=red> Trie personnalisé avec un "Comparator"  : </font> 

Si tu veux trier dans l'ordre décroissant, on peut utiliser un comparator :

        SortedMap<Integer,String> sortedMap = new TreeMap<>(Comparator.reversedOrder());
