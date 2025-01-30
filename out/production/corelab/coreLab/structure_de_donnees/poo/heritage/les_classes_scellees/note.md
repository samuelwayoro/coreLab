#### <font color=red>LES CLASSES SCELLÉES EN JAVA </font>

<font color=red> <b> les classes scellées (sealed classes) java 15 en preview et stabilisé en 
java 17.</b> </font> Elles permettent de <font color=red> <b> restreindre l'héritage en spécifiant quelles classes peuvent étendre
une classe ou implémenter une interface.</b></font>.

***
<font color=red><b> 1. Pourquoi utiliser les classes scellées </b></font>

Les classes scellées permettent :

* <b> Un meilleur contrôle de l'héritage : </b> On peut limiter les sous-classes possibles.

* <b> Une meilleure sécurité : </b> On empêche l'extension non autorisée d'une classe.

* <b> Une meilleure gestion des cas d'utilisation : </b> Utile avec <b>switch</b> et <b>instanceof</b> pour s'assurer que tous les cas sont couverts.

***
<font color=red><b> 2. Définition d'une classe scellée </b></font>

Une classe scellée est définie avec le mot-clé <b>permits</b> pour spécifier les classes autorisées à l'étendre.

* <font color=gold><b>Exemple : </b></font>
Définition d'une classe scellée Animal

        sealed class Animal permits Chien,Chat,Oiseau {

            String nom;
            Animal(String nom){ this.nom = nom;}

        }
Ici : 
* Animal est une classe <font color=red> scellée </font>.
* Seules les classes <b>Chien,Chat et Oiseau</b> peuvent hériter de <b> Animal</b>.

***

<font color=red><b> 3. Les sous-classes d'une classe scellée </b></font>

<b> Les sous-classes d'une classe scellée doivent obligatoirement être : </b>

- <b>final</b> : Empêchant toute sous-classification supplémentaire (exemple la classe Chien). La classe Chien est 
<b>final, donc personne ne peut hériter de lui</b>.


- <b>sealed</b> : Prolongeant le scellement à d'autres classes (exemple la classe Chat qui "permits" alors à son 
tour la classe <b>Siamois</b>). Elle ne peut qu'être extends que par la classe <b>Siamois</b>.  


- <b> non-sealed</b> : Autorisant l'héritage libre à partir de cette sous-classe (exemple la classe Oiseau). N'importe qu'elle classe peut l'étendre.

      final class Chien extends Animal {
        Chien(String nom) { super(nom); }
      }
      
      sealed class Chat extends Animal permits Siamois {
        Chat(String nom) { super(nom); }
      }
      
      non-sealed class Oiseau extends Animal {
        Oiseau(String nom) { super(nom); }
      }
      
      final class Siamois extends Chat {
        Siamois(String nom) { super(nom); }
      }


<font color=red> NB :</font> Siamois qui étend la classe Chat est final, donc ne peut pas être héritée.

*** 

<font color=red><b> 4. Utilisation avec switch </b></font>

Les classes scellées sont très utiles et faciles d'utilisation avec <b>switch et instanceof </b>.

<b> Exemple</b>: Attention pour l'utilisation de la syntax switch, se reporter a la version du JDK .

    public static void afficherAnimal(Animal animal) {
      switch (animal) {
          case Chien c -> System.out.println("C'est un chien : " + c.nom);
          case Chat ch -> System.out.println("C'est un chat : " + ch.nom);
          case Oiseau o -> System.out.println("C'est un oiseau : " + o.nom);
      }
    }
