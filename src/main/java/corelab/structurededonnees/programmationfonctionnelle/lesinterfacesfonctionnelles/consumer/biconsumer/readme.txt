INTERFACE FONCTIONNELLE DANS L'API JAVA 
=======================================

--> LES BICONSUMER<T,U> : 
-----------------------
il s'agit d'une variante de l'interface fonctionnelle Consumer<T> qui défini la méthode void accept(T t , U u);

 Exemple :implémentation d'un BiConsumer<T,U> de java.util
 -------- 
 Consumer<String,Intger> afficher = (s,1) -> System.out.println("s"+1) ; 