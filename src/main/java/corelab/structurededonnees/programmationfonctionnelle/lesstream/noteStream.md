### 💡 <font color=red> LES STREAM </font>

<i>
Rappel : En programmation fonctionnelle, on décrit le résultat souhaité, mais pas comment on obtient le résultat. 
Ce sont les fonctionnalités sous-jacentes qui se chargent de réaliser les traitements requis en tentant de les exécuter 
de manière optimisée.
</i>
<br/>
<br/>
<b>
L'API Stream facilite l'exécution des données de manière séquentielle ou parallèle.
Les Streams permettent de laisser le développeur se concentrer sur les données et les traitements réalisés sur cet 
ensemble de données sans avoir à se préoccuper de détails techniques de bas niveau comme l'itération sur chacun des 
éléments ou la possibilité d'exécuter ces traitements de manière parallèle. <br/>
Pour cela, cette API se base sur la programmation fonctionnelle.

Un stream en java est une suite d'éléments, une sequence d'élément sur lesquels des opérations de calcul peuvent
être effectués en parallèle ou séquentiellement.


## Le fonctionnement de Stream

Une définition simple d'un Stream pourrait être : « l'application d'un ensemble d'opérations sur une séquence d'éléments
issus d'une source dans le but d'obtenir un résultat ».

<font color=red> Il existe deux catégories d'opérations : </font>

Un stream se compose <font color=yellow> d'opérations intermédiaires</font> et <font color=yellow>d'opérations terminales.</font>

<font color=red>Les opérations intermédiaires prennent en entrée un stream et renvoi un stream.</b></font>

* EXEMPLE : filter , map , sorted , distinct.

<b><font color=red>Les opérations terminales produisent un résultat ou un "side-effect". </b></font>

* EXEMPLE : collect , forEach , reduce.

<b>la syntaxe est : </b>
 
        var variable = collectionObject.stream()
                       .operationInt1(lambda/MethodeDeReference())
                       .operationInt2(lambda/MethodeDeReference())
                       .operationInt3(lambda/MethodeDeReference())
                       .operationTerminale(Classe.methodeDeRetour());


        var villes = List.of("Paris", "Lyon", "Marseille");
        var departements = Map.of(1, "Ain", 2, "Aisnes");

        var villesSteam = villes.stream();
        var departementsStream = departements.entrySet().stream();


Grâce à l'API Stream, il est alors possible de réaliser ce genre d'opérations :

        var entiers = List.of(1, 2, 3, 11, 123, 2);
        var somme = entiers.stream()
                        .filter(v -> v < 10)
                        .count();
            System.out.println(somme);


- <font color=red>Les opérations Intermédiaires : </font> elles peuvent être enchaînées, car elles renvoient un Stream
  Dans l'exemple ci-dessus, la méthode filter est une méthode intermédiaire qui retourne un Stream d'éléments filtrés


- <font color=red>Les opérations terminales : </font> elles renvoient une valeur différente d'un Stream (
ou pas de valeur) et ferme le Stream à la fin de leur exécution.

    - Dans l'exemple ci-dessus, la méthode count est une méthode terminale qui retourne un entier (le nombre d'éléments restants) 
    et non un Stream qui ne serait pas vraiment utilisable en tant que telle pour l'utilisation des données traitées.

      
#### 🔥 <font color =red> IMPORTANT </font>

Il faudrait aussi noter que l'api stream obéit au pattern : <b> map -> filter -> reduce </b>.

Avec 

- <font color =red> Map : </font>qui transforme les données sur lesquels on l'applique et qui pourrait en modifier les types 

- <font color =red> Filter : </font>qui comme son nom l'indique filtre les données, ne modifie pas leurs mais pourrais modifier leur quantités.

- <font color =red> Reduce : </font>qui agit comme une opération d'aggregat en SQL , afin d'opérer un calcul. 

#### 📒 <font color =red> La différence entre les collections et les streams</font>



Bien que les collections et les Streams semblent avoir des similitudes, ils ont des objectifs différents :  

* Les collections permettent de gérer et de récupérer des données qu'elles stockent.
* Les Streams assurent l'exécution lazy de traitements déclarés sur des données d'une source.
  * Les données ne sont pas stockées dans un Stream mais les données sont chargées quand on en a besoin. ça permet de traiter
   les différents éléments d'une source en appliquant différentes opérations.

Stream porte bien son nom, car ça se traduit par flux en français.

</b>

