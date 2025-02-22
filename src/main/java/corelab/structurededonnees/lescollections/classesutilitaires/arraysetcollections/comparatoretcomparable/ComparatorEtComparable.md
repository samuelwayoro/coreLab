#### 🚀<font color=red> LES INTERFACES Comparable et Comparator </font>

#### COMPARABLE

##### 🎁 <font color=red> Définition </font>

C'est une interface dans le paquetage <i>java.lang</i> qui permet à une classe de définir un ordre naturel pour ses
objets.
Elle contient une seule méthode : <b> int compareTo (T o)</b>.

##### 🚀 <font color=red> Signature </font>

        public interface Comparable<T>{

            int compareTo(T o);
        }

<b> retourne : </b>

* < 0 si l'objet courant est "moins que" l'objet passé en paramètre
* = 0 si égaux
* <b> > 0 </b> si l'objet courant est "plus grand que".

##### 🎯 <font color=red> Quand utiliser l'interface Comparable ? </font>

* Quand tu veux que les objets de ta classe aient un ordre "intrinsèque" ou "par défaut". Par exemple ordre alphabétique
  pour des chaînes, ordre numérique pour des entiers.

* Par exemple les classes String, Date, Integer implémentent Comparable.

##### 🚑 <font color=red> Exemple  </font>  Voir la classe ExempleComparable.java

##### 🔚 <font color=red> EN résumé </font>

Utilise Comparable si ta classe a une logique de tri "évidente" et unique qui sera utilisée partout (exemple : un numéro
d'ID, un nom).

****

#### COMPARATOR

##### 🎁 <font color=red> Définition </font>

C'est une interface dans <i>java.util</i> qui permet de définir un <b>ordre externe</b> ou personnalisé pour comparer
deux objets.
Elle contient une méthode principale : int compare(T t1,T t2);

##### 🚀 <font color=red> Signature </font>

        public interface Comparator<T>{

            int compareTo(T t1,T t2);
        }

<b> retourne : </b>

* < 0 si t1 est "moins que" t2
* = 0 si égaux
* <b> > 0 </b> si t1 est "plus grand que" t2 

##### 🎯 <font color=red> Quand utiliser l'interface Comparator ? </font>

* Quand tu veux trier des objets selon différents critères ou un ordre qui n'est pas naturel.

* Quand tu ne veux pas, tu ne peux pas, modifier la classe d'origine pour implémenter Comparable.

* Idéal pour des tris flexibles ou temporaires.

##### 🚑 <font color=red> Exemple </font> Voir la classe ExempleComparator.java

##### 🔚 <font color=red> EN résumé </font>

Utilise Comparator pour des tris spécifiques (exemple : sur des propriétés de la classe) surtout quand tu
travailles avec des classes que tu ne contrôles pas.


****

✅ <font color=gold> DIFFERENCE CLES </font>

| Critère                                         | Comparable                           | Comparator                          |
|-------------------------------------------------|--------------------------------------|-------------------------------------|
| <font color=red> Paquetage </font>              | java.lang                            | java.util                           |
| <font color=red> Méthode </font>                | CompareTo(T o)                       | compare(T o1, T o2)                 |
| <font color=red> Ou est défini ? </font>        | Dans la classe elle-même             | En dehors, comme objet séparé       |
| <font color=red> Ordre </font>                  | Naturel (unique par classe)          | Personnalisé (multiple possible)    |
| <font color=red> Modification de classe </font> | ✅ Oui : doit implémenter l'interface | ❌ Non , indépendant de la classe    |
| <font color=red> Usage typique </font>          | Collections.sort(liste)              | Collections.sort(liste, comparator) |


#### ❗ <font color=gold> QUAND CHOISIR QUOI ?  </font>

*  <b>Utilise Comparable : </b> 
    
      * Si l'ordre logique universel pour ta classe (exemple : une classe Produit triée par prix).
      * Si tu veux que sort fonctionne sans argument supplémentaire.

* <b> Utilise Comparator : </b>

   * Si tu as besoin de plusieurs façons de trier (exemple sur les différentes propriétés de la classe)
   * SI tu travailles sur des classes tierces ou sans accès au code source
   * Avec des API modernes comme Stream : liste.stream().sorted(comparator).

#### 🎁 <font color=gold> ASTUCE BONUS  </font>

Depuis java 8, Comparator a des méthodes statiques, qui rendent le code encore plus propre et pratiques comme : Comparator.comparing() : 

      Comparator<Personne> parNom = Comparator.comparing(Personne::getNom);
      Collections.sort(liste,parNom);

