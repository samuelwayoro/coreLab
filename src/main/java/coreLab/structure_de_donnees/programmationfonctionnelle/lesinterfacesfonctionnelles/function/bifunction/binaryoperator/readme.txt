INTERFACE FONCTIONNELLE DANS L'API JAVA 
=========================================

--> LES BINARYOPERATOR<T> : 
-----------------------

Interface fonctionnelle qui étend de l'interface BiFuntion qui prend cette fois deux paramètres de type identique 
et qui retourne un resultat de même type que les paramètres:  BiFunction<T,T,T>.

Cette interface fonctionnelle définie une méthode abstraite générique apply qui attend deux paramètres et retourne un résultat du
même type . public <T> T apply(T t1 , T t2);
 
 EXEMPLE : voir la classe MainBinaryOperator
 --------- 


