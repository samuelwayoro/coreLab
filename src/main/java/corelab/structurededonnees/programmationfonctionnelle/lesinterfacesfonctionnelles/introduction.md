#### <font color=red> LES INTERFACES FONCTIONNELLES  </font>

<b> Une interface fonctionnelle</b> est une interface qui contient <b>exactement une méthode abstraite</b> (elle peut 
avoir d'autres méthodes par défaut ou statiques, mais une seule abstraite). 

Elle sert de base pour utiliser des expressions lambda ou des références de méthode, car java peut les associer directement
à cette unique méthode.

* Annoté avec <b>@FunctionalInterface</b> (optionnel, mais recommandé pour la clarté et pour que le compilateur vérifie).
* Exemples dans la JDK : <font color=red> Runnable, Comparator, Predicate, Function, etc.</font>

***

##### 📔 <font color=red> Pourquoi elles sont importantes ? </font>

* Elles permettent d'écrire du code avec lambdas au lieu de classes anonymes 

* Elles sont au cœur des API modernes comme <font color=red> Stream, Optional</font> et les collections en java.


#### ❗ <font color=red> Exemple </font> : l'interface Runnable

        @FunctionalInterface
        public interface Runnable {
            void run();
        }


* Avant Java 8 : on l'utilisait en instanciant une Classe anonyme 

        //instanciation 
        Thred t = new Thread (New Runnable () {
            
                @Override
                public void run() {
                    System.out.println("Bonjour !");
                }
        });
        
        //utilisation 
        t.start();

* Depuis java 8+ : utilisation avec une lambda

        Thread t = new Thread(()-> System.out.printLn("Bonjour !"));
        t.start();

<font color=red> ici, ()-> System.out.println("Bonjour !"); implémente run(); </font>        

******

##### 📔 <font color=red> Interfaces Fonctionnelles courantes dans : java.util.function </font>

Java8 a introduit un paquetage dédié, java.util.function, avec des interfaces prêtes à l'emploi.
Voici les plus utilisés. 

##### 1. <font color=red> Function<T,R> </font> Transforme une valeur en une autre

* Méthode : R apply (T t)
* Exemple : 

        Function<String,Integer> longeur = s->s.length();
        System.out.printLn(longeur.apply("Salut"));

##### 2. <font color=red> Consumer<T.> </font> Consomme une valeur sans rien retourner 

* Méthode : R accept (T t)
* Exemple :

        Consumer<String> afficher = s-> System.out.printLn(s);
        afficher.accept("Helloooo"); //Helloooo


##### 3. <font color=red> Predicate<T.> </font> Teste une condition

* Méthode : boolean test (T t)
* Exemple :

        Predicate<String> estLong = s-> s.length(s) > 5;
        System.out.printLn(estLong.test("Bonjour")); //true


##### 4. <font color=red> Supplier<T.> </font> Fournit une valeur sans prendre d'argument

* Méthode : T get()
* Exemple :

        Supplier<String> message = ()-> "Salut !";
        System.out.printLn(message.get()); // Salut !

****
##### 📔 <font color=red> Créer sa propre interface fonctionnelle </font>

Tu peux définir tes propres interfaces fonctionnelles.

Exemple : 

        @FunctionalInterface
        public interface Calcul {
            int operation( int a, int b);
        }

        public class Main {
            
            public static void main(String[] args){
                
                Calcul addition = (a,b) -> a+b;
                Calcul multiplication = (a,b) -> a*b;

                System.out.printLn(addition.operation(3,4)); //7
                System.out.printLn(multiplication.operation(3,4));//12

            }

        }

❗ <font color=gold> @FunctionalInterface </font> garantit qu'il n'y a qu'une seule méthode abstraite (sinon, erreur de compilation). 

***

##### 🔥 <font color=red> Caractéristiques importantes </font>

<font color=red> 1. Méthodes par défaut et statiques : </font> 

* Une interface fonctionnelle peut avoir des méthodes <b>default</b> ou <b>static</b>, tant qu'il n'y a qu'une seule
méthode abstraite.

Exemple: 

    @FunctionalInterface
    interface MontInterface {

          void doSomething(); //méthode abstraite

          default void saluer(){
              System.out.println("Salut !");
          }
    }


<font color=red> 2. Compatibilité avec les lambdas : </font> 

* UNE LAMBDA NE FONCTIONNE QUE SI L'INTERFACE CIBLE EST FONCTIONNELLE. SI ELLE A PLUSIEURS METHODES ABSTRAITES
JAVA NE SAURA PAS QUOI ASSOCIER A LA LAMBDA . 

***

##### 🔥 <font color=red> Quand les utiliser ? </font>

* <font color=red> Simplification de code</font> : Remplace les classes anonymes lourdes (comme Comparator ou ActionListener).

* <font color=red> API Stream</font> : Les interfaces comme Function, Predicate, etc sont partout dans les flux : 

        List<String> noms = Arrays.asList("Alice","Bob","Charlie");
      
        noms.stream()
            .filter(n -> n.length() > 3) //Predicate
            .map( n-> n.toUpperCase()) // Function
            .forEach(System.out::printLn); //Consumer 

            //ce code affiche ["Alice","CHARLIE"]

* <font color=red> Flexibilité</font> : Permet de passer des comportements (fonctions) comme arguments à des méthodes. 

***

##### 🔥 <font color=red> Conseils pratiques ? </font>

* <font color=red> Privilégie les interfaces existantes</font> :

Utilise <b>Predicate</b>, <b>Function</b> etc, avant de créer les tiennes, sauf en cas de besoins spécifique.

* <font color=red> Lisibilité </font>: les lambdas sont puissantes, mais si elles deviennent trop complexes (trop de lignes) envisage une méthode classique pour la clarté. 

* <font color=red> Annotations </font>: Ajoute @FunctionalInterface pour éviter des erreurs futures si quelqu'un ajoute une méthode abstraite par mégarde.
