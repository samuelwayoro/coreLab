package corelab.structurededonnees.inputoutput.ziperdeziper;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.util.Strings;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class CompresserZip {

    private static final Logger LOG = LogManager.getLogger(CompresserZip.class);

    public static void main(String[] args) {

        //test creation d'une seule archive

        String fichierSource = "D:\\IntelliJJavaProject\\coreLab\\src\\main\\java\\corelab\\structurededonnees\\inputoutput\\data\\donnees.txt";
        String fichierZip = "D:\\IntelliJJavaProject\\coreLab\\src\\main\\java\\corelab\\structurededonnees\\inputoutput\\data\\monDossierZip.zip";

        //LOG.info("le nom du fichier {}", fichierSource);
        //creerUneArchive(fichierSource, fichierZip);

        //teste creation de plusieurs archives

        String repertoire = "D:\\IntelliJJavaProject\\coreLab\\src\\main\\java\\corelab\\structurededonnees\\inputoutput\\data\\";
        String dossierZip = Strings.concat(repertoire, "dossier.zip");

        archiverPlusieursFichiers(repertoire, dossierZip);

    }

    private static void archiverPlusieursFichiers(String chemin, String cheminDossierZipper) {

        try (Stream<Path> files = Files.list(Paths.get(chemin));
             ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(cheminDossierZipper));
        ) {
            //files.forEach(x -> LOG.debug(x));//debug

            //recup des chemins pour lecture individuelle
            List<Path> filesPaths = files.toList();
            byte[] buffer = new byte[1024];
            int byteLus;

            for (Path path : filesPaths) {

                String curentFile = path.toFile().getPath();
                LOG.info("path courrant : {}", path);
                LOG.info("fichier courrant {}", path.toFile().getName());

                if (!(curentFile.endsWith(".zip"))) {

                    try (FileInputStream fis = new FileInputStream(curentFile)) {

                        ZipEntry zipEntry = new ZipEntry(path.toFile().getName());
                        zos.putNextEntry(zipEntry);

                        while ((byteLus = fis.read(buffer)) != -1) {
                            zos.write(buffer, 0, byteLus);
                        }
                        LOG.info("fichier {} archivé avec succès ", curentFile);
                    } catch (IOException e) {
                        LOG.info("erreur {} ", e.getMessage());
                    }

                }

            }
            LOG.info("ARCHIVAGE DU DOSSIER {} TERMINE !!!", cheminDossierZipper);
        } catch (IOException e) {
            LOG.info("erreur {} ", e.getMessage());
        }
    }

    /**
     * ------PRINCIPE-----
     * 1- Avoir un fichier source à zipper
     * 2- Avoir le nom du fichier zip final
     * 3- Ouvrir Des flux sur les fichiers dans un try with resources (pour la fermeture automatique des flux ouvert)
     * ouverture en lecture du fichier source et en écriture du fichier zip avec la classe ZipOutputStream
     * 4- Dans le corps du try
     * créer une entrée Zip (new ZipEntry) sur le fichier source et l'ajouter dans le fichier zippé grâce au flux en écriture
     * copie le contenu du fichier source dans le ZIP (avec une boucle)
     * 5-Fermer l'entrée zip
     * ------------------------
     *
     * @param fichierSource
     * @param fichierZip
     */
    private static void creerUneArchive(String fichierSource, String fichierZip) {

        File file = new File(fichierSource);

        try (FileInputStream fis = new FileInputStream(fichierSource);
             ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(fichierZip));
        ) {

            //creation du zip entry AVEC UNIQUEMENT LE NOM DU FICHIER suivi de sa compression à l'intérieur du zip
            ZipEntry zipEntry = new ZipEntry(file.getName());
            zos.putNextEntry(zipEntry);

            //copier du fichier source dans l'archive zip
            byte[] buffer = new byte[1024];
            int bytesLus;

            while ((bytesLus = fis.read(buffer)) != -1) {
                zos.write(buffer, 0, bytesLus);
            }

            LOG.info("Archivage terminé avec succès !");

        } catch (IOException e) {
            LOG.info("une erreur est survenue pendant l'archivage du fichier : {}", e.getMessage());
        }


    }
}
