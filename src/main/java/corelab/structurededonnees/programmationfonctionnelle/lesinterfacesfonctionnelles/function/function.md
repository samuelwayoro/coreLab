#### <font color=red> FUNCTION <T, R>  </font>

* <font color=red>Description</font> Représente une fonction qui prend un argument d'un type <b>T</b> en entrée et produit un résultat d'un autre type <b>R</b>.


* <font color=red>Méthode abstraite :</font> <b>R apply(T t)</b>.


* <font color=red>Méthode par défaut :</font> <b>andThen et compose</b> pour chaîner des opérations.
Ensuite <b>Identity</b> pour retourner une fonction qui renvoie son entrée telle quelle.


* <font color=red>Variantes :</font> <b>IntFunction< R>, LongFunction<R >, DoubleFunction< R>, 
ToIntFunction< R>, ToLongFunction< T> , ToDoubleFunction< T>, 
  

  * BiFunction<T , U> : variante avec deux arguments et qui a des sous variantes : ToIntBiFunction, ToLongBiFunction, 
  ToDoubleBiFunction </b> 


  * <b> UnaryOperator < T > : Variante ou entrée et sortie sont du même type.
    Avec pour sous variante IntUnaryOperator, LongUnaryOperator, DoubleUnaryOperator.</b>


##### 📔 <font color=red> Exemple :  </font> MainFunction.java

##### ⭐ <font color=red> Utilité :</font> Très pratique dans les streams java (par exemple, avec map) pour transformer des données.

##### ⭐ <font color=red> Flexibilité :</font> Peut être utilisé dans des cas simples ou pour des transformations complexes d'objets.

##### ⭐ <font color=red> Méthode statique :</font> Function.identity() retourne une fonction qui renvoie simplement son argument (utile dans certains comme des comparateurs ou des mappings directs).


##### ❗ <font color=red> Résumé des variantes :</font>

| Interface                                      | Entrée | Sortie | Cas d'utilisation             |
|------------------------------------------------|--------|--------|-------------------------------|
| <font color=red> Function<T, R> </font>        | T      | R      | Transformation générale       |
| <font color=red> IntFunction < R > </font>     | Int    | R      | Entrée primitive <b>int</b>   |
| <font color=red> BiFunction <T, U, R>  </font> | T,U    | R      | Deux arguments                |
| <font color=red> UnaryOperator < T> </font>    | T      | T      | Entrée et sortie du même type |
| <font color=red> IntUnaryOperator </font>      | int    | int    | Opération sur int             |

