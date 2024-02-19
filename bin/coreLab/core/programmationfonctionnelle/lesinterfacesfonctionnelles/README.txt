**INTERFACES FONCTIONNELLES**

Une interface fonctionnelle est une interface Java qui doit obligatoirement posseder une et une
seule méthode abstraite (méthode sans implémentation). 

Elle peut avoir plusieurs méthodes statiques ,mais la caractéristique
principale est cette unique méthode abstraite.

Elle est annotée avec @FunctionalInterface pour signaler au compilateur de vérifier sa validité . 

A chaque fois que nous utilisons une expression lambda ou une référence de méthode , nous implémentons
en fait une interface fonctionnelle.

***************** LES INTERFACES FONCTIONNELLES DE L'API JAVA

l'api java depuis sa version 8 propose des interfaces fonctionnelles facilitant la programmation fonctionnelle : 

*** FUNCTION ***: Function<T,R>
Contient une méthode apply(T t) qui applique cette fonction à un argument donné et renvoie un résultat.
Elle est souvent utilisé pour avec la fonction map() sur les stream. 
exemple : renvoie la longeur en entier d'un objet de type String , sorte de mappage(transformation) de cet objet du type String 
vers le type Entier. 
Function<String,Integer> obtenirLongueur = s->s.length()


*** CONSUMER ***: Consumer<T>
Contient une méthode accept(T t) qui effectue une action sur un argument de type donné (T) et qui ne renvoi aucun resultat .
Elle souvent utilisée lorsque nous voulons effectuer des actions sur les éléments d'un stream sans pour autant modifier l'élément 
lui même .Par exemple afficher chaque élément du stream (comme dans l'exemple suivant) ou enregistrer chaque élément en bd. 
exemple : Consumer<String>afficher = s->System.out.println(s) ;

*** PREDICAT ***: Predicat<T>
Ils contiennent une méthode test(T t) qui évalue ce prédicat sur un argument donné et renvoie un booleen .
Elle est souvent utilisée pour des filtres . 
exemple : Predicat<String> estLongueurCinq = s->s.length() == 5 ;


*** SUPPLIER ***: Supplier<T>
Contient une méthode get() QUI NE PREND AUCUN PARAMETRE et qui renvoie un résultat. 
Supplier<String> fournisseur = () -> "Exemple";


Ces différentes interfaces fonctionnelles sont expliquées dans les moindres détails possible dans les différents 
sous package portant leur noms . 