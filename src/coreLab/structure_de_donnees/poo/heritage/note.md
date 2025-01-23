### l'HERITAGE EN JAVA 

Concept permettant de créer des classes "enfants" 
d'autres classes afin de bénéficier (hériter) automatiquement 
de leurs contenant (propriété et méthodes).

Grâce à l'héritage, les objets d'une classe fille ont accès aux données et aux méthodes de la classe parente
et peuvent les étendre.

<b>Note</b> : "L'héritage multiple" n'existe pas en Java,
ce qui signifie qu'une classe ne peut pas hériter de plusieurs classes parentes, mais d'une seule.

<font color=red> DEFINIR UNE CLASSE :</font>
    
- Voir classe parente : classe Fruit et la classe fille Banane
    
    - Dans la classe Banane Le mot-clé "extends" permet d'hériter de la classe Fruit.
      Le constructeur parent est appelé en utilisant l'invocation super(...).
      Il est possible de surcharger le comportement d'une méthode de la classe parente en utilisant
      l'annotation @Override.

    - Les annotations sont une notation particulière en Java qui peuvent être appliquées sur des classes ou des
      attributs ou des méthodes. Nous verrons en détails leur fonctionnement dans un prochain chapitre.

    - N'importe quelle méthode de la classe parente peut être appelée en utilisant l'invocation
      super.nomDeLaMethode(...).
    - <font color=red>Limitation : </font> Il n'est pas possible d'utiliser un _attribut private_ ou une _méthode
    parente_ dans la classe.



<font color=red> UTILISATION DE LA CLASSE FILLE  :</font>

Une classe fille s'utilise alors exactement de la même manière que n'importe quelle classe :

<b>Exemple:</b>
            
        var banane = new Banane();
        System.out.printLn(banane.descriptionFruit());

<font color=red>CLASSE FINAL </font>

<font color=red>Les classes "final" ne peuvent pas être héritées.</font>
Ainsi le code suivant ne compilera pas, puisque la classe String est une classe FINAL.

        public StringCustom extends String{
        ...
        }


<font color=red>CLASSE ET METHODE ABSTRACT </font>

Les classes abstract permettent de définir des classes qui ne peuvent pas créer d'objets (ne peut pas être
instanciée).
* <font color=red>Le but est de créer une classe avec des données et des comportements par défaut qui pourront ensuite être héritées par des classes filles.</font>

<b>Syntax :</b>

        public abstract class Nourriture {
            ...
        }

Dans les classes abstract, il est possible de définir des méthodes abstract.
* Ce sont des méthodes qui n'ont pas de bloc d'instructions, et qui doivent obligatoirement être surchargées par les classes filles.

<b>Syntax :</b>

        public abstract class Nourriture {
            
            //méthode sans code...
            public abstract String abstractMethod();
        }
