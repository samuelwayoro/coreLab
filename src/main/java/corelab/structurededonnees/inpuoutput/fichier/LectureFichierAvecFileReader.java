package corelab.structures_de_donnees.inpuoutput.fichier;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileReader;
import java.io.IOException;

public class LectureFichierAvecFileReader {

    private static final Logger LOG = LogManager.getLogger(LectureFichierAvecFileReader.class);

    public static void main(String[] args) {

        String nomFichier = "src/main/java/corelab/structurededonnees/inpuoutput/data/donnees.txt";

        try (FileReader fr = new FileReader(nomFichier)) {

            int caractere;

            while ((caractere = fr.read()) != -1) {
                LOG.info((char) caractere);
            }

        } catch (IOException e) {
            LOG.error("erreur lors de la lecture du fichier {}", e.getMessage());
        }

    }
}
