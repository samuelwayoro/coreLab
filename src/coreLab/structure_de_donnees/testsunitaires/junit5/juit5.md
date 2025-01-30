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
