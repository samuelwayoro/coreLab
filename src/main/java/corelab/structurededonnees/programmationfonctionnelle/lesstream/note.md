### 🔥 LA PROGRAMMATION FONCTIONNELLE 

Paradigme de programmation qui considère le calcul comme l'évaluation de fonctions mathématiques et évite les 
changements d'états des données mutables.

En Java, c'est une approche de codage introduite depuis la version 8 , permettant d'écrire du code de manière déclarative 
en se basant sur :

* des fonctions (via les lamdas)
* des structures de données immuables 
* des transformations de données (via les streams)
* une réduction des effets de bord 


#### 🔑 <font color=red> Concepts fonctionnels appliqués a java </font>

<b>1. Fonctions pures </b>

Une fonction pure en java est une méthode qui : 

- dépend de ses paramètres
- ne modifie rien d'extérieur (pas d'état global, pas d'I/O)

        int square(int x){
            return x*x;
        }

<b>2. Immutabilité </b>

Plutôt que de modifier les objets, on crée de nouvelles instances : 

        List<String> original = List.of("a","b");
        List<String> upper = original.Stream().map(String::toUpperCase).toList();//nouvelle liste créee


<b>3. Expression Lambda </b> 

Les lambdas permettent de traiter les fonctions comme des objets.

        Function<Integer, Integer> doubleIt = x -> x*2;
        System.out.PrintLn(doubleIt.apply(5)); // affiche 10

<b>4. API Stream </b>

Les streams permettent de transformer des collections de manière fluide, lisible, et sans boucle explicite. 

        List<String> names = List.of("Alice","Bob","Charlie");
        
        List<String> result = names.stream().
                              .filter(name -> name.length() > 3)
                              .map( String::toUpperCase())
                              .collect(Collectors.toList());


<b>5. Interfaces fonctionnelles </b> 

Java fournit des interfaces comme : 

* FUNCTION< T, R > 
* CONSUMER< T > 
* PREDICATE< T >
* SUPPLIER< T >

Qui permettent d'écrire du code plus modulaire et réutilisable :

        Predicate<String> isLongName = name -> name.length() > 5 ;


##### ✅ <font color=green> Avantages en JAVA</font>

- code plus déclaratif et concis 
- facilite le traitement parallèle (grâce aux paralleStream())
- moins d'effets de bord = code plus fiable 
- plus adopté aux API réactives (CompletableFuture, Project reactor, RxJava, etc)


##### ⚠ <font color=yellow> Limites en JAVA</font>

- Java reste orienté objet, donc pas aussi fonctionnel que Scala ou Haskell
- La syntaxe est plus lourde que dans les langages purement fonctionnels 
- Immutabilité non forcée par le langage (pas de val, const, etc).