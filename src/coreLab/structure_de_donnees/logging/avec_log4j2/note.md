#### <font color=red> LOGGING AVEC LOG4J2 </font>

Le framework LOG4J2 est une bibliothèque puissante et populaire pour gérer le logging 
dans les projets java. Elle est connue pour sa flexibilité et ses nombreuses fonctionnalités.


<font color=red> <b>Comment utiliser LOG4J2 ? </b></font>

🔥<font color=red> 1-  IMPORTER LA DEPENDANCE DANS LE PROJET </font>

<font color=red> PROJET JAVA SIMPLE </font>
<br/>

<b> a) Téléchargez les bibliothèques Log4j2 : </b>

Rendez-vous sur le site officiel de Apache Log4j2, Téléchargez le fichier log4j-2.x.bin.zip (oû x correspond à la version 
la plus récente, comme 2.20.0).

<b> b) Extraire le fichier </b>

Une fois le fichier, téléchargé, extrayez-le. Vous obtiendrez un dossier contenant plusieurs JAR.

<b> c) Identifiez les fichiers JAR nécessaires : </b>

Les fichiers essentiels sont : <font color=red>log4j-api-2.x.jar</font> et <font color=red>log4j-core-2.x.jar</font>.
Ces fichiers se trouvent dans le dossier extrait (par exemple : <b>apache-log4j-2.x-bin).</b>

<b> d) Ajoutez les JAR au projet IntelliJ </b>
    
<font color=red>PROJET MAVEN</font> 

Pour utiliser Log4j 2, ajoutez ces dépendances dans votre fichier Maven (pom.xml).

    Pom.xml

    <dependencies>
        <!-- API Log4j -->
        <dependency>
            <groupId>org.apache.logging.log4j</groupId>
            <artifactId>log4j-api</artifactId>
            <version>2.20.0</version>
        </dependency>
        <!-- Implémentation Core Log4j -->
        <dependency>
            <groupId>org.apache.logging.log4j</groupId>
            <artifactId>log4j-core</artifactId>
            <version>2.20.0</version>
        </dependency>
    </dependencies>



<font color=red>projet GRADLE</font>
    

    implementation 'org.apache.logging.log4j:log4j-api:2.20.0'
    implementation 'org.apache.logging.log4j:log4j-core:2.20.0'


🔥 <font color=red> 2- CONFIGURER LE LOG4J2  </font>


<font color=red><b>Dans un fichier xml :</b> log4j.xml dans src/main/resources</font>

    <?xml version="1.0" encoding="UTF-8"?>
    <Configuration status="WARN">
        <!-- Définir un appender pour la console -->
        <Appenders>
            <Console name="ConsoleAppender" target="SYSTEM_OUT">
                <PatternLayout pattern="%d{yyyy-MM-dd HH:mm:ss} [%t] %-5level %logger{36} - %msg%n" />
            </Console>
        </Appenders>

        <!-- Définir le niveau de logging pour la racine -->
        <Loggers>
            <Root level="info">
                <AppenderRef ref="ConsoleAppender" />
            </Root>
        </Loggers>
    </Configuration>

Ici : 

* Les logs sont affichés dans la console.
* Le format des logs inclut la date, le thread, le niveau, le logger et le message.
* Le niveau de log par défaut est <b>INFO</b>.

<font color=red><b>Dans un fichier ".properties" :</b> log4j2.properties dans src/main/resources</font>

Créer un fichier log4j2.properties et placez le dans le dossier src/main/resources.

    log4j2.properties
    
    # Niveau de logging par défaut pour la racine
    rootLogger.level = info
    rootLogger.appenderRefs = console
    rootLogger.appenderRef.console.ref = ConsoleAppender
    
    # Configuration de l'appender pour la console
    appender.console.type = Console
    appender.console.name = ConsoleAppender
    appender.console.target = SYSTEM_OUT
    appender.console.layout.type = PatternLayout
    appender.console.layout.pattern = %d{yyyy-MM-dd HH:mm:ss} [%t] %-5level %logger{36} - %msg%n


Dans cet exemple :

* Le niveau de log pour la racine est défini à INFO.
* Les logs sont affichés dans la console avec un format personnalisable.

<font color=red> CONFIGURATION AVANCEE POSSIBLE :  </font>

Il est possible d'ajouter un file appender pour enregistrer les logs dans un fichier.

<b>Exemple :</b> 

    # Niveau de logging par défaut pour la racine
    rootLogger.level = debug
    rootLogger.appenderRefs = console, file
    rootLogger.appenderRef.console.ref = ConsoleAppender
    rootLogger.appenderRef.file.ref = FileAppender
    
    # Configuration de l'appender pour la console
    appender.console.type = Console
    appender.console.name = ConsoleAppender
    appender.console.target = SYSTEM_OUT
    appender.console.layout.type = PatternLayout
    appender.console.layout.pattern = %d{yyyy-MM-dd HH:mm:ss} [%t] %-5level %logger{36} - %msg%n
    
    # Configuration de l'appender pour le fichier
    appender.file.type = File
    appender.file.name = FileAppender
    appender.file.fileName = logs/app.log
    appender.file.append = true
    appender.file.layout.type = PatternLayout
    appender.file.layout.pattern = %d{yyyy-MM-dd HH:mm:ss} [%t] %-5level %logger{36} - %msg%n

Il est possible de configurer des loggers pour des classes ou des packages spécifiques.

