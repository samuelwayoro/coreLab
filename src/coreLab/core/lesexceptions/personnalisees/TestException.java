package coreLab.core.lesexceptions.personnalisees;

public class TestException {

	static void check(int number) throws InvalidException {
		if (number < 20) {
			throw new InvalidException("nombre pas valide");
		} else {
			System.out.println("nombre superieur a 20 , donc valide");
		}
	}

	public static void main(String[] args) {

		try {
			check(15);
		} catch (InvalidException e) {
			System.out.println("Une exception s'est produite " + e);
		}

	}

}
