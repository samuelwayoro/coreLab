#### <font color=red>LES RECORDS </font>

Les Records sont une fonctionnalité introduite dans Java 14
et officiellement stabilisé dans Java 16.
Ils simplifient la création de classe immuable,
c'est-à-dire dont les champs ne peuvent être modifiés
après leur initialisation, et qui sont principalement
utilisés pour transporter des données.

Il s'agit d'une nouvelle manière de définir une classe contenant des champs immuables appelés :
components (composants).
Les records permettent de réduire le code répétitif (boilerplate en anglais), comme les getters,
setters, les méthodes equals();hashcode() et toString().

🔥<font color=red>SYNTAX DE BASE DE RECORD</font>

    public record recordName(type componentName1, type componentName2){}

<b> Exemple: définition d'un record nommé Point ayant deux components x et y de type entier.</b>

    public record Point(int x, int y){}

Cela génère automatiquement une classe avec :

* Deux champs privés immuables x et y.
* Un constructeur public.
* Des méthodes d'accès (x() correspondant à getX() et y() correspondant à getY())
* Des implémentations de toString(), equals() et hashCode().

<b>Exemple : voir la classe MainTest.java</b>

🔥 <font color=red>Pourquoi utiliser les Record ?</font>

* <font color=red> Simplicité : </font>Moins de code à écrire et à maintenir.
* <font color=red> Lisibilité : </font>Le but de la classe est clair dès sa déclaration.
* <font color=red> Sécurité : </font>En étant immuables, les records sont naturellement thread-safe.

🔥 <font color=red>FONCTIONNALITES DES RECORDS</font>

<font color=red> 1. Immutabilité</font> les champs d'un record sont déclarés automatiquement : 
<font color="red">" private final"</font>. Cela garanti que les valeurs ne peuvent pas être modifiés après l'instanciation.

<font color=red>2. Equivalence et hachage</font> Les records <font color=red>fournissent automatiquement des
implémentations
des méthodes equals() et hashCode() basées sur les champs.</font>

<font color=red>3. Destructuration simplifiée </font>Vous pouvez accéder facilement aux valeurs des champs grâce aux
méthodes
d'accès générées.

🔥<font color=red> LIMITATION DES RECORD </font>

<font color=red>1. Pas d'héritage</font> Un record ne peut pas étendre une autre classe, mais il peut implémenter
des interfaces.

<font color=red>2. Immutabilité strict</font> Les champs ne peuvent pas être modifiés après instanciation.

<font color=red>3. Pas de champs supplémentaires</font> Tous les champs doivent être déclarés dans la signature du
record.

🔥<font color=red> POSSIBILITE D'AJOUT DE METHODE SUPPLEMENTAIRES </font>

<b> exemple 1 : Implémentation d'une interface et rajout d'une méthode supplémentaire dans le Record Circle.</b>

<b>exmeple 2 : Ajout d'un constructeur personnalisé et implémentation d'une interface dans le Record Rectangle.
<font color=red> NB : le nouveau controller rajouté ne doit pas avoir d'arguments.</font></b>