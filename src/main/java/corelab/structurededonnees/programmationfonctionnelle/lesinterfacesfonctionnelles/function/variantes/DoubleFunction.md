#### <font color=red> DoubleFunction < R>  </font>

Optimisé pour éviter l'utilisation d'objets wrapper <b>(Double)</b> et travailler directement avec des primitifs,
ce qui améliore les performances.

Pratique pour effectuer des opérations mathématiques et retourner des objets ou valeurs transformées. 

* <font color=red>Entrée</font> double


* <font color=red>sortie :</font> <b>R</b> (générique).


* <font color=red>Méthode :</font> <b>R apply (double value)</b>


* <font color=red>Exemple  :</font> <b> Convertion de température de celcius en Fahrenheit </b>


        

        1. définition de la fonction lambda de conversion 
        DoubleFunction<Double> celciusToFahrenheit = c -> (c* 9/5)+32 ;

        2.appliquer la fonction à une température donnnée
        Double celcius = 25.0;
        Double temperatureEnFahrenheit = celciusToFahrenheit.apply(celcius);
        System.out.printLn(celcius+" °C = "+fahrenheit+" °F "); 