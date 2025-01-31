#### <font color=red>LE LOGGING </font>

<b>Le Logging</b> en java est une technique permettant d'enregistrer des messages
ou évènements dans une application pour suivre son comportement. Cela est utile pour le débogage, la surveillance, et 
l'analyse d'un système de production. En java, la bibliothèque de logging la plus couramment utilisée est <b>SLF4J, avec
des implémentations comme logback ou log4j2</b>, bien que la bibliothèque standard <b>java.util.logging</b> soit également 
disponible.

En gros, il consiste à ajouter des traitements dans les applications pour permettre l'émission et le stockage 
de messages suite à des événements.

Une API de logging fait généralement intervenir trois composants principaux :

* <font color=gold> Logger :</font> invoqué pour émettre grâce au framework un message <b>généralement avec un niveau de gravité associé.</b>

* <font color=gold>Formatter : </font> utilisé pour formater le contenu du message.

* <font color=gold>Appender : </font> utilisé pour envoyer le message à une cible de stockage : console, fichier, base de données, email, etc...

Les niveaux de gravité permettent de filtrer les messages à envoyer dans les Appenders. En configurant le niveau de gravité voulu au lancement 
d'une application, il est possible d'envoyer ou non des messages à l'éxecution en fonction de leur propre niveau de gravité.


🔥<font color=red> <b>Pourquoi utiliser un système de logging</b></font>

* <b><font color=red> Débogage : </font></b> Identifier les causes de bugs en enregistrant des informations importantes.
* <b><font color=red>Surveillance : </font></b> Suivre les actions des utilisateurs ou le comportement du système.
* <b><font color=red>Analyse en production : </font></b> Etudier les problèmes rencontrés par l'application sans devoir 
redémarrer avec un débogueur.
* <b><font color=red>Remplacement : </font> des system.out.printLn()</b> Les frameworks de logging sont bien plus performant 
et flexible.

🔥<font color=red> <b>Points Importants </b></font>

1. Eviter d'utiliser System.out.printLn() et les printStackTrace() dans les projets réels ; préférez une api de logging.

2. Structurez des logs : Utilisez des messages clairs et évitez les logs excessifs qui pourraient rendre 
difficile l'analyse.

3. Configuration : Adaptez les niveaux de log (TRACE,DEBUG,INFO,etc...) en fonction de l'environnement (développement,test,production).

4. Bibliothèques modernes : Privilégiez SL4J avec Logback ou Log4j pour des projets professionnels.

*** 

<font color=red>Points importants :</font>

Niveaux de log :

<font color=red> TRACE :</font> Messages très détaillés.

<font color=red> DEBUG :</font> Messages de débogage.

<font color=red>INFO :</font> Informations générales.

<font color=red>WARN :</font> Avertissements.

<font color=red>ERROR :</font> Erreurs graves.

<font color=red>FATAL :</font> Erreurs critiques.

<b>Performance :</b>

Évitez les logs excessifs en production pour ne pas impacter les performances.
Utilisez des formats clairs et compréhensibles.
Outils externes :

Les fichiers de logs générés peuvent être analysés avec des outils comme ELK Stack (Elasticsearch, Logstash, Kibana) ou Splunk.

🎁 <font color=red>  IMPORTANT </font>

<b>Priorité des fichiers de configurations </b>

* Log4j2 détecte automatiquement le fichier de configuration dans l'ordre suivant :
    * log4j2.xml
    * log4j2.json/log4j2.yaml
    * log4j2.properties
* Si plusieurs fichiers sont présents, seul le premier dans cet ordre sera utilisé.

<b>Structure du projet </b> 

Assurez-vous que le fichier log4j2.properties soit placé dans src/main/resources, qui est inclus dans le classpath.


