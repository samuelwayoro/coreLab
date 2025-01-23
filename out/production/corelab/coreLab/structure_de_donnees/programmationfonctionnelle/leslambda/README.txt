Une expression lambda est une implémentation d'une fonction anonyme , une méthode sans déclaration .
C'est une expression qui te permet d'écrire une fonction là oû tu vas l'utiliser .
Pratique quand une méthode est courte et sera utilisée qu'une fois.

la syntaxe : (paramètres) -> {corps de l'expression}

EXEMPLE : 

** str -> str.length()>3  (retourne un booléen)
** ()->new Person()       (création d'objets)
** str->str.toUpperCase() (Transformation : conversion d'une chaîne en majuscule)
** (s)->{ System.out.println(s)} (Action : afficher une chaîne à la console)
** (a,b)-> a + b (Calcul : addition de deux nombres)

les lambdas sont une nouveauté de la version 8 de java qui a eu un gros impact dans l'écriture du code java depuis cette version . 
elle est de ce fait très répandue dans l'utilisation de strucuture de données tels que les collections et les streams qui sont 
elles aussi survenue avec cette version de java . 

On l'utilise couremment pour l'utilisation des interfaces fonctionnelles , car elle permette de rapidement implémenter les méthodes 
abstraites de ces interfaces fonctionnelles . 