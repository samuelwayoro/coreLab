package corelab.codingame.jeudemorpion;

import static corelab.codingame.jeudemorpion.StringConstants.LINE_SEPARATOR;
import static corelab.codingame.jeudemorpion.StringConstants.SPACE;

/****
 * le jeu en lui-même est un tableau à deux dimensions
 * qui représente le dammier sur lequel les joueurs selectionnent
 * les cellules dans lesquelles ils décident de jouer.
 *
 * l'affichage est amélioré grâce à la méthode toString() qui utilise la classe StringBuilder pour une meilleure concatenation
 */
public class Morpion {

    private char[][] grid = new char[][]{
            {'.', '.', '.'},
            {'.', '.', '.'},
            {'.', '.', '.'}
    };


    @Override
    public String toString() {
        final var builder = new StringBuilder();

        builder.append("Grille du jeu").append(LINE_SEPARATOR);
        for (char[] lines : grid) {
            for (char cell : lines) {
                builder.append(SPACE).append(cell).append(SPACE);
            }
            builder.append(LINE_SEPARATOR);
        }

        return builder.toString();
    }

    /***
     * permet de poser la saisie du joueur
     * dans la saisie du damier
     * à l'aide d'un algo raffiné : (saisi joueur -1)/3 pour le row et (saisi joueur -1)% 3 pour la cellule
     * saisie joueur -1 : car les cellules du tableau sont numéroté en allant de 0
     * /3 (division entière : quotient euclidien de la division) et %3(modulo : reste de la division entière) parce qu'on a un tableau de trois lignes et 3 colones.
     *
     * Exemple : inputUser (saisi joueur) est = 6, on aura :
     *      row = (6-1)/3 = 2
     *
     * @param player
     * @param inputUser
     */
    public void processInput(Player player, int inputUser) {

        var row = (inputUser - 1) / 3;
        var column = (inputUser - 1) % 3;

        if (grid[row][column] == '.') {
            if (player.equals(Player.FIRST))
                grid[row][column] = 'x';
            else
                grid[row][column] = 'o';
        }

    }

    /***
     * permet de verifier la victoire d'un joueur :
     * ** sur toute une ligne ou,
     * ** sur toute une colonne ou,
     * ** sur la diagonale de la droite vers la gauche ou l'inverse.
     * @return
     */
    public boolean winCheck() {
        //sur la même ligne ou colonne
        for (int i = 0; i < 3; i++) {
            //sur la ligne
            var checkLine = grid[i][0] == grid[i][1] && grid[i][1] == grid[i][2] && grid[i][2] != '.';
            //sur la colonne
            var checkColumn = grid[i][0] == grid[1][i] && grid[1][i] == grid[2][i] && grid[2][i] != '.';

            if (checkLine || checkColumn)
                return true;
        }

        //sur les diagonales
        var checkLeftToRightDiagonal = grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2] && grid[2][2] != '.';
        var checkRightToLeftDiagonal = grid[0][2] == grid[1][1] && grid[1][1] == grid[2][0] && grid[2][0] != '.';

        if (checkLeftToRightDiagonal || checkRightToLeftDiagonal)
            return true;

        return false;
    }

    /***
     * Vérificateur de match null :
     *** il y a match null lorsqu'il n'y a plus de cellule contenant '.' dans tout le damier
     * @return
     */
    public boolean checkDraw() {
        for (char[] row : grid) {
            for (char cell : row) {
                if ('.' == cell)
                    return false;
            }
        }
        return true;
    }
}
