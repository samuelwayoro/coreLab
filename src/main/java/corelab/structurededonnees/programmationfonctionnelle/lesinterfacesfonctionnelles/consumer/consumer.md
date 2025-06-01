#### <font color=red> CONSUMER < T >  </font>

* <font color=red>Description</font> Effectue une action sur un objet de type <b>T</b> sans retourner de resultat.


* <font color=red>Méthode principale :</font> <b>void accept(T t)</b>.


* <font color=red>Méthode par défaut :</font> <b>andThen</b> pour chaîner des consumers.


* <font color=red>Variantes :</font>

    * <b>IntConsumer, LongConsumer, DoubleConsumer</b> Versions spécialisées
      pour éviter l'autoboxing (conversion de type primitif vers son type wrapper).

    * <b> BiConsumer < T, U></b> accepte deux arguments. 



##### 📔 <font color=red> Exemple :  </font> MainConsumer.java


##### ❗ <font color=red> Utilité avancée :</font> Appliquer des effets sécondaires (logs, modifications), traiter des éléments dans un flux.