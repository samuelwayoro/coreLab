INTERFACE FONCTIONNELLE DANS L'API JAVA 
=========================================

--> LES FUNCTION<T,R> : 
-----------------------

Elle contient une méthode apply(T t) qui applique cette fonction à un argument donné de type générique T et renvoi 
un résultat donné de type générique R. 

Elle est souvent utilisée pour les Map d'objet (transformation d'objets sur un Stream) de certain type 
pour obtenir des objets d'un certain type en sortie. 

Dans l'exemple suivant nous avons la méthode apply sur un objet de type String renvoyant un resultat de type Integer .
 
 Exemple :
 --------- 
 Function<String,Integer> obtenirLongueur = s -> s.length(); 


