LA GENERICITE EN JAVA :

la généricté est un concept dans le developpement qui permet de parametrer une classe en Java . 

Elle permet : 

d'Indiquer le paramètre générique formel entre < et > (entre cheuvrons) de sorte a permettre une substitution de ce paramètre 
par un type donné à l'instantition de l'objet de la classe . 
le paramètre est nommé selon une convention : 

-E : éléments , très utilisé dans le framework Collections en java 
-K : clef , utilisé comme dans les Map 
-N : nombre 
-T : type (seulement les type objets pas de type primitif)
-V : valeur 

exemple : utilisation de la classe Container<T>

Il est aussi possible de créer des méthodes générique qui permettent d'utiliser des objets de type générique en paramètres 
et de renvoyer en resultant ou non des objets de type générique .

exemple 1 : utilisation de la méthode <K,V> boolean Comparateur() de la classe TestCouple() .

exemple 2 : utilisation de la méthode <T> T getElementAleatoire(T[] valeurs) de la classe TestMethodeGenerique(). 

 