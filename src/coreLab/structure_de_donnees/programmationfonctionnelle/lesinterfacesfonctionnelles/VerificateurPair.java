package coreLab.structure_de_donnees.programmationfonctionnelle.lesinterfacesfonctionnelles;

@FunctionalInterface
public interface VerificateurPair {
	/**
	 * méthode abstraite obligatoire
	 * @param nombre
	 * @return
	 */
	public boolean estPair(int nombre);
	
}
