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
O(Log n) pour les opérations.</b>


#### ⭐ <font color=red> Trie personnalisé en utilisant l'interface fonctionnelle "Comparator" </font> 
- <font color=gold>Interface Comparator</font>

Il est possible de personnaliser le "trie" en utilisant l'interface Comparator de deux manières :

1- en passant directement en paramètre de l'instance de TreeSet comme dans cet exemple : 

        SortedMap<Integer,String> sortedMap = new TreeMap<>(Comparator.reversedOrder());

2- en créant une classe implémentant l'interface Comparator afin de redéfinir la méthode :

        public class UserComparator implements Comparator<User> {
        
            private int age;

            @Override
            public int compare(User u1,User u2) {
                return Integer.compare(u1.getAge(),u2.getAge());
            }

        }

<font color=red>exemple : exempleComparator.java </font>

- <font color=gold>Interface Comparable<T></font>

L'interface générique <i>Comparable<T></i> permet de parameter à sa guise, la notion de comparaison sur les objets des 
classes d'un domaine dans un projet.

        public Interface Comparable<T> {

            int comparaTo(T t) ;
        }

Cette interface contient une méthode compareTo(T t) permettant de comparer deux objets et retournant un entier.

Voir : <b> aveccomparable/AvecComparable.java </b>