package corelab.structures_de_donnees.programmationfonctionnelle.lesinterfacesfonctionnelles;

@FunctionalInterface
public interface VerificateurPair {
	/**
	 * méthode abstraite obligatoire
	 * @param nombre
	 * @return
	 */
	boolean estPair(int nombre);
	
}
