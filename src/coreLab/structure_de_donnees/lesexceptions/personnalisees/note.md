### LES EXCEPTIONS PERSONNALISEES

Prenons le programme suivant :

        var chaine  = "chaine";
        var entier = Integer.parseInt(chaine);

Ce programme compile sans problème. Cependant, à l'exécution, on obtient l'erreur suivante :

        Exception in thread "main" java.lang.NumberFormatException: For input string: "chaine"

C'est ce qu'on appelle une exception.
Dans notre programme, l'erreur n'est pas gérée, ce qui provoque un bug dans le programme et provoque l'arrêt du programme. Une exception non gérée est donc un vrai problème qu'il nous faut apprendre à régler.

<font color=red> LES TYPES D'ERREURS EN JAVA :</font>

Le diagramme suivant montre comment sont organisées les classes d'erreurs en java :
(voir fichier diagramme_erreurs_java.png)

Nous avons en réalité trois types d'exceptions :


- <font color=red>la classe Error : </font>

Elle représente une erreur grave intervenue dans la machine virtuelle Java ou dans un sous système Java. L'application Java s'arrête instantanément dès l'apparition d'une exception de la classe Error.

<font color=gold>NOTE : </font>
Il n'y a pas grand-chose à faire pour empêcher ces erreurs dans le code de nos programmes directement. Ce genre d'erreurs
peut par exemple arriver quand il y a plus de RAM disponible pour faire fonctionner le programme. Ce sont en fait des
erreurs techniques.

- <font color=red>la classe Exception : </font>
  La classe Exception représente à l'inverse des erreurs liées à l'exécution du programme, donc liées au code que l'on développe. La particularité de ces exceptions, c'est qu'elles doivent obligatoirement être gérées dans le code,
  sinon :
    - soit le code ne peut pas compiler On les appelle <font color=red>checked exception.</font>
    - soit le code pourra compiler, mais avec une possibilité d'exceptions dans son execution : on les appelle les <font color=red>unchecked exceptions,
      et la classe RuntimeException en est une. </font> Ce genre d'exception est une classe fille de la classe Exception.

Dans les deux cas, il faut les gérer dans les blocs de code : <font color=red> try / catch() / finally.</font>

<b>Syntax:</b>

        try{
          ...
        } catch(ExceptioName e){
          ...
        } Finally {
          ...
        }

