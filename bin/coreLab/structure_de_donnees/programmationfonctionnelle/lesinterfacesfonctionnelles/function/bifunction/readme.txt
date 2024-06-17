INTERFACE FONCTIONNELLE DANS L'API JAVA 
=========================================

--> LES BIFUNCTION<T,U,R> : 
-----------------------

Interface fonctionnelle variante de l'interface fonctionnelle Function<T> qui prend cette fois deux paramètres de type différentes 
et qui retourne un resultat d'un type différent BiFunction<T,U,R>.

Cette interface fonctionnelle définie une méthode abstraite générique apply qui attend deux paramètres et retourne un résultat d'un
type donné . public <T,U> R apply(T t , U u);
 
 EXEMPLE : voir la classe Main()
 --------- 


