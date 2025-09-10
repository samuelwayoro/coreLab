#### <font color = red> LES TABLEAUX </font>

<b>En java un tableau est une structure de données contenant un groupe d'éléments tous du même type, avec des adresses
consecutives
dans la mémoire. un tableau à un nombre fixe d'éléments et il est impossible de changer sa taille.</b>

<b><font color=green> TABLEAU MULTI-DIMENSIONNELS </font></b>

Il est également possible d'avoir des tableaux de N dimensions, sans limite particulière (en dehors de la mémoire).

Les exemples suivants montrent comment définir des tableaux de N dimensions.

    // Exemples de déclarations
    int[] entiers;
    int[][] entiers2; // 2 dimensions
    int[][][] entiers3; // 3 dimensions
    
    // Exemples d'instanciation et initialisation 
    entiers = new int[]{1, 2, 1};
    entiers2 = new int[][]{ {3, 2, 1}, {1, 3, 2}, {1, 1, 4} };
    var entiers3 = new int[][][]{
    { {1, 2, 3}, {4, 5, 6} },
    { {7, 8, 9} },
    { {10, 11, 12}, {13, 14, 15} },
    };

Il n'est pas commun de dépasser 3 dimensions pour des tableaux ou des collections (voir même 2).

<b><font color=green> LECTURE DE TABLEAU  </font></b>

Il est possible de lire une valeur particulière du tableau à 3 dimensions précédemment déclaré :

    System.out.println(entiers3[1][0][1]); //affiche 8

Dans ce cas, on accède au deuxième élément de la première dimension, puis au premier élément de la seconde dimension et
enfin à la deuxième position de la troisième dimension. Cette lecture correspond à la valeur 8 du tableau.

<b><font color=green> ÉCRITURE DANS UN TABLEAU  </font></b>

De la même manière, il est possible de changer la valeur d'une position en particulier dans le tableau :

    entiers3[1][0][1] = 20;

Dans ce cas, la valeur de la position choisie du tableau passe de 8 à 20.

<b><font color=green> ITERATION SUR TABLEAU  </font></b>

Toujours en travaillant sur le même tableau, il est possible d'itérer sur toutes les valeurs de toutes les dimensions de
la manière suivante :

    for (int[][] premiereDimension : entiers3) {
        for (int[] deuxiemeDimension : premiereDimension) {
            for (int troisiemeDimension : deuxiemeDimension) {
                System.out.println(troisiemeDimension);
            }
        }
    }

Ce bloc de code va afficher successivement toutes les valeurs du tableau.

❗ <i style="color:red"> Point d'attention : L'imbrication d'un grand nombre de boucles peut induire des problèmes de
performances
applicatives si le jeu de données parcouru comporte un grand nombre d'éléments.</i>

<b><font color=green> TABLEAUX ET NULL  </font></b>

<b>Tableaux natifs </b>

Il n'est pas possible d'ajouter des valeurs null dans un tableau natif :

    var liste = new int[]{1,1,1,null}; //pas possible 

Cette ligne de code provoque une erreur de compilation, car la valeur null n'est pas autorisée. En effet, les types
natifs
ne peuvent pas contenir de référence donc null, est interdit.

<b><font color=green> TABLEAUX D'OBJETS  </font></b>

Aucune restriction quand on travaille avec des objets.

    var listes = new String[]{"jd","iod",null};