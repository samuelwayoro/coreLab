#### <font color=red> PREDICAT <T.>  </font>

* <font color=red>Description</font> Teste une condition sur un objet de type <b>T</b> et retourne un <b>boolean</b>.


* <font color=red>Méthode abstraite :</font> <b>Test()</b>.


* <font color=red>Méthode par défaut :</font> <b>and, or, negate</b> pour combiner ou inverser des prédicats.

* <font color=red>Variantes :</font> <b>IntPredicate, LongPredicate, DoublePredicate</b> Versions spécialisées 
pour éviter l'autoboxing (conversion de type primitif vers son type wrapper).



##### 📔 <font color=red> Exemple :  </font> MainPredicate.java


##### ❗ <font color=red> Utilité avancée :</font> Filtrer les collections, valider des données, ou construire des règles complexe.