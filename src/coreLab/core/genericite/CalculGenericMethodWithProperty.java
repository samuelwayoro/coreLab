package coreLab.core.genericite;

/**
 * la classe CalculGenericMethodWithProperty<U> est une classe générique avec un seul paramètre <U> 
 * et qui contient une méthode générique <T> boolean compare(Ta , T b)
 * NB : les paramètres U et T sont différents ils peuvent ne pas être identique
 * @param <U>
 */
public class CalculGenericMethodWithProperty<U> {
	
	private U prop;
	
	public CalculGenericMethodWithProperty(U prop) {
		super();
		this.prop = prop;
	}

	public <T> boolean compare(T a , T b ) {
		return a.equals(b);
	}

	public U getProp() {
		return prop;
	}

	public void setProp(U prop) {
		this.prop = prop;
	}
	
	

}
