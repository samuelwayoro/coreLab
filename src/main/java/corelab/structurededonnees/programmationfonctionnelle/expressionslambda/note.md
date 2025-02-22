#### <font color=red> LES EXPRESSIONS LAMBDA </font>

Les expressions lambda, introduite en java 8, sont une façon conçise de représenter des fonctions anonymes (sans nom)
qui peuvent :

- être passées comme arguments
- assignées à des variables

<b> Elles sont basées sur les interfaces fonctionnelles, c'est-à-dire des interfaces avec une seule méthode abstraite (comme 
Runnable ou Predicate).</b>

##### 📔 <font color=red> Syntaxe de base :  </font>

        (parametres) -> expression

ou

        (parametres) -> { bloc de code }

<b> Exemple : Pour implémenter une méthode qui fait l'addition de deux entier </b> 

        (a,b) -> a+b ;

<b> Autres exemple de syntax :</b>

    str -> str.length() > 3 //retourne un booléen 
    
    () -> new Person()  // création d'objets

    str -> str.toUpperCase() //Transformation, conversion d'une chaîne en majuscule

    (s) -> {System.out.println(s)} //Afficher une chaîne dans la console

    (a,b) -> a + b  : Calcul //addition de deux nombres

##### 🎯 <font color=red> Objectif :  </font>

Elles simplifient le code, surtout avec les API comme <b>Stream</b>, en évitant les classes anonymes verbeuses.

Par exemple :

- au lieu de définir une classe qui va implémenter une interface (en implémentant sa méthode),
- ou au lieu d'écrire une classe anonyme en implémentant sa méthode à utiliser

<b> tu peux les instancier (via une variable) qui va recevoir l'implémentation directe de la méthode à utiliser.</b>

##### ❗ <font color=red> Exemple </font>

Dans le but de trier les éléments d'une liste de chaîne de caractère, on décide d'utiliser l'interface Comparator.
Voyons comment l'écriture du code est plus verbeuse la classe anonyme et moins avec l'expression lambda pour le même
cas.

* <b> utilisation d'une classe anonyme </b>

        public class Main {

            public static void main (String[] args) {
                
                List<String> list = new ArrayList<>();
                list.add("Charlie");
                list.add("Alice");
                list.add("Bob");


                /** 
                    la classe anonyme Comparator
                    est redéfinie pour comparer deux chaînes avec 
                    compareTo, qui retourne un entier (négatif, zéro ou positif) 
                    selon l’ordre.
                **/
                Collections.sort(liste, new Comparator<String>(){
                    
                    @Override
                    public int compare(String a, String b){
                        return a.compareTo(b); //tri alphabétique
                    }
                });
                System.out.printLn(liste); //[ALice,Bob,Charlie]
              }

          }

* <b> utilisation d'une lambda </b>

        Collections.sort(list,(a,b)-> a.compareTo(b));

##### ⭐ <font color=red> En résumé </font>

* L'utilisation de la classe anonyme est verbeuse, elle nécessite : <b> new Comparator<String>() </b>,
  des accolades et la déclaration explicite de compare.

* Elle est utile quand tu as une logique complexe dans compare, mais pour des cas simples comme celui-ci,
  elle alourdit le code.

* La lambda <b> (a,b) -> a.compareTo(b) </b> fait exactement la même chose, mais en une seule ligne, car Comparator est
  une interface fonctionnelle (une seule méthode abstraite).

