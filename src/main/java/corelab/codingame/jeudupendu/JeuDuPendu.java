package corelab.codingame.jeudupendu;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class JeuDuPendu {

    /***
     * 1- Créer la liste de mots et la remplir (10 mots)
     * 2- Coder la méthode permettant de tirer au pif un des mots parmi les 10
     * 3- Créer une copie du mot selectionné dans un tableau de caractère affichant des tirets à la place
     * 4- coder le process de demande des caractères à l'utilisateur dans une boucle en décrémentant son nbre de vie
     *    à chaque tour de jeu (quand il trouve ou même quand il perd)
     * 5- afficher le score du joueur à la fin (bravo quand il a gagné ou game over si il a perdu , avec le mot )
     *
     */

    public static final List<String> mots = List.of("merci", "bonjour", "manger", "dormir", "courir", "travailler", "conduire", "déjeuner", "parler", "travailler");
    private static final Logger logger = LogManager.getLogger(JeuDuPendu.class);
    private static final Scanner sc = new Scanner(System.in);

    public static void pendu() {

        boolean inGame = true;
        int life = 10;
        int noEmptiesCase;
        Character[] wordGame = motsChoisi(mots);

        Character[] resultWord = new Character[wordGame.length];
        Arrays.fill(resultWord, '_');

        String userWord;
        char c;

        logger.info("*** BIENVENUE DANS LE JEU DU PENDU , LEU JEU CONSISTE A TROUVER LE MOT MYSTERE EN TROUVANT TOUTES SES LETTRES : ***");
        logger.info("**** LE MOT A DEVINER CONTIENT {} LETTRES ****", wordGame.length);

        //System.out.print(Arrays.toString(resultWord));
        //System.out.println();

        while (inGame) {

            while (life > 0 && (Arrays.asList(resultWord).contains('_'))) {

                noEmptiesCase = 0;
                logger.info("Entrer un caractère pour trouver tout le mot");


                userWord = sc.nextLine();
                c = userWord.charAt(0);
                life--;

                logger.info("vous avez saisi la lettre :  {}", c);

                if (Arrays.asList(wordGame).contains(c)) {

                    for (int i = 0; i < wordGame.length; i++) {
                        if (wordGame[i].equals(c)) {
                            if (resultWord[i].equals('_')) {
                                noEmptiesCase++;
                                resultWord[i] = c;
                                logger.info("**** BRAVO LE MOT CONTIENT  {} FOIS CETTE LETTRE :)    ****  ", noEmptiesCase);

                            } else {
                                logger.info("--- BRAVO , MAIS VOUS AVEZ DEJA TROUVER CETTE LETTRE ----");
                            }

                        }
                    }

                    if (Arrays.asList(resultWord).contains('_'))
                        logger.info("résultat en cours  : {} | RESTE VIE {} ", Arrays.toString(resultWord), life);

                } else {
                    logger.info("**** DESOLE LE MOT NE CONTIENT PAS CETTE LETTRE , SAISISSEZ UNE AUTRE LETTRE :(  | RESTE VIE {} **** ", life);
                }


                if (life == 0 || (!Arrays.asList(resultWord).contains('_'))) {
                    inGame = false;
                    String w = String.copyValueOf(Arrays.toString(wordGame).toCharArray());
                    logger.info("**** GAME OVER | VOUS AVEZ PERDU :( LE MOT ETAIT : {}", w);

                    logger.info("**** FIN DU JEU **** ");
                }

            }


        }

    }

    public static Character[] motsChoisi(List<String> words) {

        Random random = new Random();
        int index = random.nextInt(0, words.size());
        String theWord = words.get(index);
        Character[] theWordCharacters = new Character[theWord.length()];
        for (int i = 0; i < theWord.length(); i++) {
            theWordCharacters[i] = theWord.charAt(i);
        }


        /**
         * logger.info("mot sélectionné : {} ", theWord);
         *
         *         logger.info("tableau de caractères constitué :");
         *         for (Character c : theWordCharacters) {
         *             logger.info("{}", c);
         *         }
         */




        return theWordCharacters;
    }


    public static void main(String[] args) {

        pendu();

    }


}
