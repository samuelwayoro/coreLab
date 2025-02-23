#### <font color=red> BinaryOperator </font>

* <font color=red>Définition</font>


<b>Interface fonctionnelle qui étend de l'interface BiFuntion et qui prend cette fois deux paramètres de type identique
et qui retourne un résultat de même type que les paramètres : <font color=red> BinaryOperator<T, T, T> </font>.


        @FunctionalInterface
        public interface BinaryOperator<T,T> {

            T apply(T t1,T t2);
        
        }


* <font color=red>T :</font> <b>Type d'entrée des deux paramètres obligatoires</b> (générique).


* <font color=red>T :</font> <b>Type de la sortie</b>


* <font color=red>Exemple :</font> <b>MainBinaryOperator.java</b>
