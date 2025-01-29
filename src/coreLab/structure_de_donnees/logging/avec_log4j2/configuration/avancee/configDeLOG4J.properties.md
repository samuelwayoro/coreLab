#### <font color=red> CONFIGURATION AVANCEE DE LOG4J DANS UN FICHIER .properties  </font>

Il est possible de définir des niveaux de configuration à un ou plusieurs loggers plutôt qu'à l'ensemble des 
loggers à la fois dans log4j.properties.

<b> Exemple : Ici, nous configurons les loggers par package. Cela permet de changer le niveau de sévérité de 
certaines classes seulement, ou même les appenders comme nous allons le voir maintenant. </b>

    
    appender.console.type = Console
    appender.console.name = consoleLogger
    appender.console.layout.type = PatternLayout
    appender.console.layout.pattern = %d{yyyy-MM-dd HH:mm:ss} %-5p %c{1}:%L - %m%n
    
    loggers=com.dyma.app,com.other
    
    logger.com.dyma.app.name=com.dyma.app
    logger.com.dyma.app.level=error
    logger.com.dyma.app.appenderRef.stdout.ref=consoleLogger
    
    logger.com.other.name=com.other
    logger.com.other.level=debug
    logger.com.other.appenderRef.stdout.ref=consoleLogger