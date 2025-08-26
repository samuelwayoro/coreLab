package corelab.structurededonnees.genericite;

/**
 * La classe traitement est une classe générique,
 * qui n'utilise pas n'importe qu'elle type,
 * mais uniquement une classe T fille de la classe Produit.
 * @param <T>
 */
public class Traitement<T extends Produit> {
	
	private T a;
	private T b;
	
	public Traitement(T a, T b) {
		super();
		this.a = a;
		this.b = b;
	}
	public T getA() {
		return a;
	}
	public void setA(T a) {
		this.a = a;
	}
	public T getB() {
		return b;
	}
	public void setB(T b) {
		this.b = b;
	}
	
	

}
