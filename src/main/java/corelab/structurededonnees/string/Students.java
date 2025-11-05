package corelab.structures_de_donnees.string;

import java.util.Objects;

public class Students {
	
	private Long id;
	private String nom;
	
	
	
	public Students(Long id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, nom);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Students other = (Students) obj;
		return Objects.equals(id, other.id) && Objects.equals(nom, other.nom);
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", nom=" + nom + "]";
	}
	
	

}
