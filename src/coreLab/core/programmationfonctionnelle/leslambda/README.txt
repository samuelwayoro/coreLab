Package contenant les bouts de code sur les expressions lambda.
Une expression lambda est une fonction anonyme , une méthode sans déclaration .
C'est une expression qui te permet d'écrire une fonction là oû tu vas l'utiliser .
Pratique quand une méthode est courte et sera utilisée qu'une fois.

la syntaxe : (paramètres) -> {corps de l'expression}

EXEMPLE : 

** str -> str.length()>3  (retourne un booléen)
** ()->new Person()       (création d'objets)
** str->str.toUpperCase() (Transformation : conversion d'une chaîne en majuscule)
** (s)->{ System.out.println(s)} (Action : afficher une chaîne à la console)
** (a,b)-> a + b (Calcul : addition de deux nombres)

