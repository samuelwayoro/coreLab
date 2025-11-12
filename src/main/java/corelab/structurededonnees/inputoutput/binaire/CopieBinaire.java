package corelab.structurededonnees.inputoutput.binaire;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopieBinaire {
    private static final Logger LOG = LogManager.getLogger(CopieBinaire.class);

    public static void main(String[] args) {

        String fichierSource = "C:\\Users\\Samuel\\Downloads\\Java-Logo.jpg";

        String fichierCopie = "src/main/java/corelab/structurededonnees/inpuoutput/data/copie-Java-Logo.jpg";

        copie(fichierSource, fichierCopie);


        LOG.info("copie volumineuse : ");

        String source = "C:\\Users\\Samuel\\Downloads\\BR02510181485498.pdf";

        String destination = "src/main/java/corelab/structurededonnees/inpuoutput/data/copie-pdf.jpg";

        largeCopy(source, destination);

    }

    /**
     * PRINCIPE :
     * <p>
     * 1- Ouvrir le fichier source en lecture avec un objet : FileInputStream
     * et le fichier destination en écriture avec un objet FileOutputStream dans un try with resources
     * <p>
     * 2- Lire octet par octet la source à partir d'une variable de type int dans une boucle tant que c'est différent de -1
     * <p>
     * 3- Ecrire chaque octet dans le fichier destination à partir de l'objet FileOutputStream
     *
     * @param source
     * @param destination
     */
    public static void copie(String source, String destination) {

        try (
                FileInputStream inputStream = new FileInputStream(source);
                FileOutputStream outputStream = new FileOutputStream(destination)
        ) {
            int octet;

            while ((octet = inputStream.read()) != -1) {
                outputStream.write(octet);
            }
            LOG.info("copie terminée ! ");

        } catch (IOException e) {
            LOG.info("Erreur lors de la copie  {}", e.getMessage());
        }


    }

    /***
     * Même principe que la copie octet/octet sauf utilisation d'une variable de type tableau de byte en tant que
     * paramètre de la méthode .read() de l'objet FileInputStream, pour augmenter l'espace de lecture d'octets
     * pour une lecture plus volumineuse.
     * Ce tableau de byte est aussi utilisé pour l'envoi des données lue(s) dans le flux.
     *
     * @param source
     * @param destination
     */

    public static void largeCopy(String source, String destination) {

        byte[] buffer = new byte[1024];
        int nbOctetLus;

        File file = new File(source);

        try (
                FileInputStream inputStream = new FileInputStream(file.getName());
                FileOutputStream outputStream = new FileOutputStream(destination);
        ) {

            while ((nbOctetLus = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, nbOctetLus);
            }

            LOG.info("copie volumineuse terminée !");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
