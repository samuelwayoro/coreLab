### LES DATES

Quand on rentre dans le sujet des "dates" en informatique, il y a un certains nombres de problèmes à résoudre.

Prenons l'exemple du décalage d'une heure lors du passage à l’heure d’été/hiver. On pourrait dire que l'on peut simplement modifier le champ "heure" d'un objet de type "Date".

Cette approche intuitive amène à la réalité à des bidouilles et la même opération doit être refaite à chaque changement d'heure. Bonne nouvelle, il existe des représentations des "dates" bien plus efficaces. Dans cette leçon, commençons pas décrire les différentes notions dont nous allons avoir besoin dans ce chapitre.


<font color=red> <b>L'UTC : Temps Coordonné Universel </b></font>

Comme son nom l'indique, l'UTC nous permet d'avoir une référence universelle du "temps".

Une date "UTC" nous permet de définir un point de référence sur lequel tous les programmes peuvent se baser sans ambiguïté. Exemple :

<font color=red> <b>2007-12-31 23:59:59.000 UTC </b></font>

Par ailleurs, les UTC correspondent à l'heure de Londres.

<font color=red> <b>L'heure locale  </b></font>

Quand un utilisateur va regarder l'heure sur une application d'horloge, il obtient une heure locale. Il s'agit en fait d'une représentation de l'UTC dans un calendrier et un fuseau horaire particulier.

<font color=red> <b>Représenter des instants : l'heure Unix </b></font>

En informatique, nous avons besoin de référencer des points précis dans le temps. Exemples :

* Dernière date de modification d'un fichier
* Heures de début/fin d'une réunion
* À quel moment un mail a été envoyé
  
Pour représenter ces instants, nous utilisons les timestamps. Un timestamp Unix ou Epoch Unix représente le nombre de 
millisecondes écoulées depuis le 1.1.1970 UTC à minuit. Cette date représente un peu l'an 0 de l'informatique.

Copie limitée, attention la copie privée des cours est protégée par le droit d'auteur.

<font color=red> <b>Les calendriers  </b></font>

Pour la logique interne d'un logiciel, l'utilisation des timestamps est très efficace. À l'inverse, se servir des timestamps pour afficher un instant à l'utilisateur est une mauvaise idée.

En effet, la phrase suivante est incompréhensible :

"Retrouvons-nous à la gare à 1 095 379 201".

Pour résoudre ce problème, il faut que nos programmes soient capables de convertir des timestamps en des formats de dates lisibles par l'homme. C'est pourquoi nous utilisons des calendriers.

Dans le monde occidental, nous utilisons le calendrier grégorien. Celui-ci définit 12 mois de différentes durées et prend en compte une année bissextile tous les 4 ans (la règle exacte est un peu plus complexe !).


<font color=red> <b>Calendriers et fuseaux horaires </b></font>

Un calendrier définit des dates.

Sans calendrier, le "25 décembre 2022" n’a aucune signification. C'est trop ambigu !

Un calendrier n’est correctement défini qu’avec une position géographique. C’est particulièrement évident au jour de l’an où chaque pays lance des feux d’artifice : ces lancements s’étendent sur 24 heures.

Parlons donc des fuseaux horaires. Le fuseau principal permettant de définir tous les autres est nommé Greenwich Mean Time (GMT) et survole l’Angleterre. C’est le fuseau utilisé pour l’UTC.

Tous les autres fuseaux sont définis par des « décalages » par rapport au GMT. Les fuseaux de l’est ont des décalages positifs, les zones de l’ouest des décalages négatifs.

Convertir une date entre fuseaux est simple :

18:00 GMT = 18:00+00:00 = 19:00+01:00 = 17:00-01:00