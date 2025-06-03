### 💡 <font color=red> LES STREAM </font>


<b>Un stream en java est une suite d'éléments, une sequence d'élément sur lesquels des opérations de calcul peuvent
être effectués en parallèle ou séquentiellement.

Un stream se compose d'opérations intermédiaires et d'opérations terminales.

Les opérations intermédiaires prennent en entrée un stream et renvoi un stream.</b>

* EXEMPLE : filter , map , sorted , distinct.

<b>Les opérations terminales produisent un résultat ou un "side-effect". </b>

* EXEMPLE : collect , forEach , reduce.

<b>la syntaxe est : </b>
 
        var variable = collectionObject.stream()
                       .operationInt1(lambda/MethodeDeReference())
                       .operationInt2(lambda/MethodeDeReference())
                       .operationInt3(lambda/MethodeDeReference())
                       .operationTerminale(Classe.methodeDeRetour());

#### 🔥 <font color =red> IMPORTANT </font>

Il faudrait aussi noter que l'api stream obéit au pattern : <b> map -> filter -> reduce </b>.

Avec 

- <font color =red> Map : </font>qui transforme les données sur lesquels on l'applique et qui pourrait en modifier les types 

- <font color =red> Filter : </font>qui comme son nom l'indique filtre les données, ne modifie pas leurs mais pourrais modifier leur quantités.

- <font color =red> Reduce : </font>qui agit comme une opération d'aggregat en SQL , afin d'opérer un calcul. 

