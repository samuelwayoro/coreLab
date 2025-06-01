#### <font color=red> LES LIST  </font>

Une LIST est une <font color=red>collection qui préserve l'ordre d'insertion d'éléments et peux contenir des 
doublons.</font><b>Contrairement aux Sets, une List conserve l'ordre d'insertion des éléments et permet d'accéder aux éléments via leur
indice (comme un tableau dynamique).</b>

<font color=red> A RETENIR </font>: 
Collection ordonnnée de données, respectant l'ordre d'insertion et acceptant les doublons et implémentées par les classes :
ArrayList , LinkedList, Vector.

#####  🚀 <font color=red> Principales caractéristiques d'une List :</font>

🔥 <b> 1. Les éléments sont ordonnés : </b>
Les éléments sont stockés dans l'ordre ou ils ont été ajoutés.

🔥 <b> 2. Les éléments sont indexés :</b> 
Accès direct aux éléments via leurs indices (list.get(index))

🔥 <b> 3. Autorise les doublons :</b>
Un même élément peut être ajouté plusieurs fois.


#####  🚀 <font color=red> Implémentations courantes de List en Java :</font>

* <font color=red>ArrayList : </font> Basé sur un tableau dynamique<b> rapide en accès (get()) mais lent pour 
les insertions/suppression au milieu. Idéal pour les lists souvent lu</b>.


* <font color=red>LinkedList : </font> Basé sur une liste chaînée, <b>rapide pour les insertions/suppressions (addFirst(),
remove())</b> mais plus lent en accès aléatoire.<b> utiles pour les files (queues) ou piles (stacks)</b>.


* <font color=red>Vector : </font> Comme ArrayList mais synchronisé (utilisé pour des applications multithread, mais rarement
préféré aujourd'hui).

Exemple d'utilisation (voir classe ExempleList).

🎯 <b> QUAND UTILISER UNE LIST ? </b>

🔥 <font color=red> ArrayList : </font> Si tu as beaucoup d'accès en lecture, mais peu d'insertion/suppression.

🔥 <font color=red> LinkedList : </font> Si tu dois souvent insérer/supprimer des éléments surtout au début ou au milieu.

🔥 <font color=red>Vector : </font> Si tu as besoin d'une liste synchronisée 
(mais généralement <b> Collections.synchronizedList(new ArrayList<>()) est préféré)</b>.


🚀 <b>METHODES COURAMMENT UTILISEES </b>

* <b>.get(index)</b> : récupéré un élément à partir de son index
* <b>.set(index,valeur)</b> : modifier un élément à partir de son indice
* <b>.add() </b>: ajouter un nouvel élément 
* <b>.subList(beginIndex,endIndex) </b> : obtenir une sous liste de la liste débutant à l'index 
beginIndex inclus et endIndex exclus.


👉 <b> RESUME </b>

Les listes : 

* conservent l'ordre d'insertion
* autorisent les doublons 
* permettent l'accès aux données (éléments) par index
* sont rapides en accès en lecture (get()) 

Les Lists sont idéales pour stocker des éléments avec un ordre et pour accéder rapidement à ces éléments par leur indice.

🏁 Le choix entre <b> ArrayList</b> et <b>LinkedList</b> dépend des besoins :

* <font color=red> ArrayList est plus rapide pour l'accès aux éléments </font>
* <font color=red> LinkedList est plus rapide pour les insertions/suppressions fréquentes.</font>