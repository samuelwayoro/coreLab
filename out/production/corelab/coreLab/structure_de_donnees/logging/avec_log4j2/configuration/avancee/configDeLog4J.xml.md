#### <font color=red> CONFIGURATION AVANCEE DE LOG4J DANS UN FICHIER XML  </font>

Il est possible de configurer log4j2 pour enregistrer les logs dans un fichier :


    <?xml version="1.0" encoding="UTF-8"?>
    <Configuration status="WARN">
        <Appenders>
            <!-- Console Appender -->
            <Console name="ConsoleAppender" target="SYSTEM_OUT">
                <PatternLayout pattern="%d{yyyy-MM-dd HH:mm:ss} [%t] %-5level %logger{36} - %msg%n" />
            </Console>
    
            <!-- File Appender -->
            <File name="FileAppender" fileName="logs/app.log" append="true">
                <PatternLayout pattern="%d{yyyy-MM-dd HH:mm:ss} [%t] %-5level %logger{36} - %msg%n" />
            </File>
        </Appenders>
    
        <Loggers>
            <!-- Logger de la racine -->
            <Root level="debug">
                <AppenderRef ref="ConsoleAppender" />
                <AppenderRef ref="FileAppender" />
            </Root>
        </Loggers>
    </Configuration>

Avec cette configuration :

1. Les logs sont affichés dans la console ET enregistré dans le fichier logs/app.log
2. Le niveau de log minimal est DEBUG.


#### <font color=red> AJOUTER DES LOGGERS SPECIFIQUES </font>

Vous pouvez définir différents loggers pour différentes parties de votre application.


        log4j2.xml

        <?xml version="1.0" encoding="UTF-8"?>
        <Configuration status="WARN">
            <Appenders>
                <Console name="ConsoleAppender" target="SYSTEM_OUT">
                    <PatternLayout pattern="%d{yyyy-MM-dd HH:mm:ss} [%t] %-5level %logger{36} - %msg%n" />
                </Console>
            </Appenders>
    
            <Loggers>
                <!-- Logger spécifique pour une classe -->
                <Logger name="com.example.MyClass" level="debug" additivity="false">
                    <AppenderRef ref="ConsoleAppender" />
                </Logger>
        
                <!-- Logger de la racine -->
                <Root level="info">
                    <AppenderRef ref="ConsoleAppender" />
                </Root>
            </Loggers>
        </Configuration>

Dans cet exemple :

* La classe com.example.MyClass a un niveau de log DEBUG.
* Toutes les autres classes ont un niveau de log INFO.