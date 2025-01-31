INTERFACE FONCTIONNELLE DANS L'API JAVA 
=======================================

--> LES BIPREDICATE<T,U> : 
-----------------------
il s'agit d'une variante de l'interface fonctionnelle Predicate<T> qui défini la méthode boolean test(T t , U u);

 Exemple :implémentation d'un BiConsumer<T,U> de java.util
 -------- 
 BiPredicate<String,String> bp1 = (s1,s2) -> s1.contains(s2) ;
 --> retournera true si la chaine de caractère s1 contient la seconde s2 (voir classe Main)