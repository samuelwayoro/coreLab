### INTRODUCTION AUX EXCEPTIONS

Prenons le programme suivant : 

        var chaine  = "chaine";
        var entier = Integer.parseInt(chaine);

Ce programme compile sans problème. Cependant, à l'exécution, on obtient l'erreur suivante :

        Exception in thread "main" java.lang.NumberFormatException: For input string: "chaine"

C'est ce qu'on appelle une exception. 
Dans notre programme, l'erreur n'est pas gérée, ce qui provoque un bug dans le programme et provoque l'arrêt du programme. Une exception non gérée est donc un vrai problème qu'il nous faut apprendre à régler.

<font color=red> LA CLASSE THROWABLE :</font>

Le diagramme suivant montre comment sont organisées les classes d'erreurs en java :
<b>(voir fichier : diagramme_erreurs_java.png)</b>.

Tout part à la base de la <font color=red>classe Throwable</font> qui est la <font color=red>classe mère de toutes les
classes d'erreur et d'exception.</font> C'est la classe fondamentale.

Elle contient :

* <font color=red>une propriété "message" avec sa méthode getMessage() : </font> dont bénéficient toutes ses classes
  filles.
  Elle permet de connaitre le message d'erreur et de l'afficher à l'aide de la méthode getMessage().


* <font color=red>une stack trace :</font> qui signifie pile d'appel en français. Elle permet de lister et afficher
  toutes les méthodes
  qui ont été exécutées avant d'aboutir à une Exception, la ligne de l'exception et la méthode qui est à l'origine de
  cette exception.
  Elle est <font color=red> récupérable à l'aide de la méthode "printStackTrace()"</font> qui va permettre d'afficher
  cette stack trace
  dans la console ou sur un autre support (réseau ou base de données).
  Très utile pour fair du debug !


* <font color=red> une root cause : </font> qui signifie cause raçine en français, elle permet de connaître l'erreur qui est à l'origine responsable de l'erreur qu'on obtient dans la console.


<font color=red> LES 3 PRINCIPALES CLASSES FILLES DE THROWABLE : les differents type d'erreurs </font>

<b>voir le fichier diagramme_erreurs_java.png.</b>


*   <font color=red>La class Error : </font> 

Elle modélise (représente) les erreurs qui en général ont lieu au niveau de la JVM, au niveau du RUNTIME java.

<b>Exemple :</b> 

* <b>OutOfMemoryError() :</b> Jeté quand la jvm n'a plus de mémoire pour l'application en cours.
Qui n'est pas a proprement dit une erreur dûe à l'application, qui serait liée à une insuffisance de la JVM qui faudra 
peut-être "tuneé" ou reconfigurée pour que l'appli puisse continuer correctement.


* <b>StackOverFlowError() :</b> Quand on a une méthode qui s'appelle elle-même, alors la stack est saturée.

<font color=gold> NB: </font> 
Elles ne nécessitent pas une gestion explicite dans un try catch.

*   <font color=red>La class Exception : </font>


<b>Exemple :</b>

* <b> IOException() : </b> Jetée quand on a un problème d'entrée sortie typiquement lors d'accès disque ou réseau.


* <b> FileNotFoundException() : </b> qui étend <b>IOException()</b> et qui est jétée quand on a un problème de lecture, d'un fichier qui n'est malheureusement pas trouvé.


* <b>SQLException() :</b> jetée lors d'erreur de syntax dans une requête sql envoyée à un SGBD via JDBC pour execution. 
En gros, il s'agit d'une erreur côté base de données remontées à la JVM.

<font color=gold> NB: </font> 
Elles nécessitent une gestion explicite dans un try catch.


*   <font color=red>La class RunTimeException : classe fille d'Exception </font>

Ce sont en vrai des "bugs" entraîné le plus souvent par une erreur dans le code source qui n'ont pas lieu d'être.

<font color=gold> NB: </font> 
Elle ne nécessite pas une gestion explicite, mais plutôt une correction de la ligne de code étant à l'origine du bug.


Exemple : 

* <b>NullPointerException</b> : appelée couramment NPE 
* <b>ArrayIndexOutOfBounds</b> : rencontré quand on essai de lire au dela de la limite de la taille d'un tableau.
* <b>ArithmeticException</b> : lorsqu'on effectue une division d'un entier par 0.


