package corelab.structurededonnees.inpuoutput.fichier;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EcrireAvecPrintWriter {

    private static final Logger LOG = LogManager.getLogger(EcrireAvecPrintWriter.class);

    public static void main(String[] args) {

        //ecrire dans un fichier, en l'écrasant à chaque execution
        ecrireDansFichier();

        //écrire à la ligne dans un fichier, sans l'écraser
        ecrireAlaFinDunFichier();

    }

    /***
     * 1- Avoir le chemin complet du fichier dans lequel ecrire, dans un objet String.
     *
     * 2- Ouvrir un flux en écriture sur ce fichier, dans un Try With Resources (qui ferme automatiquement le fichier après usage),
     *      à partir de la classe FileWriter en tant que paramètre dans ce cas-ci à une instance de PrintWriter
     *
     * 3- Ecrire dans le fichier avec l'objet printWriter
     *
     * 4- Ne jamais oublier de Catcher le(s) probable exception(s)
     * (Capture les erreurs (par ex. dossier non existant, permissions, etc.).
     *
     */
    public static void ecrireDansFichier() {

        //fichier de sortie
        String fichierDeSortie = "src/main/java/corelab/structurededonnees/inpuoutput/data/sortieAvecWriters.txt";

        try (PrintWriter writer = new PrintWriter(new FileWriter(fichierDeSortie,true))) {

            //écriture dans le fichier
            writer.println("Bonjour le monde !");
            writer.println("Ceci est une ligne écrite dans un fichier ");
            writer.println("java facilite l'écriture de texte.");

            LOG.info("Écriture terminé avec succès .");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Même principe, sauf l'activation du "append" à true dans le FileWriter qui n'écrase pas le fichier, mais écrit
     * à la fin du fichier à chaque fois.
     */
    public static void ecrireAlaFinDunFichier() {


        String sortie = "src/main/java/corelab/structurededonnees/inpuoutput/data/sortieAvecWriterAppend.txt";

        //new FileWriter("....txt", true) → le true signifie ajout au lieu d’écrasement.
        try (PrintWriter writer = new PrintWriter(new FileWriter(sortie,true))) {

            writer.println("Nouvelle entrée : " + java.time.LocalDateTime.now());
            LOG.info("Ligne ajoutée !");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
