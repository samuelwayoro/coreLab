### INTRODUCTION AUX EXCEPTIONS

Prenons le programme suivant : 

        var chaine  = "chaine";
        var entier = Integer.parseInt(chaine);

Ce programme compile sans problème. Cependant, à l'exécution, on obtient l'erreur suivante :

        Exception in thread "main" java.lang.NumberFormatException: For input string: "chaine"

C'est ce qu'on appelle une exception. 
Dans notre programme, l'erreur n'est pas gérée, ce qui provoque un bug dans le programme et provoque l'arrêt du programme. Une exception non gérée est donc un vrai problème qu'il nous faut apprendre à régler.

<font color=red> LES TYPES D'ERREURS EN JAVA :</font>

Le diagramme suivant montre comment sont organisées les classes d'erreurs en java :
(voir fichier diagramme_erreurs_java.png).

Tout part à la base de la <font color=red>classe Throwable</font> qui est la <font color=red>classe mère de toutes les
classes
d'erreur et d'exception.</font>

Elle contient :

* <font color=red>une propriété "message" avec sa méthode getMessage() : </font> dont bénéficient toutes ses classes
  filles.
  Elle permet de connaitre le message d'erreur et de l'afficher avec la méthode getMessage().


* <font color=red>une stack trace :</font> qui signifie pile d'appel en français. Elle permet de lister et afficher
  toutes les méthodes
  qui ont été exécutées avant d'aboutir à une Exception, la ligne de l'exception et la méthode qui est à l'origine de
  cette exception.
  Elle est <font color=red> récupérable à l'aide de la méthode "printStackTrace()"</font> qui va permettre d'afficher
  cette stack trace
  dans la console ou sur un autre support (réseau ou base de données).
  Très utile pour fair du debug !


* <font color=red> une root cause : </font> qui signifie cause raçine en français, elle permet de connaître l'erreur qui est à l'origine responsable de l'erreur qu'on obtient dans la console.
