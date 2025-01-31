package coreLab.structure_de_donnees.lesexceptions.introduction;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionExample {
    public static void main(String[] args) throws FileNotFoundException {

        /*
         * Exemple de gestion d'un checkexception de type FileNotFoundException
         * qui est levée quand on essai de lire un fichier qui est intrové
         */
        try {
            //bon chemin du fichier
            //FileReader fileReader = new FileReader("src/coreLab/structure_de_donnees/lesexceptions/introduction/fichier.txt");

            //mauvais chemin, juste pour le test
            FileReader fileReader = new FileReader("srcs/coreLab/structure_de_donnees/lesexceptions/introduction/fichier.txt");

            System.out.println("fichier trouvé");
        } catch (FileNotFoundException e) {
            //une fois "catché" on peut se permettre de lancer une RuntimeException avec throw
            throw new RuntimeException(e);

            //OU afficher le message de l'exception
            //System.out.println(e.getMessage());

            //OU écrire directement dans la console avec un logger
            //System.out.println("fichier non trouvé");
        }
    }
}
