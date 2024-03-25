package coreLab.core.genericite;

public class TestMethodeGenerique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] tabInt = {4,100,5,25,70};
		System.out.println(getElementAleatoire(tabInt)); //genere un nombre aléatoire contenu dans le tableau d'entier tabInt
		
		String[] tabString = {"Samuel","Wayoro","Badobré","Blaise"};
		System.out.println(getElementAleatoire(tabString));
	}
	/**
	 * méthode qui retourne un élément aléatoire d'un tableau donné en paramètre 		
	 * @param <T>
	 * @param genericTab
	 * @return un générique défini au moment de l'instanciation
	 */
	public static <T> T getElementAleatoire(T[] genericTab) {
		if(genericTab.length == 0 || genericTab == null) {
			return null;
		}
		//on generère un indice aléatoire du tableau et on y recupère l'élément 
		int indice = (int) (Math.random()*genericTab.length);
		return genericTab[indice];
	}

}
