#### <font color = red>LES MODULES </font>

#### Les rapports de tests

En Java, un module est une unité de code introduite avec Java 9 pour améliorer l'encapsulation et la gestion des
dépendances. Un module est un regroupement de classes, interfaces et ressources qui déclarent explicitement quelles
parties sont accessibles aux autres modules et quelles dépendances sont requises.

#### Principales caractéristiques des modules en java

1.<b>Déclaration : </b>
Un module est défini dans un fichier <font color=red>module-info.java</font> placé à la racine
du module.

2.<b>Encapsulation forte :</b>
Il permet de cacher certaines classes qui ne doivent accessible en dehors du module.

3.<b>gestion des dépendances : </b>
Un module doit déclarer explicitement les autres modules dont il dépend.

#### Exemple d'un module en Java

Dans un projet avec un module <b>com.exemple.utils</b>

    com.exemple.utils/
        module-info.java
        com/exemple/utils/
            Utilitaire.java

<b>module-info.java</b>

    module com.exemple.utils {
        // Rend ce package accessible aux autres modules
        exports com.exemple.utils; 
    }

<b> Classe : Utilitaire.java </b>

    package com.exemple.utils;

    public class Utilitaire {
        public static void afficherMessage() {
            System.out.println("Hello depuis un module !");
        }
    }

<font color=red>Utilisation dans un autre module </font>

Si un second module <b>com.exemple.app</b> veut utiliser <b>com.exemple.utils</b>, il doit :

<font color=gold> 1. Déclarer la dépendance dans son module-info.java </font>

    module com.exemple.app {
        requires com.exemple.utils;
    }

<font color=gold> 2. Importer et utiliser la classe Utilitaire.java </font>

    import com.exemple.utils.Utilitaire;

    public class Main {
        public static void main(String[] args) {
            Utilitaire.afficherMessage();
        }
    }

#### Avantages des modules

✅ Meilleure encapsulation du code.

✅ Gestion efficace des dépendances

✅ Réduction des conflits de classes

✅ Optimisation du temps de chargement.

Les modules sont particulièrement utiles dans les grands projets, notamment avec java jigsaw (projet ayant introduit le
système
de module dans Java 9), pour créer des applications plus modulaires et sécurisées.

#### Infos complémentaires et cas pratiques : 

https://www.baeldung.com/java-modularity
