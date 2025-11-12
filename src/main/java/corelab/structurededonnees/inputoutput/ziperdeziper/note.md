
🔥 <font color = red><b>ZIPPER ET DEZIPPER AVEC JAVA </b></font>

🥇 <font color=green> <b> ZIPPER </b> </font>

Zipper signifie compresser un fichier ou le(s) rassembler dans une archive ZIP.

C'est une compétence très utile pour : 

* sauvegarder plusieurs fichiers ensemble (régrouper dans un conteneur unique .zip)
* réduire la taille des données (pour qu'il prenne moins de place)
* préparer des exports ou des backups.

En java, cela se fait avec des packages java.util.zip, qui permet de manipuler : 

- des fichiers zip (format très courant)
- des fichiers GZIP (plus compact, mais un seul fichier à la fois)

💡 <b> <font color=red>  Comment archiver un zip avec java ? </font></b>

Java fournit deux classes clés : 

* <b><font color=red>ZipOutputStream</font></b> : pour créer un fichier .zip 
* <b><font color=red>ZipInputStream</font></b> : pour lire/extraire un fichier .zip 

<b><font color=green>Exemple : </font> compresser un fichier .zip dans la classe CompresserZip</b>

🥈 <font color=green> <b> DEZIPPER </b> </font>

Pour dézipper (décompresser) un fichier .zip, on utilise <b>ZipInputStream</b> : 

<b><font color=green>Exemple : </font> </b>
Ce code parcours toutes les entrées ZIP et les recrée dans un dossier de sortie. 

    import java.io.*;
    import java.util.zip.ZipEntry;
    import java.util.zip.ZipInputStream;
    
    public class ExtraireArchive {

        public static void main(String[] args) {
        String fichierZip = "archive_multiple.zip";
        String dossierDestination = "sortie/";

            try (ZipInputStream zis = new ZipInputStream(new FileInputStream(fichierZip))) {
                ZipEntry entree;
                byte[] buffer = new byte[1024];
    
                // Parcourt chaque entrée du zip
                while ((entree = zis.getNextEntry()) != null) {
                    System.out.println("Extraction : " + entree.getName());
    
                    File nouveauFichier = new File(dossierDestination + entree.getName());
                    // Crée le dossier de sortie s’il n’existe pas
                    new File(nouveauFichier.getParent()).mkdirs();
    
                    FileOutputStream fos = new FileOutputStream(nouveauFichier);
                    int bytesLus;
                    while ((bytesLus = zis.read(buffer)) != -1) {
                        fos.write(buffer, 0, bytesLus);
                    }
                    fos.close();
                    zis.closeEntry();
                }
    
                System.out.println("Extraction terminée !");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

