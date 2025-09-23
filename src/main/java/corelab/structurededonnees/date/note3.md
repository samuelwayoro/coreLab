### L'API Date and Time de Java 8

<font color=red> <b>Présentation de l'API Date and Time</b></font>

Le support de la gestion des : Date et Calendar présenté précédament comporte les désavantages suivants :

* Leur utilisation n'est pas simple 
* ils ne sont immuables donc pas thread-safe 
* les objets encapsulent obligatoirement la date et l'heure
* le mois est numéroté de 0 à 11 ce qui n'est pas intuitif 
* SimpleDateFormat n'est pas thread-safe non plus 

Pour pallier ces problèmes, il est préférable de se baser sur les classes de java.time.* disponibles depuis Java 1.8 : l'API Date and Time. Celle-ci offre à l'inverse les avantages suivants :

* Utilisation simple et intuitive 
* Supporte plus de fonctionnalités : date, heure, intervalle de temps, calendrier, fuseau et décalage horaire,
...
* immutabilité donc thread-safe : la plupart des principaux objets sont immuables.

Note : Il faut considérer que du code existant dans certains projets se basent encore sur les classes Date et Calendar, 
il est donc important de connaître leur fonctionnement également.

<font color=red> <b>Les classes de java.time.* </b></font>

Ce doc n'est pas exhaustif sur l'API Date and Time mais il vise à présenter les classes les plus utiles.

<font color=red> <b>La classe Instant : </b></font>

Elle permet l'encapsulation d'un timestamp : 

    var epoch = Instant.EPOCH; //représente 1970-01-01T00:00:00Z
    var instant = Instant.now(); // représente la date actuelle 

De nombreuses méthodes sont disponibles pour manipuler ces timestamps comme des méthodes de comparaisons (isBefore, isAfter, ...).

<font color=red> <b>La classe LocalDate : </b></font>

La classe LocalDate encapsule de manière immuable une date sous la forme d'une année, d'un mois et d'un jour dans le calendrier ISO sans fuseau horaire :

    LocalDate dateNow = LocalDate.now();
    LocalDate date = LocalDate.of(2014, Month.DECEMBER, 25);

Comme elle ne possède pas de fuseau horaire, elle ne représente pas un point dans le temps.

<font color=red> <b>La classe LocalTime : </b></font>

La classe LocalTime encapsule de manière immuable une heure (heure, minute, seconde, nanoseconde) sans fuseau horaire :

    LocalTime timeNow = LocalTime.now();
    LocalTime time = LocalTime.of(12, 32, 22, 24);

<font color=red> <b>La classe LocalDateTime : </b></font>

La classe LocalDateTime encapsule de manière immuable une date (année, mois, jour) et une heure (heure, minute, seconde, nanoseconde) sans fuseau horaire :

    LocalDateTime dateTimeNow = LocalDateTime.now();
    LocalDateTime dateTime = LocalDateTime.of(2014, Month.DECEMBER, 25, 12, 32, 22, 23);

<font color=red> <b>Les dates avec fuseaux et décalages horaires  </b></font>
