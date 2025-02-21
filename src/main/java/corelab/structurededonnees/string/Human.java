package corelab.structurededonnees.string;

public abstract class Human {
	
	private int age;
	private String nom;
	private String prenoms;
	
	public Human() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Human(int age, String nom, String prenoms) {
		super();
		this.age = age;
		this.nom = nom;
		this.prenoms = prenoms;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenoms() {
		return prenoms;
	}
	public void setPrenoms(String prenoms) {
		this.prenoms = prenoms;
	}
	
	
	
}
