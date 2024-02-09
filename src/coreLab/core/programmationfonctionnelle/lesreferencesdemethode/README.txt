****LES REFERENCES DE METHODES ***
 
Une capacité syntaxtique introduite avec java 8 , utilisées pour créer des expressions lambda en pointant vers
méthodes sans les invoquer , c a d en référençant explicitement à un nom de méthode , ce qui permet à votre code 
de gagner en lisibilité . 

En un mot c'est un raccourci syntaxique pour les expressions lambda

EXEMPLE : 

-Avec expressions lambda : 

List<String> names = Arrays.asList("Nadine","Charles","Victor");
names.forEach(name -> System.out.println(name));

-Avec une référence de méthode : 
names.forEach(System.out::println);

IL existe principalement 4 type de référence de méthodes :
1-Référence de méthode statiques 
2-Référence à une méthode d'instance d'un objet particulier existant 
3-Référence à une méthode d'instance d'un objet arbitraire 
4-référence à un constructeur 
Plus de détails dans les différents sous-paquages