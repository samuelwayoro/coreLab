#### <font color=red> BiFunction < T, U, R>  </font>

L'interface <b>BiFunction</b> est une extension de <b>Function</b> qui prend deux arguments en entrée au lieu d'un seul.

* <font color=red>Définition</font> 

        
        @FunctionalInterface
        public interface BiFunction<T,U,R> {

            R apply(T t,U u);
        
        }
        

* <font color=red>T , U  :</font> <b>Type d'entrée</b> (générique).


* <font color=red>R :</font> <b>Type de la sortie</b>


* <font color=red>Exemple :</font> <b>MainBiFunction.java</b>



🌟 <font color=red>Variantes pour type primitifs :</font> 
<b> ToIntBiFunction <T, U> , ToLongBiFunction< T,U> , ToDoubleFunction<T, U></b>

Ces versions renvoient directement un type primitif (int,long, ou double).