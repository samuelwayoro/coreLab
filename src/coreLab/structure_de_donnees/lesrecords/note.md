#### <font color=red>LES RECORDS </font>

Les Records sont une fonctionnalité introduite dans Java 14
et officiellement stabilisé dans Java 16.
Ils simplifient la création de classe immuable, c'est-à-dire 
dont les champs ne peuvent être modifiés après leur initialisation, et qui sont 
principalement utilisés pour transporter des données. 

***
🔥<font color=red>QU'EST CE QU'UN RECORD EN JAVA ? </font>

Un record est une nouvelle manière de définir une classe contenant des champs immuables appelés : 
components (composants).
Les records permettent de réduire le code répétitif (boilerplate en anglais), comme les getters,
setters, les méthodes equals();hashcode() et toString().

***

🔥<font color=red>SYNTAX DE BASE DE RECORD</font>
    
    public record recordName(type componentName1, type componentName2){}

<b>Exemple:</b>

    public record Point(int x, int y){}

Cela revient à écrire une classe classique qui inclut :

- <font color=red>un constructeur par défaut, initialisant x et y </font>
- <font color=red>Les méthodes x() et y() pour accéder aux champs comme des getters </font>
- <font color=red>Une méthode equals() pour comparer les objets</font>
- <font color=red> Une méthode hashCode() </font>

***
🔥<font color=red>Exemple d'utilisation </font> voir la classe MainTest

***

🚀  <font color=red>DETAILS IMPORTANTS SUR LES RECORDS </font>

- <font color=red> Immutabilité : </font>

  * Les champs d'un record sont "final" par défaut, ce qui signifie qu'ils ne peuvent pas être modifié
après initialisation.
  * Cela rend les records parfaits pour les objets immuables.
  
- <font color=red>Accesseurs automatiques : </font>

    * Les accesseurs (getters) sont automatiquement générés pour chaque components (paramètres écrits dans le constructeur,
  dans la signature du record).
    * <b>Le nom de l'accesseur correspond au nom du champ : pour un component x, la méthode d'accès sera x() et non getX()</b>
  
- <font color=red> Constructeur compact</font> :
  