<b>Exemple : </b> 

    # Niveau de logging par défaut pour la racine
    rootLogger.level = info
    rootLogger.appenderRefs = console, file
    rootLogger.appenderRef.console.ref = ConsoleAppender
    rootLogger.appenderRef.file.ref = FileAppender
    
    # Logger pour un package spécifique
    logger.myPackage.name = com.example
    logger.myPackage.level = debug
    logger.myPackage.appenderRefs = console
    logger.myPackage.appenderRef.console.ref = ConsoleAppender
    
    # Configuration de l'appender pour la console
    appender.console.type = Console
    appender.console.name = ConsoleAppender
    appender.console.target = SYSTEM_OUT
    appender.console.layout.type = PatternLayout
    appender.console.layout.pattern = %d{yyyy-MM-dd HH:mm:ss} [%t] %-5level %logger{36} - %msg%n
    
    # Configuration de l'appender pour le fichier
    appender.file.type = File
    appender.file.name = FileAppender
    appender.file.fileName = logs/app.log
    appender.file.append = true
    appender.file.layout.type = PatternLayout
    appender.file.layout.pattern = %d{yyyy-MM-dd HH:mm:ss} [%t] %-5level %logger{36} - %msg%n

Dans cet exemple :

* Les logs pour la classe ou <b>le package com.example ont un niveau DEBUG</b>.
* Le logger com.example n'utilise que l'appender console.


🔥 <font color=red> 3- Utilisez l'instance de Log4j 2 dans les classes </font>


<b> 1- Créer un logger  </b>

Les loggers sont en général créés de la manière suivante : 

    private static Logger logger = LogManager.getLogger(nomClass.class);

Le fait de passer la classe à la méthode getLogger() la classe dans laquelle le Logger est défini permet de définir des 
loggers par classe. Ce découpage n'est pas obligatoire et peut-être différent, mais c'est en général une bonne approche.
Cela permet de savoir à tout moment de quelle partie du code les messages de logs sont affichés.

<b> 2- Utilisation du Logger </b>

On peut ensuite utiliser le logger de la manière suivante dans les méthodes de la classe : 
    
    logger.error("message d'erreur");

Cette instruction permet de lancer un message d'erreur dans la console, du moins par défaut. Nous verrons comment changer la 
cible du message avec les Appenders.

<b> 3- Niveaux de sévérité et configuration </b>

<b> la méthode error()</b> n'est pas la seule méthode disponible dans la classe Logger. Il est possible d'utiliser différentes
méthodes qui correspondent toutes à un niveau de sévérité différent : 


<font color=gold><b>logger.fatal("message d'erreur fatal");</b></font>

<font color=gold><b>logger.error("message d'erreur");</b></font>

<font color=gold><b>logger.warn("message d'avertissement");</b></font>

<font color=gold><b>logger.info("message d'information");</b></font>

<font color=gold><b>logger.debug("message de debogage");</b></font>

<b> Par défaut le niveau de sévérité de LOG4J est ERROR</b>. Cela signifie que tous les messages avec un niveau de sévérité 
en dessous de celui-ci c'est-a-dire : <b>WARN,INFO et DEBUG ne sont pas traités</b>.

On peut alors configurer le niveau de sévérité afin de permettre l'utilisation de ces autres méthodes depuis le fichier 
de configuration : <b> log4j.xml ; log4j.yaml ou log4j.properties </b> en fonction de votre application.

<b> Exemple : </b>

Configuration du fichier log4j2.properties dans lequel on configure un <b> Appender</b> qui écrit les messages de log 
dans la console. 

    appender.console.type = Console
    appender.console.name = consoleLogger
    appender.console.layout.type = PatternLayout
    appender.console.layout.pattern = %d{yyyy-MM-dd HH:mm:ss} %-5p %c{1}:%L - %m%n
    
    rootLogger.level=debug
    rootLogger.appenderRef.stdout.ref=consoleLogger

<b><font color=red> NB : </font> Le rootLogger</b> est la configuration parente de tous les autres loggers. Elle permet 
d'appliquer la même configuration à l'ensemble des loggers de toutes les classes notre appli en une seule fois .

Un exemple de code d'une classe java : 


    Log4jExample.java 

    import org.apache.logging.log4j.LogManager;
    import org.apache.logging.log4j.Logger;

    public class Log4jExample {
    // Créer un logger pour la classe
    private static final Logger logger = LogManager.getLogger(Log4jExample.class);
    
        public static void main(String[] args) {
            logger.info("L'application a démarré.");
    
            try {
                int result = 10 / 0; // Provoque une exception
            } catch (ArithmeticException e) {
                logger.error("Erreur : Division par zéro", e);
            }
    
            logger.warn("Ceci est une mise en garde.");
            logger.debug("Message de débogage.");
            logger.info("L'application est terminée.");
        }
    }


<b>Sortie attendue en dans la console (avec la configuration donnée) : 
    
    2025-01-28 12:00:00 [main] INFO  Log4jExample - L'application a démarré.
    2025-01-28 12:00:00 [main] ERROR Log4jExample - Erreur : Division par zéro
    java.lang.ArithmeticException: / by zero
    at Log4jExample.main(Log4jExample.java:12)
    2025-01-28 12:00:00 [main] WARN  Log4jExample - Ceci est une mise en garde.
    2025-01-28 12:00:00 [main] INFO  Log4jExample - L'application est terminée.
