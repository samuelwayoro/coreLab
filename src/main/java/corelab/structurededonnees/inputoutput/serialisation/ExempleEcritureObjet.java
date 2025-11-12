package corelab.structurededonnees.inputoutput.serialisation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.List;

public class ExempleEcritureObjet {

    private static final Logger LOG = LogManager.getLogger(ExempleEcritureObjet.class);

    public static void main(String[] args) throws RuntimeException {

        //exemple écriture de l'objet Person
        Person p1 = new Person("Alice", 25);

        ecrireUnObjet(p1);

        Test t = new Test("ok");
        //ecrireUnObjet(t); //lève une exception, car Test n'implémente pas Serializable

        //exemple d'ecriture dune liste de personnes
        List<Person> personList = Arrays.asList(new Person("Alice", 12), new Person("Bob", 15), new Person("Albert", 51));

        ecritureListeObjets(personList);

    }

    /**
     * Principe d'écriture d'un objet :
     * <p>
     * 1- Dans un try with resources, Ouverture d'un flux d'écriture sur un fichier avec une instance
     * de ObjectOutputStream couplet d'un FileOutputStream (ayant ou non son chemin complet)
     * <p>
     * 2- Ecriture de l'objet dans le fichier
     * <p>
     * NB :
     * 1- L'objet à écrire dans le fichier doît obligatoirement implémenter l'interface Serializable (sinon lève java.io.NotSerializableException:)
     * 2- Ne pas oublier de terminer le code en catchant l'exception
     */

    public static void ecrireUnObjet(Object o) {

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("src/main/java/corelab/structurededonnees/inpuoutput/data/ecrireUnObjet.dat"))) {

            outputStream.writeObject(o);
            LOG.info("Objet sauvegardé avec succès !");

        } catch (IOException e) {
            LOG.info("une erreur est survenue {} ", e.getMessage());
        }
    }

    /**
     * Ecriture d'une liste d'objet (même procédé que l'écriture d'un seul objet)
     *
     * @param liste
     * @param <T>
     */

    public static <T> void ecritureListeObjets(List<T> liste) {

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("src/main/java/corelab/structurededonnees/inpuoutput/data/listeObjets.dat"))) {

            //1ere possibilité : écriture en vrac
            outputStream.writeObject(liste);

            //2ème possibilité : écriture avec une boucle
            /*
            for (Object o : liste){
                outputStream.writeObject(o);
            }
             */

            LOG.info("fin d'écriture de la liste d'objets ...");
        } catch (IOException e) {
            LOG.info("erreur lors de l'écriture d'une liste d'objets : {}", e.getMessage());
        }

    }
}
