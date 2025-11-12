package corelab.structures_de_donnees.inpuoutput.sortiestandard;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Exemple {

    private static final Logger logger = LogManager.getLogger(Exemple.class);


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //lire depuis le clavier

        logger.info("Entrez votre nom : ");

        String nom = sc.nextLine(); //lit une ligne du texte

        logger.info("Bonjour {} !",nom);

        sc.close(); //bonne pratique, fermer le scanner

    }



}
