#### <font color=red> BIPREDICATE <T,U>  </font>

Exemple : Implémentation d'un BiConsumer<T,U> de java.util

* <font color=red>Description</font> Il s'agit d'une variante de l'interface fonctionnelle Predicate<T>


* <font color=red>Méthode abstraite :</font> <b> boolean test(T t , U u);</b>.


##### 📔 <font color=red> Exemple :  </font> Main.java



BiPredicate<String,String> bp1 = (s1,s2) -> s1.contains(s2) ;
--> retournera true si la chaine de caractère s1 contient la seconde s2 (voir classe Main)
