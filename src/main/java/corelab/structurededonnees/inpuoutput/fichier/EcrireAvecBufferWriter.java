package corelab.structurededonnees.inpuoutput.fichier;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;

public class EcrireAvecBufferWriter {


    private static final Logger LOG = LogManager.getLogger(EcrireAvecBufferWriter.class);


    public static void main(String[] args) {

        ecrireAvecbuffer("src/main/java/corelab/structurededonnees/inpuoutput/data/sortieAvecBufferWriter.txt");

    }

    /** Principe :
     *  1- Avoir le fichier ou écrire (chemin complet)
     *  2- Ouvrir un flux en écriture sur ce fichier, avec FileWriter en paramètre de l'instance de BufferReader (le tout dans un try with resources)
     *     qui se termine par un catch d'exception probable
     *
     * @param fichier
     */

    public static void ecrireAvecbuffer(String fichier){

        try(BufferedWriter bufferedReader = new BufferedWriter(new FileWriter(fichier))) {

            bufferedReader.write("Première ligne");
            bufferedReader.newLine();
            bufferedReader.write("Deuxième ligne");
            bufferedReader.newLine();

            LOG.info("Fichier écrit avec BufferWriter");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
