package coreLab.core.versionjava;

public class Main {

	public static void main(String[] args) {
		String welcome = """
				My Super App - Copyright KooR.fr
				Usage: [options] SuperApp param1 param2
				    -h      display this help
				    -x      imagine a parameter
				""";
		String autreTest = """
				Un nouveau contenu de test
				""";

		String json = """
				{
					"name":"Sam",
					"age":"35",
					"cars":{
						"car1":"Ford",
						"car2":"BMW",
						"car3":"Fiat"
					}
				}
				""";

		System.out.print(json);

		// La suite du programme

	}

}
