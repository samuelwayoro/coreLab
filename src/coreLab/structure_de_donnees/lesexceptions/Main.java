package coreLab.structure_de_donnees.lesexceptions;

public class Main {

	public static void main(String[] args) {

		try {

			int dividByZero = 5 / 1;
			System.out.println("resultat de la division  " + dividByZero);
			System.out.println("instruction suite à la division");

		} catch (ArithmeticException e) {
			e.printStackTrace();
		}finally {
			System.out.println("instruction dans le finally...");
		}
		System.out.println("suite du programme...");
	}

}
