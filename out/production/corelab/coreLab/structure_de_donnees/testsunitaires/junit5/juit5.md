#### <font color = red> JUnit 5 : LE FRAMEWORK DE TEST MODERNE DE JAVA  </font>

<b> Junit est un framework de test moderne pour java.</b> Il est utilisé pour écrire et exécuter des tests unitaires en java.
Il est puissant que JUnit 4 et offre<b> une meilleure extensibilité , modularité et prise en charge des nouvelles fonctionnalités 
de java (ex : @Tag, @Nested).</b>

<b><font color=green> 1. Architecture de JUnit 5 </font></b>

Junit est composé de 3 sous-projets distincts : 

* <b> JUnit platform :</b> qui est une plateforme permettant d'exécuter des tests avec divers moteurs : JUnit, TestNG,etc...

* <b> JUnit Jupiter :</b> qui est l'API et le moteur de tests principal utilisé pour écrire des tests en JUnit 5.

* <b> JUnit Vintage: </b> qui fournit une compatibilité rétroactive avec JUnit 4 et 3 .

<font color=red> NB : </font> JUnit 5 est modulaire, donc JUnit est obligatoire pour écrire des tests modernes.
Si vous devez exécuter des tests JUnit 4 dans un projet existant, ajoutez aussi JUnit Vintage.


<b><font color=green> 2. Installation de JUnit 5 </font></b>

Il existe plusieurs façons d'installer JUnit dans son projet java . 

1. Manuellement (si vous n'utilisez pas Maven ou Gradle)
2. Avec Maven (si votre projet utilise Maven)
3. Avec Gradle (si votre projet utilise Gradle)

🔥 <font color=red><b> Installation Manuelle (sans gradle ou maven) </b></font>

Si vous n'utilisez pas Maven ou Gradle, vous devez <b>ajouter manuellement les jars de JUnit 5 </b>.

<b> ETAPE 1 : Télécharger les JAR </b>

1- Aller sur le repo maven de JUnit en recherchant : "maven repository central : JUnit 5" sur google

2- Télécharger la version que vous recherchez ou la dernière (recommandée) et ses dépendances : 

* junit-jupiter-api
* junit-jupiter-engine
* junit-platform-commons
* junit-platform-engine


<b> ETAPE 2 : Ajouter ses jars dans l'éditeur </b>

Dans le cas d'IntelliJ : 

* Ouvrez IntelliJ
* Allez dans : File > Project Structure > Modules > Dependencies 
* Cliquer sur "+" > Jar or directories 
* Sélectionnez les jars téléchargés
* cliquez sur Apply > OK 

✅ JUnit est maintenant configuré dans votre projet.


🔥 <font color=red><b> Installation avec Maven </b></font>

Ajoutez ceci dans votre fichier pom.xml du projet : 

    <dependencies>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter</artifactId>
            <version>5.9.3</version> <!-- Vérifiez la dernière version -->
            <scope>test</scope>
        </dependency>
    </dependencies>

✅ IntelliJ détecte automatiquement JUnit et permet d'exécuter les tests avec son <b>runner intégré</b>.


🔥 <font color=red><b> Installation avec Gradle </b></font>

<b> 1- Ajouter les dépendances suivantes dans le fichier : build.gradle</b>

    dependencies{
        testImplementation(platform("org.junit:junit-bom.5.9.3"))
        testImplementation("org.junit.jupiter:junit-jupiter")
    }

    task.test {
        useJUnitPlatform()
    }


<b>Important : </b> On configure également le bloc <font color=red> task.test </font>l'utilisation de la plateforme JUnit
pour que les commandes gradle s'appuient bien sûr le framework de tests pour l'automatisation de l'exécution des tests.

<b> 2- Ajouter la librairie assertJ dans le fichier : build.gradle</b>

Si cette librairie n'est pas obligatoire pour faire fonctionner JUnit, elle permet d'améliorer son fonctionnement.
Il faut l'utiliser afin d'écrire des tests plus lisibles.
Le but de cette librairie est d'offrir des fonctions de vérifications des données pour les tests JUnit qui sont bien mieux
pensées que les fonctions de base de JUnit.

Ajouter la dépendance suivante dans le build.gradle : 

    testImplementation("org.assertj:assertj-core:3.24.2")

<font color=red>NB : vérifier que les librairies sont bien installées avec la commande : </font>
    
    gradle dependencies 

✅ JUnit est maintenant configuré dans votre projet.

<b><font color=green> 3. Écriture des tests avec JUnit 5 </font></b>

🔥 <font color=red> dans IntelliJ, il y a le raccourci clavier suivant permettant de créer une classe de test:</font>

* Depuis la classe dont on veut créer une classe de test, faire : Ctrl+Shift+T, une fenêtre s'ouvre en donnant la main sur 
la création de sa classe de tests en ayant la possibilité de sélectionner les méthodes à tester.

En programmation, le test unitaire est un procédé permettant de s'assurer du fonctionnement correct d'une partie déterminée
d'un logiciel ou d'une portion d'un programme.

Pour les exemples, nous écrirons des tests unitaires sur des méthodes simples qui n'ont pas d'interactions avec d'autres classes
(classe MailVerifier, classe Calculator, classe Addition).

