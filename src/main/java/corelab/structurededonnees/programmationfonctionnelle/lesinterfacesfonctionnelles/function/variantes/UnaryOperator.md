#### <font color=red> UnaryOperator < T>  </font>


* <font color=red>Rôle</font> 
Sous interface de Function, elle représente une fonction qui prend un seul argument et renvoie un résultat du même type ( T -> T ).

  
* <font color=red>Méthode :</font> <b>T apply (T t)</b>

        @FunctionalInterface
        public interface UnaryOperator<T > extends Function <T, T> {
            
            T apply(T t);
        
        }