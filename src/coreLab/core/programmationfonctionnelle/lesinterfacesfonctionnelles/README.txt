**INTERFACES FONCTIONNELLES**

Une interface fonctionnelle est une interface Java qui doit obligatoirement posseder une et une
seule méthode abstraite (méthode sans implémentation). 

Elle peut avoir plusieurs méthodes statiques ,mais la caractéristique
principale est cette unique méthode abstraite.

Elle est annotée avec @FunctionalInterface pour signaler au compilateur de vérifier sa validité . 

A chaque fois que nous utilisons une expression lambda ou une référence de méthode , nous implémentons
en fait une interface fonctionnelle.