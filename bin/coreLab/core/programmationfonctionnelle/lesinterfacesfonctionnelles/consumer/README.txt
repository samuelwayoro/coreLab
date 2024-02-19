INTERFACE FONCTIONNELLE DANS L'API JAVA 
=======================================

--> LES CONSUMER<T> : 
-----------------------
Elle contient une méthode accept(T t) qui évalue une action sur un argument donné et QUI NE RENVOIE RIEN .
Elle est souvent utilisée pour effectuer une action sur chaque élément d'un stream , d'une collection ou d'un tableau.
Par exemple afficher chaque element dans la sortie standart ou enregistrer chaque element en base de données . 
 
 Exemple :
 -------- 
 Consumer<String> afficher = s -> System.out.println(s) ; 

