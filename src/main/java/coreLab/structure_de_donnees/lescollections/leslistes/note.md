#### <font color=red> LES LIST  </font>

Les classes qui implémentent l'interface List<E> peuvent stocker des données
d'un type bien donné et même des valeurs en double et Null. Ils ne sont pas Thread-safe .
Les deux implémentations les plus répendus sont :

les LinkedList<E> : Se base sur le concept de liste individuellement ou doublement liée.
A utiliser de préference pour les actions d'insertion/suppresion

les ArrayList<E> : se base sur le concept de tableau (chaque données a un index) redimensionnable dynamiquement
ce qui permet de conserver l'ordre d'ajout d'élément lors des parcours .
A utiliser de préférence pour les parcours , accès directe et manipulations courantes ...

On peux créer désormais (depuis java ...) des listes de données en utilisant :

- 	la méthode factory asList() disponible sur la classe factory Arrays : Arrays.asList(données...). 
Mais attention sur ce type de liste créer on ne peux pas ajouter(add()) et retirer(remove()) de données 

-	A partir de java 9 utiliser les méthodes List.of(donnée...) ou Set.of(...) qui sont
immutable (impossible d'ajouter/de rétirer d'éléments)	




🔥 <b>Particularités:</b>

🚀 <font color=red>Ne peut pas de contenir de doublons </font> <b>(car sa méthode add() retourne un booléen qui test si oui ou non la valeur à
rajouter n'existe pas déjà dans la collection set. La comparaison de ces objets est faite sur leur Hashcode()).</b>
