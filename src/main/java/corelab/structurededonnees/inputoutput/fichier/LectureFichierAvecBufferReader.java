package corelab.structurededonnees.inputoutput.fichier;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LectureFichierAvecBufferReader {

    private static final Logger LOG = LogManager.getLogger(LectureFichierAvecBufferReader.class);

    public static void main(String[] args) throws RuntimeException {

        //le nom du fichier à lire
        String fichier = "src/main/java/corelab/structurededonnees/inpuoutput/data/donnees.txt";

        //try-with-resources : ferme automatiquement le flux après le bloc try
        try (BufferedReader lecteur = new BufferedReader(new FileReader(fichier))) {

            String ligne;

            //lire chaque ligne jusqu'à la fin du fichier (null)
            while ((ligne = lecteur.readLine()) != null) {
                LOG.info(ligne); // Affiche la ligne
            }

        } catch (IOException e) {
            LOG.error("Erreur lors de la lecture du fichier {}", e.getMessage());
        }

    }

}
