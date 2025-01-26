package coreLab.structure_de_donnees.lesexceptions;

public class Main {

	public static void main(String[] args) {

		try {

			int dividByZero = 5 / 0;
			System.out.println("resultat de la division  " + dividByZero);
			System.out.println("instruction suite à la division");

		} catch (ArithmeticException e) {
			System.out.println("trace de printStackTrace()*** : ");
			//e.printStackTrace();//affiche le printstacktrace en ROUGE :)

            //affichage de l'exception jetée en rouge
            //throw new ArithmeticException();

			//System.out.println("trace de getMessage()***");
			//System.out.println(e.getMessage());

		}finally {
			System.out.println("instruction dans le finally...");
		}
		System.out.println("suite du programme...");
	}

}
