package corelab.structurededonnees.inpuoutput.serialisation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class ExempleLectureObjet {

    private static final Logger LOG = LogManager.getLogger(ExempleLectureObjet.class);

    public static void main(String[] args) {

        //fichier a lire
        String fichier = "src/main/java/corelab/structurededonnees/inpuoutput/data/ecrireUnObjet.dat";

        lectureObjet(fichier);

        String leFichier = "src/main/java/corelab/structurededonnees/inpuoutput/data/listeObjets.dat";

        lectureListeObjets(leFichier);
    }


    /**
     * PRINCIPE :
     * ----------
     * 1- Avoir le fichier à lire
     * 2- Ouvrir un flux en lecture avec ObjectInputStream dans un try with resource
     * 3- Instancier un Objet du type de la class attendu qui reçoit le resultat de la lecture du fichier avec
     * l'instance de : inputStream.readObject() le tout casté.
     *
     * @param nomFichier
     */
    public static void lectureObjet(String nomFichier) {

        LOG.info("lecture du fichier {}", nomFichier);

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(nomFichier))) {
            Person p = (Person) inputStream.readObject();
            LOG.info(" objet lu depuis le fichier {} ", p);
        } catch (IOException | ClassNotFoundException e) {
            LOG.info("erreur lors de la récuperation d'objet dans le fichier {} ", e.getMessage());
        }

        LOG.info("fin de lecture du contenu du fichier ...!");
    }


    /**
     * PRINCIPE
     * --------
     * Même principe, récuperation d'une liste suite à la lecture du fichier (List<T>)
     * <p>
     * NB : on arrête cette boucle quand on a un objet null récupéré en lecture.
     *
     * @param nomFichier
     */
    public static void lectureListeObjets(String nomFichier) {
        LOG.info("lecture du contenu du fichier : {} ", nomFichier);
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(nomFichier))) {

            List<Person> personList = (List<Person>) inputStream.readObject();
            //parcours de cette liste récupérée
            for (Person p : personList) {
                LOG.info("objet récuperée : {}", p);
            }
            LOG.info("fin de lecture du fichier ...");
        } catch (IOException | ClassNotFoundException e) {
            LOG.info("erreur lors de la lecture du fichier {}", e.getMessage());
        }
    }


}
