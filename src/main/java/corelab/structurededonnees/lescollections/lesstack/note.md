#### 🌟 <font color=red>LES STACK (hérite de Vector) :</font>

<b>Classe générique qui étend Vector et fournit les opérations LIFO de base.</b> 

#### 🎯 <font color=red> QUAND UTILISER ? : </font>

* Parcours d'arbres ou de graphes DFS
* Pile d'appels (simulateurs,machines à états)
* Vérification de parenthèses ou expressions bien formées.
* Algo de parsing ou d'évaluation d'expressions (comme les notations postfixées.).

#### 📚 <font color=red> IMPLEMENTATIONS</font>

Stack est une classe générique qui étend Vector et fournit les opérations LIFO de base.

<b>METHODES : </b>

- push( E item)  : Ajoute un élément au sommet de la pile 
- pop() : Retire et retourne l'élément du sommet 
- peek() : Retourne l'élément du sommet sans le retirer
- empty() : vérifie si la pile est vide 
- search(Object o) : retourne la position (1-based) d'un element dans la pile, sinon-1.

