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

