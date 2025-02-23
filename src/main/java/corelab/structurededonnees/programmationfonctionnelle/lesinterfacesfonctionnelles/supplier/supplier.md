#### <font color=red> SUPPLIER < T >  </font>

* <font color=red>Description</font> Fournit une instance <b>T</b> sans prendre d'entrée.

Elle contient une méthode get() qui ne prend aucun argument et renvoi un résultat de type générique T.

Elle est souvent utilisée pour créer des elements par exemple.

* <font color=red>Méthode abstraite :</font> <b>T get()</b>


* <font color=red>Variantes :</font> <b>IntSupplier, LongSupplier, DoubleSupplier, BooleanSupplier </b> : Pour produire 
des types primitifs.


* <font color=red>Utilité avancée :</font> <b>Générer des valeurs paresseusement (Lazy evaluation), initialiser des objets à la demande.</b>


##### 📔 <font color=red> Exemple :  </font> MainPredicate.java


##### ❗ <font color=red> Utilité avancée :</font> Filtrer les collections, valider des données, ou construire des règles complexe.