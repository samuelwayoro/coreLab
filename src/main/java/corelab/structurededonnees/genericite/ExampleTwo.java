package corelab.structurededonnees.genericite;

public class ExampleTwo<T> {
	
	private T a ;
	private T b;
	
	public ExampleTwo(T a, T b) {
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
