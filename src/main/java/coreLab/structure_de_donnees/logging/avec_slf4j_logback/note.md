#### <font color=red>LOGGING AVEC SLF4J ET LOGBACK (recommandé pour application moderne) </font>


🔥<font color=red> <b>Pourquoi utiliser SLF4J ? </b></font>

* <b><font color=red> Flexibilité : </font></b> C'est une facade (interface) de logging. Elle vous permet de changer
d'implémentation sans modifier votre code.

* <b><font color=red>Interopérabilité : </font></b> Compatible avec plusiseurs bibliothèques de logging avec Logback,Log4j etc...

* <b><font color=red>Syntax claire et puissante </font> </b> 



🔥<font color=red> <b>Comment utiliser SLF4J dans son projet ? </b></font>

<b><font color=red>1/ Importer la dépendance </font></b>

Si vous utilisez Maven : ajouter la dépendance dans le fichier pom.xml du projet 

    <dependencies>
        <!-- SLF4J API -->
        <dependency>
            <groupId>org.slf4j</groupId>
            <artifactId>slf4j-api</artifactId>
            <version>2.0.9</version>
        </dependency>

        <!-- Implémentation Logback -->
        <dependency>
            <groupId>ch.qos.logback</groupId>
            <artifactId>logback-classic</artifactId>
            <version>1.4.11</version>
        </dependency>
    </dependencies>




<b><font color=red>2/ Configuration de Logback (dans le fichier logback.xml) </font></b>

Placer un fichier nommé logback.xml dans le repertoire src/main/resources (à créer si non présent).

    <configuration>
        <!-- Console appender -->
        <appender name="CONSOLE" class="ch.qos.logback.core.ConsoleAppender">
            <encoder>
                <pattern>%d{yyyy-MM-dd HH:mm:ss} %-5level %logger{36} - %msg%n</pattern>
            </encoder>
        </appender>
    
        <!-- Root logger -->
        <root level="debug">
            <appender-ref ref="CONSOLE" />
        </root>
    </configuration>


🚀 <font color=red>LES NIVEAUX (level) DE TRACE SONT </font>

1. <b>TRACE</b> : Messages très détaillés, utilisés pour le suivi du programme
2. <b>DEBUG</b> : Messages utils pour le débogage 
3. <b>INFO</b> : Informations générales sur l'état de l'application  
4. <b>WARN </b> : Signale les problèmes potentiels
5. <b>ERROR : </b> Indique des erreurs graves.

<b><font color=red>3/ Utiliser dans les classes du projet </font></b>


    Slf4jExample.java

    import org.slf4j.Logger;
    import org.slf4j.LoggerFactory;

    public class Slf4jExample {
    private static final Logger logger = LoggerFactory.getLogger(Slf4jExample.class);

        public static void main(String[] args) {
            logger.info("Application démarrée.");
    
            try {
                int result = 10 / 0; // Provoque une exception
            } catch (ArithmeticException e) {
                logger.error("Une erreur s'est produite : Division par zéro", e);
            }
    
            logger.warn("Ceci est une mise en garde.");
            logger.debug("Message de débogage : tout fonctionne bien.");
            logger.info("Application terminée.");
        }
    }

La sortie attendue pour ce bout de code ci-dessus sera de la forme : 

    2025-01-28 12:00:00 INFO  Slf4jExample - Application démarrée.
    2025-01-28 12:00:00 ERROR Slf4jExample - Une erreur s'est produite : Division par zéro
    java.lang.ArithmeticException: / by zero
    at Slf4jExample.main(Slf4jExample.java:10)
    2025-01-28 12:00:00 WARN  Slf4jExample - Ceci est une mise en garde.
    2025-01-28 12:00:00 DEBUG Slf4jExample - Message de débogage : tout fonctionne bien.
    2025-01-28 12:00:00 INFO  Slf4jExample - Application terminée.

