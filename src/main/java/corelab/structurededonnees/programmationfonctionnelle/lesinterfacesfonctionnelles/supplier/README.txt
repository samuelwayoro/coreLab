INTERFACE FONCTIONNELLE DANS L'API JAVA 
=======================================

--> LES SUPPLIER<T> : 
----------------------
Elle contient une méthode get() qui ne prend aucun argument et renvoi un resultat de type générique T.Elle est souvent utilisée
pour créer des elements par exemple . 
 
 Exemple : 
 --------
 Supplier<List<String>> listSupplier = ArrayList::new;
 
 List<String> myList = listSupplier.get(); //créera une liste de String a chaque appel  

