package coreLab.structure_de_donnees.lesexceptions.le_bloc_try_catch_finally;

public class Quizz {

    public static void main(String[] args) {

        System.out.printf(quiz());
    }


    /**
     * NE JAMAIS UTILISER DE RETURN
     * DANS UN TRY CATCH,
     * car seulement celui dans le finally s'exécutera.
     *
     * @return
     */
    static String quiz() {
        try {
            return "try";
        } catch (Exception e) {
            return "catch";
        } finally {
            return "finally";
        }
    }
}
