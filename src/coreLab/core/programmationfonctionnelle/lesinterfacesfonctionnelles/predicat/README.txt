INTERFACE FONCTIONNELLE DANS L'API JAVA 
=======================================

--> LES PREDICATE<T> : 
---------------------

Elle contient une méthode test(T t) qui évalue un prédicat sur un argument donné et renvoie un booléen . Elle est souvent utilisée
pour des filtres sur les stream.
 
Exemple :
--------
 Predicate<String> estDeLongeurCinq = s -> s.length() == 5 ; 

