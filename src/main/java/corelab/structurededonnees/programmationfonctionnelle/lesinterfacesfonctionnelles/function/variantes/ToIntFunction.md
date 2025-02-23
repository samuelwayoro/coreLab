#### <font color=red> ToIntFunction < T>  </font>

Optimisé pour convertir, ou renvoyer une valeur de type primitif <b>int</b> à partir d'un objet de type T.

* <font color=red>Entrée</font> T (générique)


* <font color=red>sortie :</font> <b>int</b>


* <font color=red>Méthode :</font> <b>int applyAsInt (T value)</b>



        ToIntFunction<String> stringLength = s -> s.length();

        System.out.printLn(stringLength.applyAsInt("Ciao")); //Affiche : 4
