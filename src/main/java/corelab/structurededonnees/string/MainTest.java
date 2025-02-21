package corelab.structurededonnees.string;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "[    D01234567    ]";
		String sansEspaces = str.replaceAll(" ", "");
		System.out.println("Chaines sans espaces : " + sansEspaces);
	}

}
