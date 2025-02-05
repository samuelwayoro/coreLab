#### <font color=red> NavigableSet sous interface de Set</font>

🚀 <b>NavigableSet : une version améliorée de SortedSet </b>

NavigableSet est une extension de SortedSet qui <font color=red> offre des méthodes avancées dans un ensemble trié. Il est principalement 
implémenté par TreeSet</font>.


* Exemple : voir DemoNavigableSet.java

#### 🎯 <font color=red>Quand utiliser <i>NavigableSet</i> au lieu de <i>SortedSet</i> ?</font> 

✅ Pour récupérer rapidement des éléments proches d'un élément donné dans la collection <i>(.lower();.higher();etc)</i>

✅ Pour supprimer et récupérer les premiers/derniers éléments <i>(.poolFirst(),.pollLast())</i>.

✅ Pour afficher une "vue" dans l'ordre inversé des éléments : <i>.descendingSet()</i> 

✅ pour avoir plus de contrôle sur les sous-ensembles avec inclusive/exclusive : <i>subSet()</i>.

