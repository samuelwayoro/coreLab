package coreLab.core.genericite;

public class ExempleOne<T> {
	T valeur ; //utilisation du type <T> comme type de la propriété valeur 
	
	//constructeur 
	
	public ExempleOne(T defaut) {
		valeur = defaut;
	}
	
	//getter et setter 
	
	public void affecter(T nouveau) {
		valeur = nouveau;
	}
	
	public T lire() {
		return this.valeur;
	}
}

