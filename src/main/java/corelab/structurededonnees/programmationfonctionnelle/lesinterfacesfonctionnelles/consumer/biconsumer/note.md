#### <font color=red> BiConsumer < T, U >  </font>


* <font color=red>Description</font> il s'agit d'une variante de l'interface fonctionnelle Consumer<T> qui défini la méthode void accept(T t , U u);


* <font color=red>Méthode principale :</font> <b>void accept(T t, U u)</b>.

Exemple : Implémentation d'un BiConsumer<T,U> de java.util


    Consumer<String,Intger> afficher = (s,1) -> System.out.println("s"+1) ;
